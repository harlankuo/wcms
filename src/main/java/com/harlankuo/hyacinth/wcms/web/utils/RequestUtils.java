package com.harlankuo.hyacinth.wcms.web.utils;

import java.io.File;
import java.io.IOException;
import java.util.Enumeration;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.beanutils.ConvertUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.math.NumberUtils;
import org.springframework.util.Assert;

import com.harlankuo.hyacinth.wcms.model.SysUser;
import com.harlankuo.hyacinth.wcms.web.utils.PropertyFilter.MatchType;

/**
 * 用于处理HTTP请求的工具类
 *
 * @author
 */
public class RequestUtils {
    //保存当前会话的用户信息，方便提取
    private final static ThreadLocal<SysUser> users = new ThreadLocal<SysUser>();

    /**
     * 在用户登录成功之后，把用户信息设置到当前对象中
     * @param u02
     */
    public static void begin(SysUser user) {
        users.set(user);
    }

    /**
     * 在用户登出或者session失效之后，自动清除里面保存的对象
     */
    public static void end() {
        users.remove();
    }

    /**
     * 在用户登录成功之后，把用户信息设置到当前对象中
     */
    public static SysUser get() {
        return users.get();
    }

    /**
     * 获取当前用户ID
     * @return
     */
    public static int getUserId() {
    	SysUser user = get();
        return user.getUserId();
    }

    /**
     * 按属性条件列表创建Criterion数组,辅助函数.
     */
    public static String buildFilter(final List<PropertyFilter> filters) {
        StringBuilder sb = new StringBuilder();
        if (null != filters && filters.size() > 0) {
            for (PropertyFilter filter : filters) {
                if (sb.length() > 0) {
                    sb.append(" and ");
                }
                if (!filter.hasMultiProperties()) { // properNameName中只有一个属性的情况.
                    sb.append(buildProperty(filter.getPropertyName(), filter.getMatchValue(),
                            filter.getMatchType()));
                } else {// properName中包含多个属性的情况,进行or处理.
                    sb.append(" ( ");
                    for (String param : filter.getPropertyNames()) {
                        sb.append(buildProperty(param, filter.getMatchValue(), filter.getMatchType())).append(" or ");
                    }
                    sb.append(" ) ");
                }
            }
        }
        // 如果存在查询条件，则增加where到查询语句
        if (sb.length() > 0) {
            sb.insert(0, " where ");
        }
        return sb.toString();
    }

    /**
     * 根据变量名、对应值和对应关系生成SQL语句
     *
     * @param pName
     * @param pValue
     * @param matchType
     * @return
     */
    public static StringBuilder buildProperty(final String pName, final Object pValue,
                                              final MatchType matchType) {
        Assert.hasText(pName, "pName不能为空");
        StringBuilder sb = new StringBuilder();
        sb.append(pName);
        if (MatchType.EQ.equals(matchType)) {
            sb.append("='").append(pValue).append("'");
        } else if (MatchType.LIKE.equals(matchType)) {
            sb.append(" like ").append("'%").append(pValue).append("%'");
        } else if (MatchType.LT.equals(matchType)) {
            sb.append("<'").append(pValue).append("'");
        } else if (MatchType.LE.equals(matchType)) {
            sb.append("<='").append(pValue).append("'");
        } else if (MatchType.GT.equals(matchType)) {
            sb.append(">'").append(pValue).append("'");
        } else if (MatchType.GE.equals(matchType)) {
            sb.append(">='").append(pValue).append("'");
        }
        return sb;
    }

    /**
     * 取得带相同前缀的Request Parameters.
     * <p/>
     * 返回的结果的Parameter名已去除前缀.
     */
    @SuppressWarnings("unchecked")
    public static Map<String, Object> getParametersStartingWith(ServletRequest request, String prefix) {
        Assert.notNull(request, "Request must not be null");
        Enumeration paramNames = request.getParameterNames();
        Map<String, Object> params = new TreeMap<String, Object>();
        if (prefix == null) {
            prefix = "";
        }
        while (paramNames != null && paramNames.hasMoreElements()) {
            String paramName = (String) paramNames.nextElement();
            if ("".equals(prefix) || paramName.startsWith(prefix)) {
                String unprefixed = paramName.substring(prefix.length());
                String[] values = request.getParameterValues(paramName);
                if (values == null || values.length == 0) {
                    // Do nothing, no values found at all.
                } else if (values.length > 1) {
                    params.put(unprefixed, values);
                } else {
                    params.put(unprefixed, values[0]);
                }
            }
        }
        return params;
    }

    /**
     * 获取客户端IP地址，此方法用在proxy环境中
     *
     * @param req
     * @return
     */
    public static String getRemoteAddr(HttpServletRequest req) {
        String ip = req.getHeader("X-Forwarded-For");
        if (StringUtils.isNotBlank(ip)) {
            String[] ips = StringUtils.split(ip, ',');
            if (ips != null) {
                for (String tmpip : ips) {
                    if (StringUtils.isBlank(tmpip))
                        continue;
                    tmpip = tmpip.trim();
                    if (isIPAddr(tmpip) && !tmpip.startsWith("10.")
                            && !tmpip.startsWith("192.168.")
                            && !"127.0.0.1".equals(tmpip)) {
                        return tmpip.trim();
                    }
                }
            }
        }
        ip = req.getHeader("x-real-ip");
        if (isIPAddr(ip))
            return ip;
        ip = req.getRemoteAddr();
        if (ip.indexOf('.') == -1)
            ip = "127.0.0.1";
        return ip;
    }

    /**
     * 判断是否为搜索引擎
     *
     * @param req
     * @return
     */
    public static boolean isRobot(HttpServletRequest req) {
        String ua = req.getHeader("user-agent");
        if (StringUtils.isBlank(ua))
            return false;
        return (ua != null && (ua.indexOf("Baiduspider") != -1
                || ua.indexOf("Googlebot") != -1 || ua.indexOf("sogou") != -1
                || ua.indexOf("sina") != -1 || ua.indexOf("iaskspider") != -1
                || ua.indexOf("ia_archiver") != -1
                || ua.indexOf("Sosospider") != -1
                || ua.indexOf("YoudaoBot") != -1 || ua.indexOf("yahoo") != -1
                || ua.indexOf("yodao") != -1 || ua.indexOf("MSNBot") != -1
                || ua.indexOf("spider") != -1 || ua.indexOf("Twiceler") != -1
                || ua.indexOf("Sosoimagespider") != -1
                || ua.indexOf("naver.com/robots") != -1
                || ua.indexOf("Nutch") != -1 || ua.indexOf("spider") != -1));
    }

    /**
     * 判断字符串是否是一个IP地址
     *
     * @param addr
     * @return
     */
    public static boolean isIPAddr(String addr) {
        if (StringUtils.isEmpty(addr))
            return false;
        String[] ips = StringUtils.split(addr, '.');
        if (ips.length != 4)
            return false;
        try {
            int ipa = Integer.parseInt(ips[0]);
            int ipb = Integer.parseInt(ips[1]);
            int ipc = Integer.parseInt(ips[2]);
            int ipd = Integer.parseInt(ips[3]);
            return ipa >= 0 && ipa <= 255 && ipb >= 0 && ipb <= 255 && ipc >= 0
                    && ipc <= 255 && ipd >= 0 && ipd <= 255;
        } catch (Exception e) {
        }
        return false;
    }

    /**
     * 获取浏览器提交的整形参数
     *
     * @param param
     * @param defaultValue
     * @return
     */
    public static int getParam(HttpServletRequest req, String param,
                               int defaultValue) {
        return NumberUtils.toInt(req.getParameter(param), defaultValue);
    }

    /**
     * 获取浏览器提交的整形参数
     *
     * @param param
     * @param defaultValue
     * @return
     */
    public static long getParam(HttpServletRequest req, String param,
                                long defaultValue) {
        return NumberUtils.toLong(req.getParameter(param), defaultValue);
    }

    public static long[] getParamValues(HttpServletRequest req, String name) {
        String[] values = req.getParameterValues(name);
        if (values == null)
            return null;
        return (long[]) ConvertUtils.convert(values, long.class);
    }

    /**
     * 获取浏览器提交的字符串参�?
     *
     * @param param
     * @param defaultValue
     * @return
     */
    public static String getParam(HttpServletRequest req, String param,
                                  String defaultValue) {
        String value = req.getParameter(param);
        return (StringUtils.isEmpty(value)) ? defaultValue : value;
    }

    public static String getWebrootPath() {
        String root = RequestUtils.class.getResource("/").getFile();
        try {
            root = new File(root).getParentFile().getParentFile()
                    .getCanonicalPath();
            root += File.separator;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return root;
    }
    
    /**
	 * 获取webapp路径的根目录
	 * 
	 * @param req
	 * @return
	 */
	public static String webRoot() {
		String root = RequestUtils.class.getResource("/").getFile();
		try {
			root = new File(root).getParentFile().getParentFile()
					.getCanonicalPath();
			root += File.separator;
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		return root;
	}
    public static void main(String[] args) {
        try {
            // File f1 = new File("E:/data/wh/tmps");
            // File f2 = new File("E:/data/wh/a");
            //
            // FileUtils.copyDirectory(f1, f2);
            String str = RequestUtils.getWebrootPath();
            System.out.println(str);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("文件已经传输完成");
    }
}

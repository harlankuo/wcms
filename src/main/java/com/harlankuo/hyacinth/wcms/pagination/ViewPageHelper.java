/**
* 项目名:Web内容管理系统
* 包名：com.harlankuo.hyacinth.wcms.utils.pagination
* 文件名：ViewPageHelper.java
* 版本信息：1.0
* 日期：2014年5月5日-上午9:44:18
* 作者：harlankuo
* Copyright (c)2014版权所有--harlankuo
*/
	
package com.harlankuo.hyacinth.wcms.pagination;

import java.util.HashMap;
import java.util.Map;

/**
 * 类名称：ViewPageHelper
 * 类描述：分页辅助类,用于减化Controller中的代码
 * 创建人：harlankuo
 * 修改人：harlankuo
 * 修改时间：2014年5月5日 上午9:44:18
 * 修改备注：@version 1.0.0
 */

public class ViewPageHelper<T> {
	private static final int FIRST_PAGE_VALUE = 1;

    private static final int PREVIOUS_PAGE_VALUE = 2;

    private static final int NEXT_PAGE_VALUE = 3;

    private static final int LAST_PAGE_VALUE = 4;

    private static final int SPECIAL_PAGE_VALUE = 5;

    public static final String FIRST_PAGE = "FIRST_PAGE";

    public static final String PREVIOUS_PAGE = "PREVIOUS_PAGE";

    public static final String NEXT_PAGE = "NEXT_PAGE";

    public static final String LAST_PAGE = "LAST_PAGE";

    public static final String SPECIAL_PAGE = "SPECIAL_PAGE";
    
    /**分页动作参数名**/
    public static final String PAGE_ACTION = "page_action";

    /**分页对象属性名**/
    public static final String SESSION_PAGE = "session_page";
    
    /**页号参数名**/
    public static final String PAGE_NO = "page_no";
    
    private static Map<String,Object> actionMap = new HashMap<String,Object>();
    static {
            actionMap.put(FIRST_PAGE, new Integer(FIRST_PAGE_VALUE));
            actionMap.put(PREVIOUS_PAGE, new Integer(PREVIOUS_PAGE_VALUE));
            actionMap.put(NEXT_PAGE, new Integer(NEXT_PAGE_VALUE));
            actionMap.put(LAST_PAGE, new Integer(LAST_PAGE_VALUE));
            actionMap.put(SPECIAL_PAGE, new Integer(SPECIAL_PAGE_VALUE));
    }
    /**
     * 执行分页动作
     * @param page 分页对象
     * @param action 分页动作参数
     * @param pageIndex 页号
     */
    public static <T> void doAction(ViewPage<T> page, String action, int pageIndex) {
            int actionIndex = 0;
            if (page == null) {
                    throw new NullPointerException("Page对象null");
            }
            if (action == null || "".equals(action)) {
                    throw new IllegalArgumentException("无效的分页动作参数null");
            }
            action = action.toUpperCase();
            if (!actionMap.containsKey(action)) {
                    throw new UnsupportedOperationException("不支持的分页动作参数:" + action);
            }
            Integer index = (Integer) actionMap.get(action);
            actionIndex = index.intValue();
            switch (actionIndex) {
            case FIRST_PAGE_VALUE:
                    page.gotoFirstPage();
                    break;
            case PREVIOUS_PAGE_VALUE:
                    page.gotoPreviousPage();
                    break;
            case NEXT_PAGE_VALUE:
                    page.gotoNextPage();
                    break;
            case LAST_PAGE_VALUE:
                    page.gotoLastPage();
                    break;
            case SPECIAL_PAGE_VALUE:
                    page.gotoPage(pageIndex);
            }
    }
    
    public static <T> void doAction(ViewPage<T> page, String action){
            doAction(page, action, 1);
    }
}

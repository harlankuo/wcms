/**
* 项目名:Web内容管理系统
* 包名：com.harlankuo.hyacinth.wcms.web.utils
* 文件名：AuthorityHelper.java
* 版本信息：1.0
* 日期：2014年4月24日-下午2:00:25
* 作者：harlankuo
* Copyright (c)2014版权所有--harlankuo
*/
	
package com.harlankuo.hyacinth.wcms.web.utils;

/**
 * 类名称：AuthorityHelper
 * 类描述：
 * 创建人：harlankuo
 * 修改人：harlankuo
 * 修改时间：2014年4月24日 下午2:00:25
 * 修改备注：@version 1.0.0
 */

public class AuthorityHelper {
	/**
	 * 判断是否有权限
	 * @param akey
	 * @param session
	 * @return
	 */
	public static boolean hasAuthority(int akey, String rc){
			if(rc==null || "".equals(rc)){
				return false;
			}

			char value = rc.charAt(akey);
			if(value == '1'){
				return true;
			}

			return false;
	}

	/**
	 * 创建权限字符串
	 * @param akeys 有权限的项,比如 1,3,6,11,20
	 * @return 权限字符串, 比如0101001001000000000
	 */
	public static String makeAuthority(String akeys){
		StringBuilder sb = new StringBuilder(_RAW);
		String []akeys_s = akeys.split(",");
		for(String akey: akeys_s){
			if(null == akey || "".equals(akey)){
				continue;
			}
			int ak = Integer.parseInt(akey);
			sb.setCharAt(ak, '1');
		}

		return sb.toString();
	}

	/**
	 * 250个0
	 */
	final public static String _RAW = "0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000";

	final public static String _RAW_ON = "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111";


}

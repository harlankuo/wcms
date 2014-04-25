/**
* 项目名:Web内容管理系统
* 包名：com.harlankuo.hyacinth.wcms.web
* 文件名：ResultTypeEnum.java
* 版本信息：1.0
* 日期：2014年4月24日-上午11:40:54
* 作者：harlankuo
* Copyright (c)2014版权所有--harlankuo
*/
	
package com.harlankuo.hyacinth.wcms.web;

/**
 * 类名称：ResultTypeEnum
 * 类描述：返回给浏览器的结果类型有两种: 传统登录页面或者ajax结果
 * 创建人：harlankuo
 * 修改人：harlankuo
 * 修改时间：2014年4月24日 上午11:40:54
 * 修改备注：@version 1.0.0
 */

public enum ResultTypeEnum {
	//整页刷新
	page,
	//json数据
	json
}

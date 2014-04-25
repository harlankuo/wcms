/**
* 项目名:Web内容管理系统
* 包名：com.harlankuo.hyacinth.wcms.Annotation
* 文件名：Login.java
* 版本信息：1.0
* 日期：2014年4月24日-上午11:43:11
* 作者：harlankuo
* Copyright (c)2014版权所有--harlankuo
*/
	
package com.harlankuo.hyacinth.wcms.Annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;

import com.harlankuo.hyacinth.wcms.web.ResultTypeEnum;

/**
 * 类名称：Login
 * 类描述：建立annotation, 用于标注需要登录检查的spring-mvc方法
 * 创建人：harlankuo
 * 修改人：harlankuo
 * 修改时间：2014年4月24日 上午11:43:11
 * 修改备注：@version 1.0.0
 */

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Login {
	ResultTypeEnum value() default ResultTypeEnum.page;
}

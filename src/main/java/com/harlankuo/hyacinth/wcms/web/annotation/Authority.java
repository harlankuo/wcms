/**
* 项目名:Web内容管理系统
* 包名：com.harlankuo.hyacinth.wcms.Annotation
* 文件名：Authority.java
* 版本信息：1.0
* 日期：2014年4月24日-下午12:00:58
* 作者：harlankuo
* Copyright (c)2014版权所有--harlankuo
*/
	
package com.harlankuo.hyacinth.wcms.web.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.harlankuo.hyacinth.wcms.web.interceptor.AuthorityType;
import com.harlankuo.hyacinth.wcms.web.interceptor.ResultTypeEnum;

/**
 * 类名称：Authority
 * 类描述：
 * 创建人：harlankuo
 * 修改人：harlankuo
 * 修改时间：2014年4月24日 下午12:00:58
 * 修改备注：@version 1.0.0
 */

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Authority {
	AuthorityType[] authorityTypes();
	ResultTypeEnum resultType() default ResultTypeEnum.page;
}

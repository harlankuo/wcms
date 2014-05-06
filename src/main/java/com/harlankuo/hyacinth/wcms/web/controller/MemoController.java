/**
* 项目名:Web内容管理系统
* 包名：com.harlankuo.hyacinth.wcms.web.controller
* 文件名：MemoController.java
* 版本信息：1.0
* 日期：2014年4月24日-下午2:17:44
* 作者：harlankuo
* Copyright (c)2014版权所有--harlankuo
*/
	
package com.harlankuo.hyacinth.wcms.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.harlankuo.hyacinth.wcms.Annotation.Authority;
import com.harlankuo.hyacinth.wcms.Annotation.Login;
import com.harlankuo.hyacinth.wcms.web.interceptor.AuthorityType;
import com.harlankuo.hyacinth.wcms.web.interceptor.ResultTypeEnum;
import com.harlankuo.hyacinth.wcms.web.utils.AjaxResult;

/**
 * 类名称：MemoController
 * 类描述：Login和Authority注解的使用样例，还有AjaxResult的使用
 * 创建人：harlankuo
 * 修改人：harlankuo
 * 修改时间：2014年4月24日 下午2:17:44
 * 修改备注：@version 1.0.0
 */

@Controller("memoController")
@RequestMapping(value = "/memo")
public class MemoController {
	final Logger logger = LoggerFactory.getLogger(getClass());

	/**
	 * @param sentence
	 * @return
	 * @throws Exception
	 */
	@Login(ResultTypeEnum.page)
	@RequestMapping(value = "/doSomeThing_a.spr", method = RequestMethod.GET)
	public ModelAndView doSomeThing_a() throws Exception {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/login.jsp");
		logger.info("doSomeThing_a");
		return mav;
	}
	/**
	 * @param sentence
	 * @return
	 * @throws Exception
	 */
	@Login(ResultTypeEnum.json)
	@RequestMapping(value = "/doSomeThing_b.spr", method = RequestMethod.GET)
	@ResponseBody
	public AjaxResult doSomeThing_b() throws Exception {
		AjaxResult ar = new AjaxResult();
		ar.setResult(false);
		ar.setErrorMessage("操作成功!");
		logger.info(" doSomeThing_b ");
		return ar;
	}

	/**
	 * @param sentence
	 * @return
	 * @throws Exception
	 */
	@Login()
	@Authority(authorityTypes=AuthorityType.SALES_ORDER_CREATE)
	@RequestMapping(value = "/doSomeThing_c.spr", method = RequestMethod.GET)
	public ModelAndView doSomeThing_c() throws Exception {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/mg/userIndex");
		logger.info(" doSomeThing_c ");
		mav.addObject("opmsg", "调用成功!");
		return mav;
	}

	/**
	 * @param sentence
	 * @return
	 * @throws Exception
	 */
	@Login()
	@Authority(authorityTypes=AuthorityType.SALES_ORDER_FIND)
	@RequestMapping(value = "/doSomeThing_d.spr", method = RequestMethod.GET)
	public ModelAndView doSomeThing_d() throws Exception {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/mg/userIndex");
		logger.info(" doSomeThing_d ");
		mav.addObject("opmsg", "调用成功!");
		return mav;
	}

	/**
	 * @param sentence
	 * @return
	 * @throws Exception
	 */
	@Login(ResultTypeEnum.json)
	@Authority(authorityTypes=AuthorityType.SALES_ORDER_CREATE, resultType=ResultTypeEnum.json)
	@RequestMapping(value = "/doSomeThing_e.spr", method = RequestMethod.GET)
	@ResponseBody
	public AjaxResult doSomeThing_e() throws Exception {
		AjaxResult ar = new AjaxResult();
		ar.setResult(false);
		ar.setErrorMessage("操作成功!");
		logger.info(" doSomeThing_e ");
		return ar;
	}

	/**
	 * @param sentence
	 * @return
	 * @throws Exception
	 */
	@Login(ResultTypeEnum.json)
	@Authority(authorityTypes=AuthorityType.SALES_ORDER_FIND, resultType=ResultTypeEnum.json)
	@RequestMapping(value = "/doSomeThing_f.spr", method = RequestMethod.GET)
	@ResponseBody
	public AjaxResult doSomeThing_f() {
		AjaxResult ar = new AjaxResult();
		ar.setResult(false);
		ar.setErrorMessage("操作成功!");
		logger.info(" doSomeThing_f ");
		return ar;
	}

}

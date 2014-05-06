/**
* 项目名:Web内容管理系统
* 包名：com.harlankuo.hyacinth.wcms.web.controller
* 文件名：LoginController.java
* 版本信息：1.0
* 日期：2014年4月22日-下午2:38:04
* 作者：harlankuo
* Copyright (c)2014版权所有--harlankuo
*/
	
package com.harlankuo.hyacinth.wcms.web.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import com.alibaba.fastjson.JSON;
import com.harlankuo.hyacinth.wcms.Annotation.Login;
import com.harlankuo.hyacinth.wcms.entity.ReturnValue;
import com.harlankuo.hyacinth.wcms.exception.BusinessException;
import com.harlankuo.hyacinth.wcms.exception.SystemException;
import com.harlankuo.hyacinth.wcms.model.SysUser;
import com.harlankuo.hyacinth.wcms.service.SysUserService;
import com.harlankuo.hyacinth.wcms.web.interceptor.ResultTypeEnum;
import com.harlankuo.hyacinth.wcms.web.utils.SessionHelper;

/**
 * 类名称：LoginController
 * 类描述：
 * 创建人：harlankuo
 * 修改人：harlankuo
 * 修改时间：2014年4月22日 下午2:38:04
 * 修改备注：@version 1.0.0
 */
@Controller
@RequestMapping("/")
@SessionAttributes(SessionHelper.UserHandler)
public class LoginController {
	
	@Inject
	private SysUserService<SysUser> sysUserService;
	
	@RequestMapping("/")
    public String Home() {
        return "login";
    }
	@RequestMapping("/login")
    public String Home1() {
        return "login";
    }
	
	@RequestMapping(value="/login2",method=RequestMethod.POST)
	@ResponseBody
	public String Login(SysUser sysUser) throws BusinessException {
		ReturnValue returnValue=new ReturnValue();
		try{
			if(sysUserService.Login(sysUser)){
				ModelMap modelMap =new ModelMap();
				modelMap.addAttribute(SessionHelper.UserHandler, sysUser);
				returnValue.setSuccess(true);
				returnValue.setUrl("admin/index");
				returnValue.setMessage("登录成功！");
				returnValue.setDataMap(null);
				returnValue.setError("");
			}else{
				returnValue.setSuccess(false);
				returnValue.setUrl("login");
				returnValue.setMessage("用户名和密码不正确！");
				returnValue.setDataMap(null);
				returnValue.setError("");
			}
		}catch(Exception e){
			returnValue.setSuccess(false);
			returnValue.setUrl("login");
			returnValue.setMessage("出错了。。。");
			returnValue.setDataMap(null);
			returnValue.setError(e.getMessage());
		}
		return JSON.toJSONString(returnValue);
	}
	
	@Login(ResultTypeEnum.page)
	@RequestMapping(value="/logout")
	public String Logout(SessionStatus sessionStatus, ModelMap modelMap) throws BusinessException {
		modelMap.remove(SessionHelper.UserHandler);
		sessionStatus.setComplete();
		return "redirect:login";
	}
	
	@RequestMapping(value = "/SystemException")
	public void TestSystemException() {
		throw new SystemException("this is system error ");
	}

	/**
	 * @throws com.harlankuo.hyacinth.wcms.exception.BusinessException
	 * 
	 */
	@RequestMapping(value = "/BusinessException")
	public void TestBusinessException() throws BusinessException {
		throw new BusinessException("this is Business error ");
	}
}

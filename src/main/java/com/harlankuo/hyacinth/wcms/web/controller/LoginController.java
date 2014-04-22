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

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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
public class LoginController {
	
	@RequestMapping("/")
    public String Login() {
        return "login";
    }
	@RequestMapping("/login")
    public String Login1() {
        return "login";
    }
}

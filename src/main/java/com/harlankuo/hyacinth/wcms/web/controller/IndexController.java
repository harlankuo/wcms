package com.harlankuo.hyacinth.wcms.web.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.alibaba.fastjson.JSON;
import com.harlankuo.hyacinth.wcms.Annotation.Login;
import com.harlankuo.hyacinth.wcms.entity.ReturnValue;
import com.harlankuo.hyacinth.wcms.web.ResultTypeEnum;
import com.harlankuo.hyacinth.wcms.web.utils.SessionHelper;


@Controller
@RequestMapping("/admin")
@SessionAttributes(SessionHelper.UserHandler)
public class IndexController {
	
	@RequestMapping(value="/index")
	@Login(ResultTypeEnum.page)
    public String index() {
        return "index";
    }
	
}

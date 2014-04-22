package com.harlankuo.hyacinth.wcms.web.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/admin")
public class IndexController {
	
	@RequestMapping("/index")
    public String index1() {
        return "index";
    }
	
}

package com.harlankuo.hyacinth.wcms.web.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.servlet.ModelAndView;

import com.harlankuo.hyacinth.wcms.Annotation.Login;
import com.harlankuo.hyacinth.wcms.model.SysUser;
import com.harlankuo.hyacinth.wcms.utils.pagination.ViewPage;
import com.harlankuo.hyacinth.wcms.utils.pagination.ViewPageHelper;
import com.harlankuo.hyacinth.wcms.web.interceptor.ResultTypeEnum;
import com.harlankuo.hyacinth.wcms.web.pagination.SysUserPagination;
import com.harlankuo.hyacinth.wcms.web.utils.SessionHelper;

@Controller
@RequestMapping("/admin")
@SessionAttributes(SessionHelper.UserHandler)
public class IndexController {

	@Resource(name="sysUserPagination")
	private SysUserPagination<SysUser> sysUserPagination;
	
	@RequestMapping(value = "/index")
	@Login(ResultTypeEnum.page)
	public String index() {
		return "index";
	}

	@RequestMapping(value = "/pagination")
	@Login(ResultTypeEnum.page)
	public ModelAndView listInfo(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		String pageAction = ServletRequestUtils.getStringParameter(request,
				ViewPageHelper.PAGE_ACTION);
		Integer pageIndex = ServletRequestUtils.getIntParameter(request,
				ViewPageHelper.PAGE_NO);
		// 声明分页对象
		ViewPage<SysUser> userPage = (ViewPage<SysUser>) request.getSession()
				.getAttribute(ViewPageHelper.SESSION_PAGE);
		SysUser sysUser = (SysUser)request.getSession().getAttribute(SessionHelper.UserHandler);
		// 第一次请求
		if (pageAction == null || userPage == null) {
			// 构建一个新的分页对象
			userPage = sysUserPagination;
			// 设置分页大小
			userPage.setPageSize(sysUser, 4);
		} else {

			if (ViewPageHelper.SPECIAL_PAGE.equals(pageAction)) {
				// 如果页数为空，则默认为1
				if (pageIndex == null)
					pageIndex = new Integer(1);
				ViewPageHelper.doAction(userPage, pageAction,
						pageIndex.intValue());
			} else {
				ViewPageHelper.doAction(userPage, pageAction);
			}
		}
		//从分页对象中获得当前页数据
		System.out.println(SysUser.class.newInstance().getUserIsdelete());
        List<SysUser> userInfoList = userPage.getPageData(sysUser);
        ModelAndView mav = new ModelAndView("index");
        mav.addObject("userInfoList", userInfoList);
        request.getSession().setAttribute(ViewPageHelper.SESSION_PAGE, userPage);
        return mav;
		//return "index";
	}
}

/**
* 项目名:Web内容管理系统
* 包名：com.harlankuo.hyacinth.wcms.web.controller
* 文件名：CaptchaController.java
* 版本信息：1.0
* 日期：2014年5月6日-下午5:52:22
* 作者：harlankuo
* Copyright (c)2014版权所有--harlankuo
*/
	
package com.harlankuo.hyacinth.wcms.web.controller;

import java.awt.image.BufferedImage;
import java.util.HashMap;

import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.google.code.kaptcha.impl.DefaultKaptcha;
import com.harlankuo.hyacinth.wcms.web.ReturnValue;

/**
 * 类名称：CaptchaController
 * 类描述：
 * 创建人：harlankuo
 * 修改人：harlankuo
 * 修改时间：2014年5月6日 下午5:52:22
 * 修改备注：@version 1.0.0
 */
@Controller
@RequestMapping(value="captcha")
public class CaptchaController {
	@Autowired
	private DefaultKaptcha captchaProducer;
	
	/**
	 * 生成验证码
	 * 
	 * @param request
	 * @param response
	 * @throws Exception
	 */
	@RequestMapping(value="getCaptcha", method = RequestMethod.GET)
	public void getCaptha(HttpServletRequest request, HttpServletResponse response) throws Exception{
		response.setDateHeader("Expires", 0);
		response.setHeader("Cache-Control",
				"no-store, no-cache, must-revalidate");
		response.addHeader("Cache-Control", "post-check=0, pre-check=0");
		response.setHeader("Pragma", "no-cache");
		response.setContentType("image/jpeg");
		String capText = captchaProducer.createText();
		request.getSession().setAttribute(
				com.google.code.kaptcha.Constants.KAPTCHA_SESSION_KEY, capText);
		BufferedImage bi = captchaProducer.createImage(capText);
		ServletOutputStream out = response.getOutputStream();
		ImageIO.write(bi, "jpg", out);
		try {
			out.flush();
		} finally {
			out.close();
		}
	}
	
	@RequestMapping(value="checkCaptcha", method = RequestMethod.GET)
	@ResponseBody
	public String checkCaptcha(@Param("txtVerifyCode")String txtVerifyCode, HttpServletRequest request, HttpServletResponse response) throws Exception{
		//取得校验码
		ReturnValue returnValue=new ReturnValue();
		String kaptchaExpected = (String) request.getSession().getAttribute(com.google.code.kaptcha.Constants.KAPTCHA_SESSION_KEY); 
		if(StringUtils.isEmpty(txtVerifyCode) || StringUtils.isEmpty(kaptchaExpected)){
			returnValue.setSuccess(false);
			returnValue.setUrl("");
			returnValue.setMessage("");
			returnValue.setDataMap(null);
			returnValue.setError("");
		}else{
			if(txtVerifyCode.equals(kaptchaExpected)){
				returnValue.setSuccess(true);
				returnValue.setUrl("");
				returnValue.setMessage("验证码正确。。。");
				returnValue.setDataMap(null);
				returnValue.setError("");
			}else{
				returnValue.setSuccess(false);
				returnValue.setUrl("");
				returnValue.setMessage("验证码不正确。。。");
				returnValue.setDataMap(null);
				returnValue.setError("");
			}
		}
		return JSON.toJSONString(returnValue);
	}
}
/*kaptcha.border  是否有边框  默认为true  我们可以自己设置yes，no
kaptcha.border.color   边框颜色   默认为Color.BLACK
kaptcha.border.thickness  边框粗细度  默认为1
kaptcha.producer.impl   验证码生成器  默认为DefaultKaptcha
kaptcha.textproducer.impl   验证码文本生成器  默认为DefaultTextCreator
kaptcha.textproducer.char.string   验证码文本字符内容范围  默认为abcde2345678gfynmnpwx
kaptcha.textproducer.char.length   验证码文本字符长度  默认为5
kaptcha.textproducer.font.names    验证码文本字体样式  默认为new Font("Arial", 1, fontSize), new Font("Courier", 1, fontSize)
kaptcha.textproducer.font.size   验证码文本字符大小  默认为40
kaptcha.textproducer.font.color  验证码文本字符颜色  默认为Color.BLACK
kaptcha.textproducer.char.space  验证码文本字符间距  默认为2
kaptcha.noise.impl    验证码噪点生成对象  默认为DefaultNoise
kaptcha.noise.color   验证码噪点颜色   默认为Color.BLACK
kaptcha.obscurificator.impl   验证码样式引擎  默认为WaterRipple
kaptcha.word.impl   验证码文本字符渲染   默认为DefaultWordRenderer
kaptcha.background.impl   验证码背景生成器   默认为DefaultBackground
kaptcha.background.clear.from   验证码背景颜色渐进   默认为Color.LIGHT_GRAY
kaptcha.background.clear.to   验证码背景颜色渐进   默认为Color.WHITE
kaptcha.image.width   验证码图片宽度  默认为200
kaptcha.image.height  验证码图片高度  默认为50 */


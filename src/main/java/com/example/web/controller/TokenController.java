package com.example.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.TokenService;

/**
 * token控制器
 * 
 * @author biweiqian
 *
 */
@RestController
@RequestMapping("/token")
public class TokenController {
	@Autowired
	@Qualifier("myTokenService")
	private TokenService tokenService;

	/**
	 * 上传文件接口
	 * 
	 * @param request
	 * @throws Exception
	 */
	@RequestMapping(value = "/get", produces = "application/json", method = { RequestMethod.GET })
	public String getSignature(HttpServletRequest request,
			HttpServletResponse response) {
		return tokenService.getSign();
	}
}

package com.shadow.base.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

/**
 * 
 * @ClassName: LoginHandlerInterceptor 
 * @Description: 登录过滤及前台验证
 * @author peter 
 * @date 2016年4月28日 下午3:52:58 
 * @version 1.0
 */
public class LoginHandlerInterceptor extends HandlerInterceptorAdapter {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		return true;
	}

}

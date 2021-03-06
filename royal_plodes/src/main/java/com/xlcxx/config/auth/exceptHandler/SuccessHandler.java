package com.xlcxx.config.auth.exceptHandler;

import com.alibaba.fastjson.JSONObject;
import com.xlcxx.utils.ApiResult;
import com.xlcxx.utils.Constant;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Description: plodes
 * Created by yhsh on 2020/3/19 14:30
 * version 2.0
 * 方法说明
 */
@Configuration
public class SuccessHandler implements AuthenticationSuccessHandler {
	@Override
	public void onAuthenticationSuccess(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Authentication authentication) throws IOException, ServletException {
		httpServletResponse.setContentType(Constant.JSONUTF8);
		httpServletResponse.getWriter().write(JSONObject.toJSONString(ApiResult.ok("登陆成功")));
	}
}

package com.youmeek.demo.web.servlet;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "getQiyeWeixinTokenServlet", urlPatterns = {"/tokenUrl","/token"}, loadOnStartup = 1)
public class GetQiyeWeixinTokenServlet extends HttpServlet {

	private static final Logger logger = LogManager.getLogger();

	//=================================================================================
	
	public GetQiyeWeixinTokenServlet() {
		
	}

	@Override
	public void init() throws ServletException {
		super.init();
	}

	@Override
	protected void doGet(final HttpServletRequest req, final HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}

	@Override
	protected void doPost(final HttpServletRequest req, final HttpServletResponse resp) throws ServletException, IOException {
		//从表单中拿到 code 值
		String code = req.getParameter("code");

		//请求 url 中整个参数
		String queryString = req.getQueryString();

		logger.debug("-------------------code=" + code);
		logger.debug("-------------------queryString=" + queryString);
	}
}

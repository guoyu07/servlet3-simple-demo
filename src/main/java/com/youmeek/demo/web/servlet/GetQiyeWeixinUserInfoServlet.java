package com.youmeek.demo.web.servlet;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "getQiyeWeixinUserInfoServlet", urlPatterns = {"/profileUrl"}, loadOnStartup = 2)
public class GetQiyeWeixinUserInfoServlet extends HttpServlet {

	private static final Logger logger = LogManager.getLogger();

	//=================================================================================

	public GetQiyeWeixinUserInfoServlet() {

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

		String oaUserInfo = "youmeek.com";
		resp.getWriter().write(oaUserInfo);

	}


}

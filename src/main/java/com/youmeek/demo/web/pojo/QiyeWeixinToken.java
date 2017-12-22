package com.youmeek.demo.web.pojo;

public class QiyeWeixinToken {
	/**
	 * errcode : 0
	 * errmsg : ok
	 * access_token : 3AINuIutCi5Nvk0hEkjr-jpgLWVJbkuso2TPbPCQVHQVxdzlw0kxIsgNXTwqHistw9JEWmyvtXAkKOYoSQubku1bjK6-j9xXzQU5ij6P8pslxbEM4IzAa71jDnltu_Te3dhLe6sW890svWtVRgYDmhwEXoO_yMnOimND07N6Gy4CxlbziuvLWaXSSNPUXlO1P0aIByzrN3Mslz1o3Yva-A
	 * expires_in : 7200
	 */

	private int errcode;
	private String errmsg;
	private String access_token;
	private int expires_in;

	public int getErrcode() {
		return errcode;
	}

	public void setErrcode(int errcode) {
		this.errcode = errcode;
	}

	public String getErrmsg() {
		return errmsg;
	}

	public void setErrmsg(String errmsg) {
		this.errmsg = errmsg;
	}

	public String getAccess_token() {
		return access_token;
	}

	public void setAccess_token(String access_token) {
		this.access_token = access_token;
	}

	public int getExpires_in() {
		return expires_in;
	}

	public void setExpires_in(int expires_in) {
		this.expires_in = expires_in;
	}
}

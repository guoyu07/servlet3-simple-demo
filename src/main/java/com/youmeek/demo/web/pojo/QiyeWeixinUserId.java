package com.youmeek.demo.web.pojo;

public class QiyeWeixinUserId {
	/**
	 * errcode : 0
	 * errmsg : ok
	 * UserId : USERID
	 */

	private int errcode;
	private String errmsg;
	private String UserId;

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

	public String getUserId() {
		return UserId;
	}

	public void setUserId(String UserId) {
		this.UserId = UserId;
	}
}

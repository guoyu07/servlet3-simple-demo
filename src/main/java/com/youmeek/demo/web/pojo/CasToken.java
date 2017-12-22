package com.youmeek.demo.web.pojo;

public class CasToken {

	/**
	 * access_token : AT-11731-uXn0wEpu6cxtPFG8a2upL1Tw2czwUKDd
	 * token_type : bearer
	 * expires_in : 28800
	 * refresh_token : RT-5590-LbotH0wsxeot7O3qj_gUqR8apKum9JUj
	 */

	private String access_token;
	private String token_type;
	private int expires_in;
	private String refresh_token;

	public String getAccess_token() {
		return access_token;
	}

	public void setAccess_token(String access_token) {
		this.access_token = access_token;
	}

	public String getToken_type() {
		return token_type;
	}

	public void setToken_type(String token_type) {
		this.token_type = token_type;
	}

	public int getExpires_in() {
		return expires_in;
	}

	public void setExpires_in(int expires_in) {
		this.expires_in = expires_in;
	}

	public String getRefresh_token() {
		return refresh_token;
	}

	public void setRefresh_token(String refresh_token) {
		this.refresh_token = refresh_token;
	}
}

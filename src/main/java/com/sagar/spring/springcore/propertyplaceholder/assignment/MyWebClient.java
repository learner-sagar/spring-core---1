package com.sagar.spring.springcore.propertyplaceholder.assignment;

public class MyWebClient {
	private String url;
	private String userName;
	private String password;

	public MyWebClient(String url, String userName, String password) {
		this.url = url;
		this.userName = userName;
		this.password = password;
	}

	@Override
	public String toString() {
		return "MyWebClient [url=" + url + ", userName=" + userName + ", password=" + password + "]";
	}

}

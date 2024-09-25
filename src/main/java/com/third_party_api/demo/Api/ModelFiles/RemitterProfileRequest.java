package com.third_party_api.demo.Api.ModelFiles;

public class RemitterProfileRequest {
	
	
	private String mobile;
	
	public RemitterProfileRequest(String mobile) {
	    this.mobile = mobile;
	  }

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

}

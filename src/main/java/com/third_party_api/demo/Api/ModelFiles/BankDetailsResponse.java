package com.third_party_api.demo.Api.ModelFiles;

import java.util.List;

public class BankDetailsResponse {

	private String statuscode;
    private String actcode;
    private String status;
    private List<BankDetailsData> data;
    private String timestamp;
    private String ipay_uuid;
    private String orderid;
    private String environment;
    private String internalCode;
	public String getStatuscode() {
		return statuscode;
	}
	public void setStatuscode(String statuscode) {
		this.statuscode = statuscode;
	}
	public String getActcode() {
		return actcode;
	}
	public void setActcode(String actcode) {
		this.actcode = actcode;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public List<BankDetailsData> getData() {
		return data;
	}
	public void setData(List<BankDetailsData> data) {
		this.data = data;
	}
	public String getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
	public String getIpay_uuid() {
		return ipay_uuid;
	}
	public void setIpay_uuid(String ipay_uuid) {
		this.ipay_uuid = ipay_uuid;
	}
	public String getOrderid() {
		return orderid;
	}
	public void setOrderid(String orderid) {
		this.orderid = orderid;
	}
	public String getEnvironment() {
		return environment;
	}
	public void setEnvironment(String environment) {
		this.environment = environment;
	}
	public String getInternalCode() {
		return internalCode;
	}
	public void setInternalCode(String internalCode) {
		this.internalCode = internalCode;
	}
    
    
	
}

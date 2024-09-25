package com.third_party_api.demo.Api.ModelFiles;

public class FundTransferRequest {

	
	private String remitterMobile;
	private String beneficiaryId;
	private String transferMode;
	private String transferAmount;
	private String latitude;
	private String longitude;
	private String externalRef;
	public String getRemitterMobile() {
		return remitterMobile;
	}
	public void setRemitterMobile(String remitterMobile) {
		this.remitterMobile = remitterMobile;
	}
	public String getBeneficiaryId() {
		return beneficiaryId;
	}
	public void setBeneficiaryId(String beneficiaryId) {
		this.beneficiaryId = beneficiaryId;
	}
	public String getTransferMode() {
		return transferMode;
	}
	public void setTransferMode(String transferMode) {
		this.transferMode = transferMode;
	}
	public String getTransferAmount() {
		return transferAmount;
	}
	public void setTransferAmount(String transferAmount) {
		this.transferAmount = transferAmount;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public String getExternalRef() {
		return externalRef;
	}
	public void setExternalRef(String externalRef) {
		this.externalRef = externalRef;
	}
	
	
	
}

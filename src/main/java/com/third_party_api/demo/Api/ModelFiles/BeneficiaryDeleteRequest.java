package com.third_party_api.demo.Api.ModelFiles;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BeneficiaryDeleteRequest {
	
	private String remitterMobile;
	private String beneficiaryId;
	public BeneficiaryDeleteRequest(String remitterMobile, String beneficiaryId) {
		super();
		this.remitterMobile = remitterMobile;
		this.beneficiaryId = beneficiaryId;
	}
	public BeneficiaryDeleteRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
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
	
	
	

}

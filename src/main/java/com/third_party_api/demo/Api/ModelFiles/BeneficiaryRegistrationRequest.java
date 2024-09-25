package com.third_party_api.demo.Api.ModelFiles;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BeneficiaryRegistrationRequest {
	
	
	private String remitterMobile;
    private String firstName;
    private String ifsc;
    private String accountNumber;
		
	

	public String getRemitterMobile() {
		return remitterMobile;
	}
	public void setRemitterMobile(String remitterMobile) {
		this.remitterMobile = remitterMobile;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getIfsc() {
		return ifsc;
	}
	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
    
    

}

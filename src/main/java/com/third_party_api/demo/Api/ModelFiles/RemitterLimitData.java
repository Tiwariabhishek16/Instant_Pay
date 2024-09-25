package com.third_party_api.demo.Api.ModelFiles;

public class RemitterLimitData {
	private String limitPerTransaction;
    private String limitTotal;
    private String limitConsumed;
    private String limitAvailable;
    private RemitterLimitDetails limitDetails;
	public String getLimitPerTransaction() {
		return limitPerTransaction;
	}
	public void setLimitPerTransaction(String limitPerTransaction) {
		this.limitPerTransaction = limitPerTransaction;
	}
	public String getLimitTotal() {
		return limitTotal;
	}
	public void setLimitTotal(String limitTotal) {
		this.limitTotal = limitTotal;
	}
	public String getLimitConsumed() {
		return limitConsumed;
	}
	public void setLimitConsumed(String limitConsumed) {
		this.limitConsumed = limitConsumed;
	}
	public String getLimitAvailable() {
		return limitAvailable;
	}
	public void setLimitAvailable(String limitAvailable) {
		this.limitAvailable = limitAvailable;
	}
	public RemitterLimitDetails getLimitDetails() {
		return limitDetails;
	}
	public void setLimitDetails(RemitterLimitDetails limitDetails) {
		this.limitDetails = limitDetails;
	}
    


}

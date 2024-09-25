package com.third_party_api.demo.Api.ModelFiles;

public class FundTransferData {
	
	private String externalRef;
	private String poolReferenceId;
	private String txnValue;
	private String txnReferenceId;
	private String pool;
	private String remitterMobile;
	
	 private FundTransferDetails TransferDetails;
	private String beneficiaryAccount;
	private String beneficiaryIfsc;
	
	
	
	public FundTransferDetails getTransferDetails() {
		return TransferDetails;
	}
	public void setTransferDetails(FundTransferDetails transferDetails) {
		TransferDetails = transferDetails;
	}
	public String getExternalRef() {
		return externalRef;
	}
	public void setExternalRef(String externalRef) {
		this.externalRef = externalRef;
	}
	public String getPoolReferenceId() {
		return poolReferenceId;
	}
	public void setPoolReferenceId(String poolReferenceId) {
		this.poolReferenceId = poolReferenceId;
	}
	public String getTxnValue() {
		return txnValue;
	}
	public void setTxnValue(String txnValue) {
		this.txnValue = txnValue;
	}
	public String getTxnReferenceId() {
		return txnReferenceId;
	}
	public void setTxnReferenceId(String txnReferenceId) {
		this.txnReferenceId = txnReferenceId;
	}
	public String getPool() {
		return pool;
	}
	public void setPool(String pool) {
		this.pool = pool;
	}
	public String getRemitterMobile() {
		return remitterMobile;
	}
	public void setRemitterMobile(String remitterMobile) {
		this.remitterMobile = remitterMobile;
	}
	public String getBeneficiaryAccount() {
		return beneficiaryAccount;
	}
	public void setBeneficiaryAccount(String beneficiaryAccount) {
		this.beneficiaryAccount = beneficiaryAccount;
	}
	public String getBeneficiaryIfsc() {
		return beneficiaryIfsc;
	}
	public void setBeneficiaryIfsc(String beneficiaryIfsc) {
		this.beneficiaryIfsc = beneficiaryIfsc;
	}
	
	

}

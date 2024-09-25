package com.third_party_api.demo.Api.ModelFiles;

public class GetCategoryData {
	private String categoryKey;
    private String categoryName;
    private String iconUrl;
    private String billerList;
    private GetCategoryDetails categoryDetails;

 // Getters and Setters
    
    
    
    public String getCategoryKey() {
        return categoryKey;
    }

    public GetCategoryDetails getCategoryDetails() {
		return categoryDetails;
	}

	public void setCategoryDetails(GetCategoryDetails categoryDetails) {
		this.categoryDetails = categoryDetails;
	}

	public String getIconUrl() {
		return iconUrl;
	}

	public void setIconUrl(String iconUrl) {
		this.iconUrl = iconUrl;
	}

	public String getBillerList() {
		return billerList;
	}

	public void setBillerList(String billerList) {
		this.billerList = billerList;
	}

	public void setCategoryKey(String categoryKey) {
        this.categoryKey = categoryKey;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
}
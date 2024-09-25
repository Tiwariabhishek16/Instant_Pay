package com.third_party_api.demo.Api.Services;

import com.third_party_api.demo.Api.ModelFiles.BeneficiaryDeleteRequest;
import com.third_party_api.demo.Api.ModelFiles.BeneficiaryDeleteResponse;

public interface BeneficiaryDeleteService {

    // Declare the method to delete a beneficiary
    public BeneficiaryDeleteResponse deleteBeneficiary(BeneficiaryDeleteRequest request, String authCode, 
                                                       String clientId, String clientSecret, 
                                                       String endPointIP, String outletId);
}


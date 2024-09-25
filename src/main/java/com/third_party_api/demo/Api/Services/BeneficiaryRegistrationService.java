package com.third_party_api.demo.Api.Services;

import com.third_party_api.demo.Api.ModelFiles.BeneficiaryRegistrationRequest;
import com.third_party_api.demo.Api.ModelFiles.BeneficiaryRegistrationResponse;

public interface BeneficiaryRegistrationService {
    BeneficiaryRegistrationResponse registerBeneficiary(BeneficiaryRegistrationRequest request, String authCode, String clientId, String clientSecret, String endPointIp, String outletId); 
                                                        
}
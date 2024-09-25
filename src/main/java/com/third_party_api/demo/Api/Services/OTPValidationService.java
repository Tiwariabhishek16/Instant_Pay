package com.third_party_api.demo.Api.Services;

import com.third_party_api.demo.Api.ModelFiles.OTPValidationRequest;
import com.third_party_api.demo.Api.ModelFiles.OTPValidationResponse;

public interface OTPValidationService {
    OTPValidationResponse registerOTP(OTPValidationRequest request, String authCode, String clientId, String clientSecret, String endPointIP, String outletId);
}

package com.third_party_api.demo.Api.Services;

import com.third_party_api.demo.Api.ModelFiles.RemitterRegistrationRequest;

import com.third_party_api.demo.Api.ModelFiles.RemitterRegistrationResponse;

public interface RemitterRegistrationService {

    // Method to register a remitter
    RemitterRegistrationResponse registerRemitter(RemitterRegistrationRequest request, String authCode, String clientId, String clientSecret, String endPointIp, String outletId);
}
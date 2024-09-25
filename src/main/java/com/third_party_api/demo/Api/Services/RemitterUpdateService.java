package com.third_party_api.demo.Api.Services;

import com.third_party_api.demo.Api.ModelFiles.RemitterUpdateRequest;
import com.third_party_api.demo.Api.ModelFiles.RemitterUpdateResponse;

public interface RemitterUpdateService {
    RemitterUpdateResponse updateRemitter(RemitterUpdateRequest request, String authCode, String clientId, String clientSecret, String endPointIP, String outletId);
}
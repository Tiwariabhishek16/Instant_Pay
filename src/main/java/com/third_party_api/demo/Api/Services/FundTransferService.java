package com.third_party_api.demo.Api.Services;

import com.third_party_api.demo.Api.ModelFiles.FundTransferRequest;
import com.third_party_api.demo.Api.ModelFiles.FundTransferResponse;

public interface FundTransferService {
    FundTransferResponse fundTransfer(FundTransferRequest request, String authCode, 
                                      String clientId, String clientSecret, 
                                      String endPointIp, String outletId);
}

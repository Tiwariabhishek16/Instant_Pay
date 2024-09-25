package com.third_party_api.demo.Api.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.third_party_api.demo.Api.ModelFiles.OTPValidationRequest;
import com.third_party_api.demo.Api.ModelFiles.OTPValidationResponse;

@Service
public class OTPValidationServiceImpl implements OTPValidationService{	
	
	@Autowired
    private RestTemplate restTemplate; // RestTemplate for making HTTP requests
	
	@Override
    public OTPValidationResponse registerOTP(OTPValidationRequest request, String authCode, String clientId, String clientSecret, String endPointIp, String outletId) {
		
		
		HttpHeaders headers = new HttpHeaders();
        headers.set("X-Ipay-Auth-Code", "1");
	       headers.set("X-Ipay-Client-Id", "YWY3OTAzYzNlM2ExZTJlOR7IImmr/M5kGCkM41v4wPc=");
	       headers.set("X-Ipay-Client-Secret",  "5b66aa434548ca0c3ac55cbe4e783f9d161bc1f42d7139c851e825181b58fd0e");
	       headers.set("X-Ipay-Outlet-Id", "441484");
	       headers.set("X-Ipay-Endpoint-Ip",  "45.115.105.205");
        headers.set("Content-Type", "application/json");
        headers.set("Accept", "application/json");
        
        // Create an HttpEntity with the request body and headers
        HttpEntity<OTPValidationRequest> entity = new HttpEntity<>(request, headers);

        // Define the external API URL
        String url = "https://api.instantpay.in/fi/remit/out/domestic/otpVerification";

        // Make the HTTP POST request to the external API
        ResponseEntity<OTPValidationResponse> responseEntity =
                restTemplate.exchange(url, HttpMethod.POST, entity, OTPValidationResponse.class);

        // Return the response from the external API
        return responseEntity.getBody();
	}

}

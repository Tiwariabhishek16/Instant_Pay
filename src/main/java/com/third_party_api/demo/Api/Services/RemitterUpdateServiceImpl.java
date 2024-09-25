package com.third_party_api.demo.Api.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.third_party_api.demo.Api.ModelFiles.RemitterUpdateRequest;
import com.third_party_api.demo.Api.ModelFiles.RemitterUpdateResponse;

@Service
public class RemitterUpdateServiceImpl implements RemitterUpdateService {

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public RemitterUpdateResponse updateRemitter(RemitterUpdateRequest request, String authCode, String clientId, String clientSecret, String endPointIP, String outletId) {
        // Setup headers
        HttpHeaders headers = new HttpHeaders();
        headers.set("X-Ipay-Auth-Code", "1");
	       headers.set("X-Ipay-Client-Id", "YWY3OTAzYzNlM2ExZTJlOR7IImmr/M5kGCkM41v4wPc=");
	       headers.set("X-Ipay-Client-Secret",  "5b66aa434548ca0c3ac55cbe4e783f9d161bc1f42d7139c851e825181b58fd0e");
	       headers.set("X-Ipay-Outlet-Id", "441484");
	       headers.set("X-Ipay-Endpoint-Ip",  "45.115.105.205");
	       headers.set("Content-Type", "application/json");
         headers.set("Accept", "application/json");

        // Create HttpEntity with the request body and headers
        HttpEntity<RemitterUpdateRequest> entity = new HttpEntity<>(request, headers);

        // External API URL
        String url = "https://api.instantpay.in/fi/remit/out/domestic/remitterUpdate";

        // Make the HTTP PUT request
        ResponseEntity<RemitterUpdateResponse> responseEntity = restTemplate.exchange(url, HttpMethod.PUT, entity, RemitterUpdateResponse.class);

        // Return the response from the external API
        return responseEntity.getBody();
    }
}
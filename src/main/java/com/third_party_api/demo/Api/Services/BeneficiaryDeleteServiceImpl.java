package com.third_party_api.demo.Api.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.third_party_api.demo.Api.ModelFiles.BeneficiaryDeleteRequest;
import com.third_party_api.demo.Api.ModelFiles.BeneficiaryDeleteResponse;


@Service
public class BeneficiaryDeleteServiceImpl implements BeneficiaryDeleteService {

    @Autowired
    private RestTemplate restTemplate; // RestTemplate for making HTTP requests

    @Override
    public BeneficiaryDeleteResponse deleteBeneficiary(BeneficiaryDeleteRequest request, String authCode, 
                                                       String clientId, String clientSecret, 
                                                       String endPointIP, String outletId) {
        // Set up the headers
        HttpHeaders headers = new HttpHeaders();
        headers.set("X-Ipay-Auth-Code", "1");  // Use dynamic values from the parameters
        headers.set("X-Ipay-Client-Id", "YWY3OTAzYzNlM2ExZTJlOR7IImmr/M5kGCkM41v4wPc=");
        headers.set("X-Ipay-Client-Secret", "5b66aa434548ca0c3ac55cbe4e783f9d161bc1f42d7139c851e825181b58fd0e");
        headers.set("X-Ipay-Outlet-Id", "441484");
        headers.set("X-Ipay-Endpoint-Ip", "45.115.105.205");
        headers.set("Content-Type", "application/json");
        headers.set("Accept", "application/json");

        // Create an HttpEntity with the request body and headers
        HttpEntity<BeneficiaryDeleteRequest> entity = new HttpEntity<>(request, headers);

        // Define the external API URL
        String url = "https://api.instantpay.in/fi/remit/out/domestic/beneficiaryDelete";

        // Make the HTTP DELETE request to the external API
        ResponseEntity<BeneficiaryDeleteResponse> responseEntity =
                restTemplate.exchange(url, HttpMethod.DELETE, entity, BeneficiaryDeleteResponse.class);

        // Return the response from the external API
        return responseEntity.getBody();
    }
}
package com.third_party_api.demo.Api.Controller;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.third_party_api.demo.Api.ModelFiles.BankDetailsResponse;
import com.third_party_api.demo.Api.ModelFiles.BeneficiaryDeleteRequest;
import com.third_party_api.demo.Api.ModelFiles.BeneficiaryDeleteResponse;
import com.third_party_api.demo.Api.ModelFiles.OTPValidationRequest;
import com.third_party_api.demo.Api.ModelFiles.OTPValidationResponse;
import com.third_party_api.demo.Api.ModelFiles.RemitterLimitResponse;
import com.third_party_api.demo.Api.ModelFiles.BeneficiaryRegistrationRequest;
import com.third_party_api.demo.Api.ModelFiles.BeneficiaryRegistrationResponse;
import com.third_party_api.demo.Api.ModelFiles.FundTransferRequest;
import com.third_party_api.demo.Api.ModelFiles.FundTransferResponse;
import com.third_party_api.demo.Api.Services.BeneficiaryDeleteService;
import com.third_party_api.demo.Api.Services.BeneficiaryRegistrationService;
import com.third_party_api.demo.Api.Services.FundTransferService;
import com.third_party_api.demo.Api.ModelFiles.RemitterProfileResponse;
import com.third_party_api.demo.Api.ModelFiles.RemitterRegistrationRequest;
import com.third_party_api.demo.Api.ModelFiles.RemitterRegistrationResponse;
import com.third_party_api.demo.Api.ModelFiles.RemitterUpdateRequest;
import com.third_party_api.demo.Api.ModelFiles.RemitterUpdateResponse;
import com.third_party_api.demo.Api.Services.OTPValidationService;
import com.third_party_api.demo.Api.Services.RemitterRegistrationService;
import com.third_party_api.demo.Api.Services.RemitterUpdateService;

@RestController
public class InstantPay_DMT_Controller {
	
	
	//Financial Inclusion Bank Details Under Remittance (Domestic) GET METHOD
	   
	   
	@GetMapping("/BankDetails")
	   
	   
	   public BankDetailsResponse getBankDetails(
	           @RequestHeader("X-Ipay-Auth-Code") String authCode,
	           @RequestHeader("X-Ipay-Client-Id") String clientId,
	           @RequestHeader("X-Ipay-Client-Secret") String clientSecret,
	           @RequestHeader("X-Ipay-Outlet-Id") String outletId,
	           @RequestHeader("X-Ipay-Endpoint-Ip") String endpointIp) {
	             
		   
		   
		   String url = "https://api.instantpay.in/fi/remit/out/domestic/banks";
		   
		// Setup RestTemplate to make an HTTP GET request
	       RestTemplate restTemplate = new RestTemplate();

	       // Construct headers to pass along with the request
	       HttpHeaders headers = new HttpHeaders();
	       headers.set("X-Ipay-Auth-Code", "1");
	       headers.set("X-Ipay-Client-Id", "YWY3OTAzYzNlM2ExZTJlOR7IImmr/M5kGCkM41v4wPc=");
	       headers.set("X-Ipay-Client-Secret",  "5b66aa434548ca0c3ac55cbe4e783f9d161bc1f42d7139c851e825181b58fd0e");
	       headers.set("X-Ipay-Outlet-Id", "441484");
	       headers.set("X-Ipay-Endpoint-Ip",  "45.115.105.205");
	       
	    // Create an HttpEntity with the headers
	       HttpEntity<String> entity = new HttpEntity<>(headers);

	       try {
	       	// Send request
	           ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.GET, entity, String.class);
	           System.out.println(response.getBody());
	           ObjectMapper objectMapper = new ObjectMapper();
	           return objectMapper.readValue(response.getBody(), BankDetailsResponse.class);


	       } catch (Exception e) {
	           // Log the error message
	           System.out.println("Error during API call: " + e.getMessage());

	           // Return a custom error response
	           return null;
	       }
	   }
	   
	   
	   //Remitter Profile GET METHOD
	   

	   @GetMapping("/remitter-Profile")
	   
	   public RemitterProfileResponse getRemitterProfile(
	           @RequestHeader("X-Ipay-Auth-Code") String authCode,
	           @RequestHeader("X-Ipay-Client-Id") String clientId,
	           @RequestHeader("X-Ipay-Client-Secret") String clientSecret,
	           @RequestHeader("X-Ipay-Outlet-Id") String outletId,
	           @RequestHeader("X-Ipay-Endpoint-Ip") String endpointIp) {
	             
		   
		   
		   String url = "https://api.instantpay.in/fi/remit/out/domestic/remitterProfile?mobile=7428585742";
		   
		// Setup RestTemplate to make an HTTP GET request
	       RestTemplate restTemplate = new RestTemplate();

	       // Construct headers to pass along with the request
	       HttpHeaders headers = new HttpHeaders();
	       headers.set("X-Ipay-Auth-Code", "1");
	       headers.set("X-Ipay-Client-Id", "YWY3OTAzYzNlM2ExZTJlOR7IImmr/M5kGCkM41v4wPc=");
	       headers.set("X-Ipay-Client-Secret",  "5b66aa434548ca0c3ac55cbe4e783f9d161bc1f42d7139c851e825181b58fd0e");
	       headers.set("X-Ipay-Outlet-Id", "441484");
	       headers.set("X-Ipay-Endpoint-Ip",  "45.115.105.205");
	       
	    // Create an HttpEntity with the headers
	       HttpEntity<String> entity = new HttpEntity<>(headers);

	       try {
	       	// Send request
	           ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.GET, entity, String.class);
	           System.out.println(response.getBody());
	           ObjectMapper objectMapper = new ObjectMapper();
	           return objectMapper.readValue(response.getBody(), RemitterProfileResponse.class);


	       } catch (Exception e) {
	           // Log the error message
	           System.out.println("Error during API call: " + e.getMessage());

	           // Return a custom error response
	           return null;
	       }
	   }
	   
	   
	   
	   
	   //Remitter Limit GET METHOD
	   
	   @GetMapping("/Remitter-Limit")
	   public RemitterLimitResponse getRemitterLimit(
			   @RequestHeader("X-Ipay-Auth-Code") String authCode,
	           @RequestHeader("X-Ipay-Client-Id") String clientId,
	           @RequestHeader("X-Ipay-Client-Secret") String clientSecret,
	           @RequestHeader("X-Ipay-Outlet-Id") String outletId,
	           @RequestHeader("X-Ipay-Endpoint-Ip") String endpointIp) {
		   
		   String url ="https://api.instantpay.in/fi/remit/out/domestic/remitterTransferLimit?mobile=7428585742";
		   
		// Setup RestTemplate to make an HTTP GET request
	       RestTemplate restTemplate = new RestTemplate();
	       
	       // Construct headers to pass along with the request
	       HttpHeaders headers = new HttpHeaders();
	       headers.set("X-Ipay-Auth-Code", "1");
	       headers.set("X-Ipay-Client-Id", "YWY3OTAzYzNlM2ExZTJlOR7IImmr/M5kGCkM41v4wPc=");
	       headers.set("X-Ipay-Client-Secret",  "5b66aa434548ca0c3ac55cbe4e783f9d161bc1f42d7139c851e825181b58fd0e");
	       headers.set("X-Ipay-Outlet-Id", "441484");
	       headers.set("X-Ipay-Endpoint-Ip",  "45.115.105.205");
	       
	    // Create an HttpEntity with the headers
	       HttpEntity<String> entity = new HttpEntity<>(headers);
           
	       
	       try {
		       	// Send request
		           ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.GET, entity, String.class);
		           System.out.println(response.getBody());
		           ObjectMapper objectMapper = new ObjectMapper();
		           return objectMapper.readValue(response.getBody(), RemitterLimitResponse.class);


		       } catch (Exception e) {
		           // Log the error message
		           System.out.println("Error during API call: " + e.getMessage());

		           // Return a custom error response
		           return null;
		       }
		   
		   
	   }
	   
	   
	   
	   
	   //POST METHOD Remitter Registration
	   
	   @Autowired
	    private RemitterRegistrationService remitterRegistrationService;
	

	    @PostMapping("/api/remitter-registration")
	    public ResponseEntity<RemitterRegistrationResponse> registerRemitter(
	            @RequestBody RemitterRegistrationRequest request, // Request body
	            @RequestHeader("X-Ipay-Auth-Code") String authCode,
                @RequestHeader("X-Ipay-Client-Id") String clientId,
                @RequestHeader("X-Ipay-Client-Secret") String clientSecret,
                @RequestHeader("X-Ipay-Endpoint-Ip") String endPointIP,
                @RequestHeader("X-Ipay-Outlet-Id") String outletId) {	        // Call service to handle remitter registration
	        RemitterRegistrationResponse response = remitterRegistrationService.registerRemitter(request, authCode, clientId,
	                clientSecret, endPointIP, outletId);

	        // Return the response from the external API
	        return ResponseEntity.ok(response);
	    }

   

//POST METHOD Beneficiary Registration

     @Autowired
     private BeneficiaryRegistrationService beneficiaryRegistrationService; //Service Call

     @PostMapping("/api/beneficiary-registration") // Fixed the URL mapping
     public ResponseEntity<BeneficiaryRegistrationResponse> registerBeneficiary(
            @RequestBody BeneficiaryRegistrationRequest request, // Request body
            @RequestHeader("X-Ipay-Auth-Code") String authCode,
            @RequestHeader("X-Ipay-Client-Id") String clientId,
            @RequestHeader("X-Ipay-Client-Secret") String clientSecret,
            @RequestHeader("X-Ipay-Endpoint-Ip") String endPointIP,
            @RequestHeader("X-Ipay-Outlet-Id") String outletId) {

    // Call service to handle beneficiary registration
    BeneficiaryRegistrationResponse response = beneficiaryRegistrationService.registerBeneficiary(request, authCode, clientId,
            clientSecret, endPointIP, outletId);

    // Return the response from the external API
    return ResponseEntity.ok(response);
}

     
     


  //OTP Validation POST METHOD

@Autowired
private OTPValidationService otpValidationService;

@PostMapping("/api/OTP-Validation")
public ResponseEntity<OTPValidationResponse> registerOTP(
        @RequestBody OTPValidationRequest request, // Request body containing OTP details
        @RequestHeader("X-Ipay-Auth-Code") String authCode, // Header values
        @RequestHeader("X-Ipay-Client-Id") String clientId,
        @RequestHeader("X-Ipay-Client-Secret") String clientSecret,
        @RequestHeader("X-Ipay-Outlet-Id") String outletId,
        @RequestHeader("X-Ipay-Endpoint-Ip") String endPointIP) {

    // Call service layer to handle OTP validation
    OTPValidationResponse response = otpValidationService.registerOTP(
            request, authCode, clientId, clientSecret, endPointIP, outletId);

    // Return the response from the external API or service layer
    return ResponseEntity.ok(response);
}



//Beneficiary Deletion DELETE METHOD

@Autowired
private BeneficiaryDeleteService beneficiaryDeleteService;

@DeleteMapping("/api/beneficiary-delete")
public ResponseEntity<BeneficiaryDeleteResponse> deleteBeneficiary(
        @RequestBody BeneficiaryDeleteRequest request,
        @RequestHeader("X-Ipay-Auth-Code") String authCode,
        @RequestHeader("X-Ipay-Client-Id") String clientId,
        @RequestHeader("X-Ipay-Client-Secret") String clientSecret,
        @RequestHeader("X-Ipay-Endpoint-Ip") String endPointIP,
        @RequestHeader("X-Ipay-Outlet-Id") String outletId) {

    // Call service to handle beneficiary deletion
    BeneficiaryDeleteResponse response = beneficiaryDeleteService.deleteBeneficiary(
            request, authCode, clientId, clientSecret, endPointIP, outletId);

    // Return the response from the external API
    return ResponseEntity.ok(response);
}


//Remitter Update PUT METHOD


@Autowired
private RemitterUpdateService remitterUpdateService;

@PutMapping("/api/remitter-update")

public ResponseEntity<RemitterUpdateResponse> updateRemitter(
        @RequestBody RemitterUpdateRequest request,
        @RequestHeader("X-Ipay-Auth-Code") String authCode,
        @RequestHeader("X-Ipay-Client-Id") String clientId,
        @RequestHeader("X-Ipay-Client-Secret") String clientSecret,
        @RequestHeader("X-Ipay-Endpoint-Ip") String endPointIP,
        @RequestHeader("X-Ipay-Outlet-Id") String outletId) {

    // Call service to handle the remitter update
    RemitterUpdateResponse response = remitterUpdateService.updateRemitter(request, authCode, clientId, clientSecret, endPointIP, outletId);

    // Return the response
    return ResponseEntity.ok(response);
}




//Fund Transfer POST METHOD

@Autowired
private FundTransferService fundtransferService;

@PostMapping("/api/fund-transfer")
public ResponseEntity<FundTransferResponse> updateFund(
		@RequestBody FundTransferRequest request,
		@RequestHeader("X-Ipay-Auth-Code") String authCode,
        @RequestHeader("X-Ipay-Client-Id") String clientId,
        @RequestHeader("X-Ipay-Client-Secret") String clientSecret,
        @RequestHeader("X-Ipay-Endpoint-Ip") String endPointIP,
        @RequestHeader("X-Ipay-Outlet-Id") String outletId){
	
	
	
	
	// Call the service to handle the fund transfer
    FundTransferResponse response = fundtransferService.fundTransfer(request, authCode, clientId, clientSecret, endPointIP, outletId);

    // Return the response from the service
    return ResponseEntity.ok(response);
}

}
















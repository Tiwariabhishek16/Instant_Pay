package com.third_party_api.demo.Api.Controller;


import com.fasterxml.jackson.databind.ObjectMapper;

import com.third_party_api.demo.Api.Entities.Course;

import com.third_party_api.demo.Api.ModelFiles.GetCategoryResponse;
import com.third_party_api.demo.Api.ModelFiles.TelecomCircleResponse;
import com.third_party_api.demo.Api.Services.CourseService;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
public class MyController {

	
	//GetCategory GET
	
	@GetMapping("/api/Category")
	   
	   
	   public GetCategoryResponse getGetCategory(
	           @RequestHeader("X-Ipay-Auth-Code") String authCode,
	           @RequestHeader("X-Ipay-Client-Id") String clientId,
	           @RequestHeader("X-Ipay-Client-Secret") String clientSecret,
	           @RequestHeader("X-Ipay-Outlet-Id") String outletId,
	           @RequestHeader("X-Ipay-Endpoint-Ip") String endpointIp) {
	             
		   
		   
		   String url = "https://api.instantpay.in/marketplace/utilityPayments/category";
		   
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
	           return objectMapper.readValue(response.getBody(), GetCategoryResponse.class);


	       } catch (Exception e) {
	           // Log the error message
	           System.out.println("Error during API call: " + e.getMessage());

	           // Return a custom error response
	           return null;
	       }
	   }
        //TelecomCircle GET
    
    
    @GetMapping("/api/TelecomCircle")
    public TelecomCircleResponse getTelecomCircle(
            @RequestHeader("X-Ipay-Auth-Code") String authCode,
            @RequestHeader("X-Ipay-Client-Id") String clientId,
            @RequestHeader("X-Ipay-Client-Secret") String clientSecret,
            @RequestHeader("X-Ipay-Outlet-Id") String outletId, 
            @RequestHeader("X-Ipay-Endpoint-Ip") String endpointIp) {
            
       
        String url = "http://api.instantpay.in/marketplace/utilityPayments/telecomCircles";

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
	           return objectMapper.readValue(response.getBody(), TelecomCircleResponse.class);


	       } catch (Exception e) {
	           // Log the error message
	           System.out.println("Error during API call: " + e.getMessage());

	           // Return a custom error response
	           return null;
	       }
	   }
    
    
   
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    //get the courses
    @Autowired
    private CourseService courseSerivice;
	
    
    @GetMapping("/courses")
    
    public List<Course> getCourses(){
    	
    	
    	return this.courseSerivice.getCourses();
    	
    }
   @GetMapping("/courses/{courseId}")
    public Course getCourse(@PathVariable String courseId) {
    	
    	return this.courseSerivice.getCourse(Long.parseLong(courseId));
    }
   
   //POST METHOD
   @PostMapping("/courses")
   public Course addCourse(@RequestBody Course course) {
	   
	   
	   return this.courseSerivice.addCourse(course);
   }
   }
   
   
   



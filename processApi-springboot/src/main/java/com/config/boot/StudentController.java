package com.config.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class StudentController 
{
	
@Autowired	
private RestTemplate resttemplate;	

@GetMapping("/studentname")
public String fetchStudentName(@RequestHeader(name="id") String id)
{
HttpHeaders header=new HttpHeaders();
header.set("roll", id);
HttpEntity entity=new HttpEntity(header);

ResponseEntity<String> response= resttemplate.exchange("http://localhost:8080/fetchname", HttpMethod.GET, entity, String.class);

return response.getBody();

}
}

package com.veritis.spring.mvc3.client;

import java.util.List;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.veritis.spring.mvc3.domain.Child;
import com.veritis.spring.mvc3.domain.Emp;

public class RestClient {

	public static void main(String[] args) {
		RestTemplate restTemplate = new RestTemplate();
		HttpHeaders headers=new HttpHeaders();
		headers.add("Content-type", "application/json");
		Emp e=new Emp();
		e.setEmpno(111);
		e.setEname("test");
		e.setSal(5403.00);
		HttpEntity<Emp> request=new HttpEntity<Emp>(e,headers);
		
		ResponseEntity<List<Child>> response = restTemplate.exchange("http://localhost:8080/SpringMVC3Demo/sageit/children", HttpMethod.POST, request, new ParameterizedTypeReference<List<Child>>() {
        });
		List<Child> students = response.getBody();
		for(Child child : students){
			System.out.println(child.getName());
		}

	}

}

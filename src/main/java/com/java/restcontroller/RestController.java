package com.java.restcontroller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import com.java.service.Service;

import jakarta.servlet.http.HttpServletResponse;

@org.springframework.web.bind.annotation.RestController
public class RestController {
     
	@Autowired
	private Service service;
	
	@GetMapping("/excel")
	public void generateExcelReport(HttpServletResponse response) throws IOException {
		
		response.setContentType("application/octet-stream");
		
		String headerKey = "Content-Disposition";
		String headerValue ="attachment;filename=employee.xls";
		response.setHeader(headerKey, headerValue);
		service.generateReport(response);
	}
}

package com.java.service;

import java.io.IOException;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;

import com.java.binding.Employee;
import com.java.dao.MyCrudRepo;

import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.http.HttpServletResponse;

@org.springframework.stereotype.Service
public class Service {
	
	@Autowired
	private MyCrudRepo mcr;
	
	public void generateReport(HttpServletResponse response) throws IOException {
		List<Employee> employees = mcr.findAll();
		HSSFWorkbook workbook = new HSSFWorkbook();
		HSSFSheet sheet = workbook.createSheet("Employee Info");
		HSSFRow row = sheet.createRow(0);
		
		row.createCell(0).setCellValue("ID");
		row.createCell(1).setCellValue("NAME");
		row.createCell(2).setCellValue("ADD");
		row.createCell(3).setCellValue("SAL");
		
		int dataRowIndex=1;
		
		for(Employee emp : employees) {
			HSSFRow dataRow=sheet.createRow(dataRowIndex);
			dataRow.createCell(0).setCellValue(emp.getEid());
			dataRow.createCell(1).setCellValue(emp.getEname());
			dataRow.createCell(2).setCellValue(emp.getEadd());
			dataRow.createCell(3).setCellValue(emp.getEsal());
			
			dataRowIndex ++;

		}
		
		ServletOutputStream ops = response.getOutputStream();
        workbook.write(ops);
        workbook.close();
        ops.close();
	}

}

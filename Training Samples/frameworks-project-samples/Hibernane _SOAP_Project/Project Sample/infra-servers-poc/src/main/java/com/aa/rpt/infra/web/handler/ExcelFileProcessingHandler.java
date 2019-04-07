package com.aa.rpt.infra.web.handler;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.aa.rpt.infra.model.Servers;
import com.aa.rpt.infra.service.ServerService;

@Component
public class ExcelFileProcessingHandler {
	@Autowired
	ServerService serverService;

	public List<Servers> processExcel2007(InputStream excelStream) {
		try {
			List<Servers> serverList = new ArrayList<>();
			int i = 0;
			// Creates a workbook object from the uploaded excelfile
			XSSFWorkbook workbook = new XSSFWorkbook(excelStream);
			// Creates a worksheet object representing the first sheet
			XSSFSheet worksheet = workbook.getSheetAt(0);
			// Reads the data in excel file until last row is encountered
			while (i < worksheet.getLastRowNum()) {
				// Creates an object for the UserInfo Model
				Servers server = new Servers();
				// Creates an object representing a single row in excel
				i++;
				XSSFRow row = worksheet.getRow(i);
				// Sets the Read data to the model class
				server.setId(i);
				server.setServerName(row.getCell(0) !=null ?row.getCell(0).getStringCellValue():"");
				server.setHardwareType(row.getCell(1) !=null ?row.getCell(1).getStringCellValue():"");
				server.setApplication(row.getCell(2) !=null ?row.getCell(2).getStringCellValue():"");
				server.setGreenIp(row.getCell(3) !=null ?row.getCell(3).getStringCellValue():"");
				server.setGreyIp(row.getCell(4) !=null ?row.getCell(4).getStringCellValue():"");
				server.setIloIp(row.getCell(5) !=null ?row.getCell(5).getStringCellValue():"");
				server.setDatacenter(row.getCell(6) !=null ?row.getCell(6).getStringCellValue():"");
				server.setOs(row.getCell(7) !=null ?row.getCell(7).getStringCellValue():"");
				serverList.add(server);
			}
			workbook.close();
			return serverService.saveAllServers(serverList);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ArrayList<>();
	}
	
	public List<Servers> processExcel2003(InputStream excelStream) {
		
		List<Servers> serverList = new ArrayList<>();
		try {
			int i = 0;
			// Creates a workbook object from the uploaded excelfile
			HSSFWorkbook workbook = new HSSFWorkbook(excelStream);
			// Creates a worksheet object representing the first sheet
			HSSFSheet worksheet = workbook.getSheetAt(0);
			// Reads the data in excel file until last row is encountered
			while (i <= worksheet.getLastRowNum()) {
				// Creates an object for the UserInfo Model
				Servers server = new Servers();
				// Creates an object representing a single row in excel
				i++;
				HSSFRow row = worksheet.getRow(i);
				// Sets the Read data to the model class
				server.setId(i);
				server.setServerName(row.getCell(0) !=null ?row.getCell(0).getStringCellValue():"");
				server.setHardwareType(row.getCell(1) !=null ?row.getCell(1).getStringCellValue():"");
				server.setApplication(row.getCell(2) !=null ?row.getCell(2).getStringCellValue():"");
				server.setGreenIp(row.getCell(3) !=null ?row.getCell(3).getStringCellValue():"");
				server.setGreyIp(row.getCell(4) !=null ?row.getCell(4).getStringCellValue():"");
				server.setIloIp(row.getCell(5) !=null ?row.getCell(5).getStringCellValue():"");
				server.setDatacenter(row.getCell(6) !=null ?row.getCell(6).getStringCellValue():"");
				server.setOs(row.getCell(7) !=null ?row.getCell(7).getStringCellValue():"");
				serverList.add(server);
			}			
			workbook.close();
			return serverService.saveAllServers(serverList);
		} catch (Exception e) {
			e.printStackTrace();
		}

		
		return new ArrayList<>();
	}
}

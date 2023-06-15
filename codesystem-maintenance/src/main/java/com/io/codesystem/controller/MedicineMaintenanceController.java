
package com.io.codesystem.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.io.codesystem.service.MedicineMaintenanceService;

@RequestMapping("/medicines")
@RestController
public class MedicineMaintenanceController {
	
	@Autowired
	private MedicineMaintenanceService medservice;

	@PostMapping("/uploadFile")
	public ResponseEntity<?> fileProcessAndInsertData(@RequestParam  MultipartFile file) throws IOException {
	    String FileResponse = medservice.fileProcessAndInsertData(file);
	    HttpHeaders headers = new HttpHeaders();
	    return new ResponseEntity<>(FileResponse, headers, HttpStatus.OK);
	}

}

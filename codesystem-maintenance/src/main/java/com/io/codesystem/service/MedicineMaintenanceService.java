package com.io.codesystem.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

import javax.persistence.Id;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import com.io.codesystem.CodesystemMaintenanceService;
import com.io.codesystem.dto.model.Medicines;
import com.io.codesystem.repo.MedicineMaintenanceRepository;

@Service
public class MedicineMaintenanceService extends CodesystemMaintenanceService {

	@Autowired
	private MedicineMaintenanceRepository medicinesRepository;

	public String fileProcessAndInsertData(MultipartFile file) {
		// TODO Auto-generated method stub
		try (BufferedReader reader = new BufferedReader(new InputStreamReader(file.getInputStream())))  {	
			
			CSVParser csvParser = new CSVParser(reader, CSVFormat.DEFAULT.withFirstRecordAsHeader());
			List<Medicines> medicineList=new LinkedList<>();
			Iterable<CSVRecord> csvRecords = csvParser.getRecords();
			for (CSVRecord record : csvRecords) {
				Medicines medicines=new Medicines();
		
				medicines.setId(Integer.parseInt(record.get(0)));
				medicines.setNdc(record.get(1));
				medicines.setNdc(record.get(2));
				medicines.setDea(Integer.parseInt(record.get(3)));
				medicines.setObsdtec(record.get(4));
				medicines.setRepack(Integer.parseInt(record.get(5)));
				medicines.setIsCompounded(record.get(6));
				
				medicineList.add(medicines);
			}
			medicinesRepository.saveAll(medicineList);
			return "Data inserted successfully";
		}catch(IOException e) {
			System.out.println(e.getMessage());
			System.out.println(e.getStackTrace());
		}
		return "Failed to insert data";
	
			
	}
	/*
	 * @Transactional public void saveMedicineStandardList(List<Medicines>
	 * MedicineStandardList) { medicinesRepository.saveAll(MedicineStandardList);
	 * 
	 * }
	 */

	@Override
	public void fileUploading(String filePath) {
		// TODO Auto-generated method stub

	}

	@Override
	public void fileProcessing() {
		// TODO Auto-generated method stub

	}

	@Override
	public void analysis() {
		// TODO Auto-generated method stub

	}

	@Override
	public void synching() {
		// TODO Auto-generated method stub

	}

	@Override
	public void verification() {
		// TODO Auto-generated method stub

	}

	@Override
	public void complete() {
		// TODO Auto-generated method stub

	}


}
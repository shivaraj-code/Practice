package com.io.codesystem.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.io.codesystem.dto.model.Medicines;

@Repository
public interface MedicineMaintenanceRepository extends JpaRepository<Medicines, Integer>{

}

package com.wipro.medicine.service;

import com.wipro.medicine.entity.Category;
import com.wipro.medicine.entity.Medicine;
import java.util.List;

public interface MedicineService {
	Medicine saveMedicine(Medicine medicine);

	Medicine saveMedicine(int categoryId,Medicine medicine);

	Medicine getMedicineById(int medieId);

	List<Medicine> getAllMedicines();

	Medicine updateMedicine(Medicine medicine);

	void deleteMedicine(int medieId);

	List<Medicine> getMedicinesByCategory(String categoryName);

	
}

package com.natwest.homedecor.service;
	
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;
import java.util.function.Supplier;
import com.natwest.homedecor.persistence.FurnitureDomain;
import com.natwest.homedecor.persistence.FurnitureRepo;

@Service
public class FurnitureService {
		
	public FurnitureRepo repo;
		
		public FurnitureService(FurnitureRepo repo) {
			super();
			this.repo=repo;
		}
		
		public List<FurnitureDomain> readAll() {
			return this.repo.findAll();
		}
		
		public List<FurnitureDomain> read() {
			List<FurnitureDomain> listOfFurniture = Arrays.asList(new FurnitureDomain(1L, "Table", "Mahogany", 129.99),
					new FurnitureDomain(2L, "Chair", "Pine", 49.99),
					new FurnitureDomain(3L, "Chair", "Plastic White", 23.99));
			return listOfFurniture;
		}	
			
		public FurnitureDomain findById(Long id) {
			return this.repo.findById(id).orElseThrow();
		}
		
		public FurnitureDomain create(FurnitureDomain furniture) {
			return this.repo.saveAndFlush(furniture);
		}
		
		public FurnitureDomain update(Long id, FurnitureDomain furniture) {
			FurnitureDomain exists = this.repo.getById(id);
			exists.setType(furniture.getType());
			exists.setMaterial(furniture.getMaterial());
			exists.setCost(furniture.getCost());
			FurnitureDomain updated = this.repo.save(exists);
			return updated;
		}
		
		public Boolean delete(Long id) {
			this.repo.deleteById(id);
			return this.repo.existsById(id);
		}
}
	



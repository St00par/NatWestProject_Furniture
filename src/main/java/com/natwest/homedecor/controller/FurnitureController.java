package com.natwest.homedecor.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.natwest.homedecor.persistence.FurnitureDomain;
import com.natwest.homedecor.service.FurnitureService;

	@RestController
	public class FurnitureController {
		
		@Autowired
		public FurnitureService service;

			@GetMapping("/newFurniture")
			public FurnitureDomain addNewFurniture() {
				return new FurnitureDomain("Table", "Mahogany", 129.99);
			}
			
			@GetMapping("/read")
			public List<FurnitureDomain> readAll() {
				return this.service.read();
			}
			
			@GetMapping("/getAll")
			public ResponseEntity<List<FurnitureDomain>> getAll() {
				return new ResponseEntity<List<FurnitureDomain>>(this.service.readAll(), HttpStatus.OK);
			}
			
			@PostMapping("/create")
			public ResponseEntity<FurnitureDomain> create(@RequestBody FurnitureDomain furniture) {
				return new ResponseEntity<FurnitureDomain>(this.service.create(furniture), HttpStatus.CREATED);
			}
			
			@PutMapping("/update/{id}")
			public ResponseEntity<FurnitureDomain> update(@PathVariable("id") Long id, @RequestBody FurnitureDomain furniture) {
				return new ResponseEntity<FurnitureDomain>(this.service.update(id, furniture), HttpStatus.ACCEPTED);
			}
			
			@DeleteMapping("/delete/{id}")
			public ResponseEntity<Boolean> update(@PathVariable Long id) {
				return new ResponseEntity<Boolean>(this.service.delete(id), HttpStatus.NO_CONTENT);
			}
}

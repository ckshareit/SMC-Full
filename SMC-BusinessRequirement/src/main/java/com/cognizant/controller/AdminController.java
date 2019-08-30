package com.cognizant.controller;

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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.entity.StockExchange;
import com.cognizant.model.CompanyModel;
import com.cognizant.model.IPODetailModel;
import com.cognizant.model.StockExchangeModel;
import com.cognizant.service.AdminService;

@RestController
@RequestMapping("/adminBR")
public class AdminController {
	
	@Autowired
	private AdminService adminService;
	
	@PostMapping("/company")
	public void addCompany(@RequestBody CompanyModel companyModel) {
		
		adminService.addCompany(companyModel);	
	}
	
	
	@PutMapping("/company")
	public void updateCompany(@PathVariable String id,@RequestBody CompanyModel companyModel) {
		
		adminService.updateCompany(id,companyModel);	
	}
	
	
	@DeleteMapping("/company")
	public void deleteCompany(@RequestBody CompanyModel companyModel) {
		
		adminService.deleteCompany(companyModel);	
	}
	
	@PutMapping("/ipo")
	public void updateIPODetail(@PathVariable String id,@RequestBody IPODetailModel ipoDetailModel) {
		
		adminService.updateIPODetail(id,ipoDetailModel);	
	}
	
	
	@PostMapping("/stockexchange")
public void addStockExchanges(@RequestBody StockExchangeModel stockExchangeModel) {
		
		adminService.addStockExchange(stockExchangeModel);	
	}
	
	@GetMapping("/stockexchange")
	public List<StockExchange> getStockExchanges() {
			
			return adminService.getStockExchanges();	
		}
	
	
	//*************
	@GetMapping("/t")
	public ResponseEntity<Void> check(){
		System.out.println("Check Here");
		
		ResponseEntity<Void> response = null;
		response = new ResponseEntity<Void>(HttpStatus.OK);
		return response;
		
	}
	

}

package com.cognizant.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;

import com.cognizant.model.CompanyModel;
import com.cognizant.model.IPODetailModel;
import com.cognizant.model.StockExchangeModel;
import com.cognizant.model.UserModel;





@RestController
public class AppController {
	
	   @Autowired
	    private RestTemplate restTemplate;
	   
	  
       
	   @GetMapping("/userBR/company/{id}")
	   public CompanyModel getCompany(@PathVariable String id) {
		   return restTemplate.getForObject("https://localhost:8761/SMC-BusinessRequirement/userBR/company/"+id, CompanyModel.class);
		}
	   

		@PostMapping("/adminBR/company")
		public void addCompany(@RequestBody CompanyModel companyModel) {
			 restTemplate.getForObject("https://localhost:8761/SMC-BusinessRequirement/adminBR/company", CompanyModel.class);
		}
		
		
		@PutMapping("/adminBR/company")
		public void updateCompany(@PathVariable String id,@RequestBody CompanyModel companyModel) {
			restTemplate.getForObject("https://localhost:8761/SMC-BusinessRequirement/adminBR/company/"+id+"/"+companyModel, CompanyModel.class);
			
		}
		

		@DeleteMapping("/adminBR/company")
		public void deleteCompany(@RequestBody CompanyModel companyModel) {
			restTemplate.getForObject("https://localhost:8761/SMC-BusinessRequirement/adminBR/company/"+companyModel, CompanyModel.class);
			
		}
		
		@PutMapping("/adminBR/ipo")
		public void updateIPODetail(@PathVariable String id,@RequestBody IPODetailModel ipoDetailModel) {
			
			restTemplate.getForObject("https://localhost:8761/SMC-BusinessRequirement/adminBR/ipo/"+ipoDetailModel, IPODetailModel.class);
		}
	   
		
		@PostMapping("/adminBR/stockexchange")
		public void addStockExchanges(@RequestBody StockExchangeModel stockExchangeModel) {
				
			restTemplate.getForObject("https://localhost:8761/SMC-BusinessRequirement/adminBR/stockexchange/"+stockExchangeModel, StockExchangeModel.class);
			}
		

		@GetMapping("/adminBR/stockexchange")
		public StockExchangeModel getStockExchanges() {
				
				return  restTemplate.getForObject("https://localhost:8761/SMC-BusinessRequirement/adminBR/stockexchange", StockExchangeModel.class);
			}
		
		@GetMapping("/admin/adminlogin")
		public ResponseEntity<Void> login(@RequestBody UserModel userModel,Errors error,HttpServletRequest request)
		{
					
				return	restTemplate.getForObject("https://localhost:8761/SMC-SignupLogin/admin/adminlogin"+userModel, ResponseEntity.class);
		}
		
		@GetMapping("/adminlogout")
		public ResponseEntity<Void> logout(HttpServletRequest request)
		{
			return	restTemplate.getForObject("https://localhost:8761/SMC-SignupLogin/admin/adminlogout", ResponseEntity.class);
		}
		
		
		@PostMapping("/user/register") 
		public ResponseEntity<String> register(@RequestBody UserModel userModel,Errors error)
		{
			return	restTemplate.getForObject("https://localhost:8761/SMC-SignupLogin/user/register"+userModel, ResponseEntity.class);
		}
	   
		
		@GetMapping("/user/userlogin")
		public ResponseEntity<Void> userlogin(@RequestBody UserModel userModel,Errors error,HttpServletRequest request)
		{
			return	restTemplate.getForObject("https://localhost:8761/SMC-SignupLogin/user/userlogin"+userModel, ResponseEntity.class);
		}
		
		@GetMapping("/user/userlogout")
		public ResponseEntity<Void> userlogout(HttpServletRequest request)
		{
			return	restTemplate.getForObject("https://localhost:8761/SMC-SignupLogin/user/userlogout", ResponseEntity.class);
		}
		
		@PutMapping("/user/confirmemail/{id}")
		public ResponseEntity<String> confirmEmail(@PathVariable int id)
		{
			return	restTemplate.getForObject("https://localhost:8761/SMC-SignupLogin/user/confirmemail/"+id, ResponseEntity.class);
		}
	   
		
		@PutMapping("/user/updateuser")
		public ResponseEntity<String> updateUserProfile(@RequestBody UserModel userModel)
		{
			
			return	restTemplate.getForObject("https://localhost:8761/SMC-SignupLogin/user/updateuser/"+userModel, ResponseEntity.class);
		}
}

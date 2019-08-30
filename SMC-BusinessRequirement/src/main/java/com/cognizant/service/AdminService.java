package com.cognizant.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.entity.Company;
import com.cognizant.entity.IPODetail;
import com.cognizant.entity.StockExchange;
import com.cognizant.model.CompanyModel;
import com.cognizant.model.IPODetailModel;
import com.cognizant.model.StockExchangeModel;
import com.cognizant.repository.CompanyRepository;
import com.cognizant.repository.IPODetailRepository;
import com.cognizant.repository.StockExchangeRepository;

@Service
public class AdminService {
	
	@Autowired
	private CompanyRepository companyRepository;
	
	@Autowired
	private IPODetailRepository ipoDetailRepository;
	
	@Autowired
	private StockExchangeRepository stockExchangeRepository;
	
	public void addCompany(CompanyModel companyModel) {

		Company company=companyModel.modelToEntity(companyModel);		
		companyRepository.save(company);
	}

	public void updateCompany(String id,CompanyModel companyModel) {
		
		Company company=companyModel.modelToEntity(companyModel);		
		companyRepository.save(company);
		
	}

	public void deleteCompany(CompanyModel companyModel) {
		Company company=companyModel.modelToEntity(companyModel);		
		companyRepository.delete(company);
		
	}

	public void updateIPODetail(String id, IPODetailModel ipoDetailModel) {
		IPODetail ipoDetail = ipoDetailModel.modelToEntity(ipoDetailModel);
		ipoDetailRepository.save(ipoDetail);
		
	}

	public void addStockExchange(StockExchangeModel stockExchangeModel) {
		StockExchange stockExchange = stockExchangeModel.modelToEntity(stockExchangeModel);
		stockExchangeRepository.save(stockExchange);
		
	}

	public List<StockExchange> getStockExchanges() {
		List<StockExchange> stockExchanges=new ArrayList<>();
		stockExchangeRepository.findAll().forEach(stockExchanges::add);
		
		return stockExchanges;
	}

}

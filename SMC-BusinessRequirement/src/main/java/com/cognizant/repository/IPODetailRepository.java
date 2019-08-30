package com.cognizant.repository;

import org.springframework.data.repository.CrudRepository;

import com.cognizant.entity.Company;
import com.cognizant.entity.IPODetail;

public interface IPODetailRepository extends CrudRepository<IPODetail,Integer>{

}

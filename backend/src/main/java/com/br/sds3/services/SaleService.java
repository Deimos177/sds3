package com.br.sds3.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.br.sds3.dto.SaleDTO;
import com.br.sds3.dto.SaleSuccessDTO;
import com.br.sds3.dto.SalesSumDTO;
import com.br.sds3.entities.Sale;
import com.br.sds3.repositories.SaleRepository;
import com.br.sds3.repositories.SellerRepository;

@Service
public class SaleService {
	
	@Autowired
	private SaleRepository repository;
	
	@Autowired
	private SellerRepository sellerRepository;
	
	@Transactional(readOnly = true)
	public Page<SaleDTO> findAll(Pageable pageable){
		sellerRepository.findAll();
		Page<Sale> result = repository.findAll(pageable);
		
		return result.map(sale -> new SaleDTO(sale));
	}
	
	@Transactional(readOnly = true)
	public List<SalesSumDTO> amountGroupedBySeller(){
		return repository.amountGroupedBySeller();
	}
	
	@Transactional(readOnly = true)
	public List<SaleSuccessDTO> saleSuccess(){
		return repository.successGroupedBySeller();
	}
}
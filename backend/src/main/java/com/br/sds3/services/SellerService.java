package com.br.sds3.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.sds3.dto.SellerDTO;
import com.br.sds3.entities.Seller;
import com.br.sds3.repositories.SellerRepository;

@Service
public class SellerService {
	
	@Autowired
	private SellerRepository repository;
	
	public List<SellerDTO> findAll(){
		List<Seller> result = repository.findAll();
		
		return result.stream().map(seller -> new SellerDTO(seller)).collect(Collectors.toList());
	}
}
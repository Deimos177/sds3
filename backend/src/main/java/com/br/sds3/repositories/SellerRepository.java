package com.br.sds3.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.sds3.entities.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long>{}

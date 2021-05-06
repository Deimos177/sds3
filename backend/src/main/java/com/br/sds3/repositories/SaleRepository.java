package com.br.sds3.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.sds3.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long>{}

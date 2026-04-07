package com.example.onlineshopping_d3.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.onlineshopping_d3.Model.productmodel;

@Repository
public interface product_repo extends JpaRepository<productmodel, Integer> {

}

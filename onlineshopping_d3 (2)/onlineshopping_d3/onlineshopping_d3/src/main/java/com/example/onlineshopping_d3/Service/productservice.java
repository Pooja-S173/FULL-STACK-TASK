package com.example.onlineshopping_d3.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.onlineshopping_d3.Model.productmodel;
import com.example.onlineshopping_d3.Repository.product_repo;

@Service
public class productservice {

    @Autowired
    private product_repo repo;

    public List<productmodel> getAllproductmodel() {
        return repo.findAll();
    }

    public void saveproductmodel(productmodel product) {
        repo.save(product);
    }

    public productmodel getproductmodelById(int id) {
        return repo.findById(id).orElse(null);
    }

    public void deleteproductmodel(int id) {
        repo.deleteById(id);
    }
}

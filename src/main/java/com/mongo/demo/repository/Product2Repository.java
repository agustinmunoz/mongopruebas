package com.mongo.demo.repository;

import com.mongo.demo.dto.Product;
import com.mongo.demo.dto.Product2;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Product2Repository extends MongoRepository<Product2,Integer> {
}

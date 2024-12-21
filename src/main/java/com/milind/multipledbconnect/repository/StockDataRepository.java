package com.milind.multipledbconnect.repository;

import com.milind.multipledbconnect.entity.StockData;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StockDataRepository extends MongoRepository<StockData,String> {
}

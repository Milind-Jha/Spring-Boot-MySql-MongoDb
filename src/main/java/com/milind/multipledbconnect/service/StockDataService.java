package com.milind.multipledbconnect.service;

import com.milind.multipledbconnect.entity.StockData;
import com.milind.multipledbconnect.entity.User;

public interface StockDataService {
    public StockData createNewStock(StockData stockData);
    public StockData getStock(String id);
    public StockData updateStock(String id, StockData newStockData);
    public void deleteStock(String id);
}

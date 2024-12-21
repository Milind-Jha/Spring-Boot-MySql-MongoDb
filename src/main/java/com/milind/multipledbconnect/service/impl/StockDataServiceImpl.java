package com.milind.multipledbconnect.service.impl;
import com.milind.multipledbconnect.entity.StockData;
import com.milind.multipledbconnect.repository.StockDataRepository;
import com.milind.multipledbconnect.service.StockDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StockDataServiceImpl implements StockDataService {

    @Autowired
    private StockDataRepository stockDataRepository;
    @Override
    public StockData createNewStock(StockData stockData) {
        return stockDataRepository.save(stockData);
    }

    @Override
    public StockData getStock(String id) {
        return stockDataRepository.findById(id).orElseThrow(() ->
                new RuntimeException("Stock Not found"));
    }

    @Override
    public StockData updateStock(String id, StockData newStockData) {
        StockData currentStockData = stockDataRepository.findById(id).orElseThrow(() ->
                new RuntimeException("Stock Not found"));
        currentStockData.setStockName(newStockData.getStockName());
        currentStockData.setStockValue(newStockData.getStockValue());
        return stockDataRepository.save(currentStockData);
    }

    @Override
    public void deleteStock(String id) {
        stockDataRepository.deleteById(id);
    }
}

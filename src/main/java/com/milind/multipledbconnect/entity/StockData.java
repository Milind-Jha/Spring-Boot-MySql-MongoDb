package com.milind.multipledbconnect.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.Map;

@Document(collection = "stock_data")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class StockData {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private String id;
    private String stockName;
    private Map<LocalDateTime,Double> stockValue;

    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    public Map<LocalDateTime, Double> getStockValue() {
        return stockValue;
    }

    public void setStockValue(Map<LocalDateTime, Double> stockValue) {
        this.stockValue = stockValue;
    }
}

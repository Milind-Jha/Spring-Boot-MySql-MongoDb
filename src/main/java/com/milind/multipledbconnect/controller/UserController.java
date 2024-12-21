package com.milind.multipledbconnect.controller;

import com.milind.multipledbconnect.entity.StockData;
import com.milind.multipledbconnect.entity.User;
import com.milind.multipledbconnect.service.StockDataService;
import com.milind.multipledbconnect.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @Autowired
    private StockDataService stockDataService;

    // User Endpoints
    @PostMapping("/users")
    public User createUser(@RequestBody User user) {
        return userService.createUser(user);
    }

    @PostMapping("/stocks")
    public StockData createUser(@RequestBody StockData stockData) {
        return stockDataService.createNewStock(stockData);
    }
}

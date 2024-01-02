package com.trading.brokerBridge.controller;

import com.trading.brokerBridge.bean.StrategyData;
import com.trading.brokerBridge.service.TradeFactory;
import com.trading.brokerBridge.service.TradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TradingViewIntegrationController {

    @Autowired
    TradeService service;

    @PostMapping("/order")
    public String executeTrade(@RequestBody StrategyData strategyData) {
        service = TradeFactory.getService(strategyData.getOrderType());
        return service.executeTrade();
    }

    @GetMapping("/getData")
    public StrategyData getEndpoint() {
        return new StrategyData("sigma", "buy", "AAPL","127.0","2");
    }
}

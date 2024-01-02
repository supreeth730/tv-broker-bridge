package com.trading.brokerBridge.service;


import com.trading.brokerBridge.utils.ConstantVariables;
import org.springframework.stereotype.Service;

@Service
public class SellService implements TradeService {
    @Override
    public String executeTrade() {
        return "Sell Stock";
    }

    public String sellLimit() {
        return "Sell Limit";
    }

    public String sellMarket() {
        return "Sell Market";
    }

    public String sellStop() {
        return "Sell Stop";
    }

    @Override
    public ConstantVariables.TradeType getType() {
        return ConstantVariables.TradeType.SELL;
    }
}

package com.trading.brokerBridge.service;


import com.trading.brokerBridge.utils.ConstantVariables;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class BuyService implements TradeService {

    @Override
    public String executeTrade() {
        return "Buy Stock";
    }

    public String buyWithMarketPrice() {
        return "Buy Stock with Market Price";
    }

    public String buyWithLimitPrice() {
        return "Buy Stock with Limit Price";
    }

    public String buyWithStopPrice() {
        return "Buy Stock with Stop Price";
    }

    public String buyWithStopLimitPrice() {
        return "Buy Stock with Stop Limit Price";
    }

    @Override
    public ConstantVariables.TradeType getType() {
        return ConstantVariables.TradeType.BUY;
    }
}

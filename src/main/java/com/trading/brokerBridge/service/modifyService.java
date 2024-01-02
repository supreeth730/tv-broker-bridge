package com.trading.brokerBridge.service;

import com.trading.brokerBridge.utils.ConstantVariables;
import org.springframework.stereotype.Service;

@Service
public class modifyService implements TradeService{


    @Override
    public String executeTrade() {
        return "Modify Trade";
    }

    public String trailingStop() {
        return "Trailing Stop";
    }

    public String stopLoss() {
        return "Stop Loss";
    }

    @Override
    public ConstantVariables.TradeType getType() {
        return ConstantVariables.TradeType.MODIFY;
    }
}

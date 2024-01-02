package com.trading.brokerBridge.service;

import com.trading.brokerBridge.utils.ConstantVariables;

public interface TradeService {

    ConstantVariables.TradeType getType();
    String executeTrade();


}

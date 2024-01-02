package com.trading.brokerBridge.service;

import com.trading.brokerBridge.utils.ConstantVariables;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class TradeFactory {

    @Autowired
    private List<TradeService> services;

    private static final Map<ConstantVariables.TradeType, TradeService> myServiceMap = new HashMap<>();

    @PostConstruct
    public void initMyServiceMap() {
        for(TradeService service : services) {
            myServiceMap.put(service.getType(), service);
        }
    }

    public static TradeService getService(String type) {
        TradeService service = myServiceMap.get(ConstantVariables.TradeType.getFromStatus(type));
        if(service == null) throw new RuntimeException("Unknown service type: " + type);
        return service;
    }
}

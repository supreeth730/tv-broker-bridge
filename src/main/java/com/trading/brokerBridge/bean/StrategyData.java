package com.trading.brokerBridge.bean;


import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class StrategyData {

    @NonNull
    private String strategyName;
    @NonNull
    private String orderType;
    @NonNull
    private String stockName;
    @NonNull
    private String stockPrice;
    @NonNull
    private String stockQuantity;

}

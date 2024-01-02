package com.trading.brokerBridge.utils;

import java.util.Arrays;

public final class ConstantVariables {

    public enum TradeType {

        BUY("buy"),
        SELL("sell"),

        MODIFY("modify"),

        NO_MAPPING("No Mapping");

        private String type;

        TradeType(String type) {
            this.type = type;
        }

        public static TradeType getFromStatus(String type) {
            return Arrays.stream(TradeType.values()).filter(val -> val.getType().equalsIgnoreCase(type.trim())).findFirst().orElse(NO_MAPPING);
        }

        public String getType() {
            return type;
        }

    }
}

package com.trading.brokerBridge.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheckController {

        @GetMapping("/healthCheck")
        public String getEndpoint() {
            return "Broker Bridge is up and running!";
        }
}

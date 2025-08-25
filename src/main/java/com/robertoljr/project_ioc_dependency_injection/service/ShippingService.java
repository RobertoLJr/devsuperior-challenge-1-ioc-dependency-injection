package com.robertoljr.project_ioc_dependency_injection.service;

import com.robertoljr.project_ioc_dependency_injection.entity.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {
    public double calculateShipmentValue(Order order) {
        double baseValue = order.getBaseValue();

        if (baseValue < 100) {
            return 20;
        } else if (baseValue >= 100 && baseValue < 200) {
            return 12;
        } else {
            return 0;
        }
    }
}

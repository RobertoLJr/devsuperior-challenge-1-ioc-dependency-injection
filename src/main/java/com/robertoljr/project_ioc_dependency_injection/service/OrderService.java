package com.robertoljr.project_ioc_dependency_injection.service;

import com.robertoljr.project_ioc_dependency_injection.entity.Order;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.RoundingMode;

@Service
public class OrderService {
    private ShippingService shippingService;

    public OrderService(ShippingService shippingService) {
        this.shippingService = shippingService;
    }

    /**
     * Calculate the total value of the order, including shipping costs and discount.
     * <p>
     *     The shipping costs are calculated using the {@link ShippingService}.
     * </p>
     * @param order     Order to be processed.
     * @return          Total value of the order with up to 2 decimal places precision.
     */
    public double calculateTotalValue(Order order) {
        BigDecimal baseValue = BigDecimal.valueOf(order.getBaseValue());
        BigDecimal discountPercent = BigDecimal.valueOf(order.getDiscount()).divide(BigDecimal.valueOf(100));
        BigDecimal discountedValue = baseValue.multiply(BigDecimal.ONE.subtract(discountPercent));
        BigDecimal shippingValue = BigDecimal.valueOf(shippingService.calculateShipmentValue(order));

        return discountedValue.add(shippingValue).setScale(2, RoundingMode.HALF_UP).doubleValue();
    }
}

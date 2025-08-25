package com.robertoljr.project_ioc_dependency_injection.entity;

public class Order {
    private Integer code;
    private Double baseValue;
    private Double discount;

    public Order() {
    }

    public Order(Integer code, Double baseValue) {
        this.code = code;
        this.baseValue = baseValue;
    }

    public Order(Integer code, Double baseValue, Double discount) {
        this.code = code;
        this.baseValue = baseValue;
        this.discount = discount;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Double getBaseValue() {
        return baseValue;
    }

    public void setBaseValue(Double baseValue) {
        this.baseValue = baseValue;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }
}

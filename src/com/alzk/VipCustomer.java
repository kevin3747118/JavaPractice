package com.alzk;

public class VipCustomer {

    private String name;
    private double creditLimit;
    private String email;

    VipCustomer() {
        this("Default", 50000.0, "kevin@alzk.com.tw");
    }

    VipCustomer(String name, double creditLimit) {
        this(name, creditLimit, "kevin@alzk.com.tw");
    }

    VipCustomer(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}

package com.makosavage;

public class VipCustomer {

    private String name;
    private double limit;
    private String email;

    public VipCustomer() {
        this("Unknown Name", 100.00, "unknown@gmail.com");
    }

    public VipCustomer(String name, double limit) {
        this(name,limit,"Default");
    }

    public VipCustomer(String name, double limit, String email) {
        this.name = name;
        this.limit = limit;
        this.email = email;
    }
}

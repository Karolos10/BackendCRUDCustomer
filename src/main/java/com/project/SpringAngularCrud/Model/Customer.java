package com.project.SpringAngularCrud.Model;

import jakarta.persistence.*;

@Table(name = "customers")
@Entity
public class Customer {

    @Id
    @Column(name = "customer_id", length = 50)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int customerId;

    @Column(name = "customer_name", length = 50)
    private String customerName;

    @Column(name = "customer_email", length = 60)
    private String customerEmail;

    @Column(name = "mobile", length = 12)
    private int mobile;

    public Customer() {
    }

    public Customer(int customerId, String customerName, String customerEmail, int mobile) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.mobile = mobile;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public int getMobile() {
        return mobile;
    }

    public void setMobile(int mobile) {
        this.mobile = mobile;
    }
}

package com.project.SpringAngularCrud.DTO;

public class CustomerSaveDTO {


    private String customerName;

    private String customerEmail;

    private int mobile;

    public CustomerSaveDTO() {
    }

    public CustomerSaveDTO(String customerName, String customerEmail, int mobile) {
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.mobile = mobile;
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

    @Override
    public String toString() {
        return "CustomerSaveDTO{" +
                "customerName='" + customerName + '\'' +
                ", customerEmail='" + customerEmail + '\'' +
                ", mobile=" + mobile +
                '}';
    }
}

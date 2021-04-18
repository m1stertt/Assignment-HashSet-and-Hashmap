package com.company;

import java.util.Objects;

public class Customer {

    private String phoneNumber;
    private String name;
    private String address;
    private String email;

    public Customer(String phoneNumber, String name, String address, String email) {
        this.phoneNumber = phoneNumber;
        this.name = name;
        this.address = address;
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public int hashCode() {
        return Objects.hash(phoneNumber, name, email, address);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (!(obj instanceof Customer)) {
            return false;
        }

        Customer customer = (Customer) obj;

        return customer.phoneNumber.equals(phoneNumber) &&
                Objects.equals(name, customer.name) &&
                Objects.equals(email, customer.email) &&
                Objects.equals(address, customer.address);
    }
}

package com.kaung.pojo;

/**
 * @author HC
 * @version 1.0
 */
public class Address {
    private String address;



    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Address{" +
                "address='" + address + '\'' +
                '}';
    }
}

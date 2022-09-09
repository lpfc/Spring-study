package com.kaung.pojo;

import java.util.*;

/**
 * @author HC
 * @version 1.0
 */
public class Student {
    private String name;
    private Address address;
    private String[] books;
    private List<String> hobbs;
    private Map<String,String> cad;
    private Set<String> games;
    private String wife;
    private Properties info;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String[] getBooks() {
        return books;
    }

    public void setBooks(String[] books) {
        this.books = books;
    }

    public List<String> getHobbs() {
        return hobbs;
    }

    public void setHobbs(List<String> hobbs) {
        this.hobbs = hobbs;
    }

    public Map<String, String> getCad() {
        return cad;
    }

    public void setCad(Map<String, String> cad) {
        this.cad = cad;
    }

    public Set<String> getGames() {
        return games;
    }

    public void setGames(Set<String> games) {
        this.games = games;
    }

    public String getWife() {
        return wife;
    }

    public void setWife(String wife) {
        this.wife = wife;
    }

    public Properties getInfo() {
        return info;
    }

    public void setInfo(Properties info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", address=" + address.toString() +
                ", books=" + Arrays.toString(books) +
                ", hobbs=" + hobbs +
                ", cad=" + cad +
                ", games=" + games +
                ", wife='" + wife + '\'' +
                ", info=" + info +
                '}';
    }
}

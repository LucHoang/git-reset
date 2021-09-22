package com.superr.method;

public class Parent {
    private String website;

    public Parent(String website) {
        this.website = website;
    }

    public void print() {
        System.out.println("Website = " + website);
    }

    public void welcome() {
        System.out.println("Welcome to dev.com");
    }
}

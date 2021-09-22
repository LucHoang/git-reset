package com.superr.constructo;

public class Parent {
    private String website;

    public Parent() {
        System.out.println("This is parent");
        print();
    }

    public Parent(String website) {
        this.website = website;
        System.out.println("This is parent aaaa");
        print();
    }

    public void print() {
        System.out.println("Website = " + website);
    }
}

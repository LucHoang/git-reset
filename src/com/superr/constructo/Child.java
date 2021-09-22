package com.superr.constructo;

public class Child extends Parent{
    public Child() {
        System.out.println("This is child");
    }

    public Child(String website) {
        super(website);
        System.out.println("This is child aaaa");
    }

    public static void main(String[] args) {
        Child child1 = new Child();
        System.out.println("---");
        Child child2 = new Child("dev.com");
    }
}

package com.superr.method;

public class Child extends Parent {

    public Child(String website) {
        super(website);
    }

    public void printChild1() {
        print();
    }

    public void printChild2() {
        super.print();
        welcome();
    }

    public void print() {
        System.out.println("Subject = OOP");
    }

    public static void main(String[] args) {
        Child child = new Child("dev.com");
        child.printChild1();
        System.out.println("---");
        child.printChild2();
    }
}

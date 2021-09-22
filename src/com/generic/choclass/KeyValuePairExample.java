package com.generic.choclass;

public class KeyValuePairExample {
    public static void main(String[] args) {
        KeyValuePair<String, Integer> entry = new KeyValuePair<String, Integer>("luc", 123456789);
        String name = entry.getKey();
        Integer id = entry.getValue();
        System.out.println("Name = " + name + ", Id = " + id); // Name = luc, Id = 123456789
    }
}

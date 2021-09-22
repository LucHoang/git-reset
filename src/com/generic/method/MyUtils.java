package com.generic.method;

import com.kethua.Animal;

import java.util.Collection;

public class MyUtils extends Animal {
    public static <T> int count(Collection<T> collection, T itemToCount) {
//        MyUtils myUtils = new MyUtils();
//        myUtils
        int count = 0;
        for (T item : collection) {
            if (itemToCount.equals(item)) {
                count++;
            }
        }
        return count;
    }

}

package com;

 class Student {
     static boolean foo(char c) {

         System.out.print(c);

         return true;

     }

     public static void main(String[] argv) {

         StringBuffer s = new StringBuffer("hello how are you how?");

         int x = s.indexOf("ow");

         System.out.println(x);


     }
     }

package com.kethua;

public class MultiHeritanceExample extends Printable
//        , Showable
{
    public static void main(String args[]) {
        MultiHeritanceExample obj = new MultiHeritanceExample();
        obj.print();  // Không thể xác định được gọi phương thức print() của class nào
    }
}

package com.company.com;

public class While {
    public static void main(String[] args) {
        int x = 0;
        while (x <= 5) {
            //this is the while statement
            System.out.println("inside while statement " + x);
            x++;
            //incrementing x
        }


        do {
            System.out.println("inside do-while statement  " + x);
        } while (x <= -1);
        //Gave a condition
    }

}
package com.company.com;

public class JavaFirst {

    public JavaFirst(){

    }
    int a=10;
    String b="hello";

    public static void main(String[] args){
        System.out.println("Hello");
        JavaFirst obj1 = new JavaFirst();
        System.out.println(obj1.add(5, 10));
        System.out.println(obj1.subtract(5, 10));
    }
    public static int add(int a , int b){
        int c= a+b;
        return c;
    }
    public static int subtract(int a, int b){
        return a-b;
    }

}



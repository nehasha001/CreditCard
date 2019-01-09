package com.company.com;
import java.util.Scanner;

public class Amex {
    public static void main (String [] args) throws CardNumberNotFound {
        int CardNumber_ID = 000;
        if(CardNumber_ID == 000){
            System.out.println("Your card number is not valid");
            throw new CardNumberNotFound("Enter number");

    }
else{
            System.out.println("Please enter card number");
            Scanner sc1 = new Scanner(System.in);
            String CardNumber = sc1.next();
            System.out.println("Your number is valid");
    }}}



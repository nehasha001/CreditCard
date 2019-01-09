package com.company.com;

public class CardNumberNotFound extends Exception {
    public CardNumberNotFound(){
        super();
    }
    public CardNumberNotFound(String message){
        super("Card Number is not valid");
    }
}

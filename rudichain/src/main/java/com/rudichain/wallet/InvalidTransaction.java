package com.rudichain.wallet;

public class InvalidTransaction extends Exception{  
    public InvalidTransaction(String errorMessage){  
        super(errorMessage);  
    }
}
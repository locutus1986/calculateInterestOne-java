package com.timbuchalka;

public class Main {

    public static void main(String[] args) {
	    for(int i = 2; i < 9; i++){
            System.out.println(calculateInterest(10000, i));
        }
    }
    public static double calculateInterest(double amount, double interestRate){
        return (amount*(interestRate/100));
    }
}

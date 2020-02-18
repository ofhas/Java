package com.company;


import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Mortgage calculator
        Scanner scanner = new Scanner(System.in);
        System.out.print("Principal: ");
        int principal = scanner.nextInt();
        //System.out.println("Principal amount is: " +principal);

        System.out.print("Annual interest rate: ");
        double annualInterestRate = scanner.nextDouble()/1200;
        //System.out.println("The annual interest rate is:"+annualInterestRate);

        System.out.print("Years: ");
        int years = scanner.nextInt();
        //System.out.println("the number of years is:"+ years);
        int numOfPayments = years * 12;

        double mortgage = principal * ((annualInterestRate*(Math.pow(1+annualInterestRate, numOfPayments))/(Math.pow(1+annualInterestRate, numOfPayments)-1)));
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String mortgage1 = currency.format(mortgage);
        System.out.print("Mortgage: "+mortgage1);
    }
}

package com.company;


import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Mortgage calculator
        final int NUM_OF_MONTHS = 12;
        final int PARENTAGE = 100;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Principal: ");
        int principal = scanner.nextInt();

        System.out.print("Annual interest rate: ");
        double annualInterestRate = scanner.nextDouble()/(NUM_OF_MONTHS*PARENTAGE);

        System.out.print("Years: ");
        int years = scanner.nextInt();
        int numOfPayments = years * NUM_OF_MONTHS;

        double mortgage = principal * ((annualInterestRate*(Math.pow(1+annualInterestRate, numOfPayments))/(Math.pow(1+annualInterestRate, numOfPayments)-1)));
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String mortgage1 = currency.format(mortgage);
        System.out.print("Mortgage: "+mortgage1);
    }
}

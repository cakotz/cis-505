package com.example.enhancedfuturevalueapp;

public class FinanceCalculator {
    private static int MONTH_IN_YEAR = 12;
    public static double calculateFutureValue(double monthlyPayment, double rate, int years) {
        int months = years * MONTH_IN_YEAR;

        rate = 1 + rate / 100;

        double presentValue = monthlyPayment * months;

        return presentValue * (Math.pow(rate, months));
    }
}
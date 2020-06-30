package com.devcon.sample;

public class CustomCalculatorImpl implements CustomCalculator {

    public static void main(String[] args) {

        CustomCalculator demo = new CustomCalculatorImpl();

        int sumOfEvens = demo.addEvenNumbers(1,2,3,4,5,6,7,8,9);
        System.out.println(sumOfEvens);

        int sumOfOdds = demo.addOddNumbers(1,2,3,4,5,6,7,8,9);
        System.out.println(sumOfOdds);
    }
}

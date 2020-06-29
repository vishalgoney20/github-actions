package com.zemosolabs.training.githubactions;

public class Main {

    public static void main(String[] args) {
        Calculator calculator = new SimpleCalculatorImpl();
        System.out.println("Product is "+calculator.product(1, 2, 3, 4));
    }

}

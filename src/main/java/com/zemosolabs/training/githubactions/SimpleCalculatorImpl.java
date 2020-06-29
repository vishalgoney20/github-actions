package com.zemosolabs.training.githubactions;

public class SimpleCalculatorImpl implements Calculator {

    @Override
    public int sum(int... args) {
        int sum = 0;
        for(int input : args){
            sum += input;
        }
        return sum;
    }

    @Override
    public int product(int... args) {
        int product = 1;
        for(int input : args){
            product *= input;
        }
        return product;
    }

    @Override
    public int divide(int argA, int argB) {
        if(argB == 0){
            throw new IllegalArgumentException("Divisor (argB) cannot be 0");
        }else {
            return argA / argB;
        }
    }
}

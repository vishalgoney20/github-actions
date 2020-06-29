package com.zemosolabs.training.githubactions;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class SimpleCalculatorTest {

    private final Calculator calculator = new SimpleCalculatorImpl();

    @Test
    public void testSum(){
        Assert.assertEquals(5, calculator.sum(1, 2, 2));
    }

    @Test
    public void testProduct(){
        Assert.assertEquals(4, calculator.product(1, 2, 2));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivide(){
        calculator.divide(1, 0);
    }

}

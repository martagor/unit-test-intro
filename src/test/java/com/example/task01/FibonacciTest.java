package com.example.task01;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by RENT on 2017-07-10.
 */
public class FibonacciTest {

    @Test
    public void shouldReturn0forValue0() {
        //given
        Fibonacci fibonacci = new Fibonacci();

        //when
        int fibonacciResult0 = fibonacci.fibonacci(0);

        //then
        Assert.assertEquals(0, fibonacciResult0);
    }

    @Test
    public void shouldReturn1forValue2() {
        //given
        Fibonacci fibonacci = new Fibonacci();

        //when
        int fibonacciResult2 = fibonacci.fibonacci(2);

        //then
        Assert.assertEquals(1, fibonacciResult2);
    }

    @Test
    public void shouldCReturn3forValue4() {
        //given
        Fibonacci fibonacci = new Fibonacci();

        //when
        int fibonacciResult4 = fibonacci.fibonacci(4);

        //then
        Assert.assertEquals(3, fibonacciResult4);
    }

    @Test
    public void shouldReturn13forValue7() {
        //given
        Fibonacci fibonacci = new Fibonacci();

        //when
        int fibonacciResult7 = fibonacci.fibonacci(7);

        //then
        Assert.assertEquals(13, fibonacciResult7);
    }
}

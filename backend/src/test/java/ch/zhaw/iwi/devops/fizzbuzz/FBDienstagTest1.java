package ch.zhaw.iwi.devops.fizzbuzz;

import org.junit.Test;
import org.junit.Assert;

public class FBDienstagTest1 {

    @Test

    public void testFizzConv(){
        FizzBuzzConverter fizzBuzz = new FizzBuzzConverter();
        Assert.assertEquals("1", fizzBuzz.convert(1));
    }

    @Test

    public void testFizzConv2(){
        FizzBuzzConverter fizzBuzz = new FizzBuzzConverter();
        Assert.assertEquals("2", fizzBuzz.convert(2));
    }


    
}

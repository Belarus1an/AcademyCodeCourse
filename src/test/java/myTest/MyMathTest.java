package myTest;

import org.junit.Assert;
import org.junit.Test;

public class MyMathTest {

    @Test
    public void myMathTestSum(){

        MyMath myMathTest = new MyMath();

        Assert.assertEquals(10, myMathTest.sum(5, 5), 1e-9);
    }

    @Test(expected = ArithmeticException.class)
    public void myMathTestDivide(){
        new MyMath().divide(10, 0);
    }
}

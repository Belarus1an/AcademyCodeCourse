import org.junit.Assert;
import org.junit.Test;
import week2TabliceLatwe.Task5;
import week2TabliceLatwe.Task6;

public class Task5Test {

    /*
        Asercja - if
     */

    @Test
    public void testSumLeft(){
        Task5 task5 = new Task5();
        Assert.assertEquals(6, task5.sumLeft(new int[]{3, 2, 5, 1, 2}, 2));
    }

    @Test
    public void testSumRight(){
        Task6 task6 = new Task6();
        Assert.assertEquals(12, task6.sumRight(new int[]{1, 2, 3, 4, 5}, 1));
    }
}

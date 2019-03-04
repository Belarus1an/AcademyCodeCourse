import org.junit.Assert;
import org.junit.Test;
import week2TabliceSrednie.Task5;

public class Task5Test2 {

    @Test
    public void testMiddleElement(){
        Assert.assertEquals(2, Task5.middleElemet(new int[]{1, 2, 3}));
        Assert.assertEquals(5, Task5.middleElemet(new int[]{1, 5, 3, 4}));
    }
}

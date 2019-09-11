package JunitTest;

import org.junit.Assert;
import org.junit.Test;

public class DevlopTest {

    @Test
    public void  Test01(){
        int tmp = 10;
        Assert.assertEquals(10,tmp);
    }

    @Test
    public void  Test02(){
        int tmp = 20;
        Assert.assertEquals(10,tmp);
    }

    @Test
    public void Test03(){
        int tmp = 20;
        Assert.assertEquals(20,tmp);
    }

}

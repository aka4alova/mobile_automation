package lesson1;

import org.junit.Assert;
import org.junit.Test;

public class MainClassTest {

    @Test
    public void testGetLocalNumber() {
        MainClass mainClass = new MainClass();
        Assert.assertEquals("is not equal 14!", 14, mainClass.getLocalNumber());

    }

}
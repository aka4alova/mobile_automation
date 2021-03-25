package lesson1;

import org.junit.Assert;
import org.junit.Test;

public class MainClassTest {

    @Test
    public void testGetLocalNumber() {
        MainClass mainClass = new MainClass();
        Assert.assertEquals("is not equal 14!", 14, mainClass.getLocalNumber());

    }

    @Test
    public void testGetClassNumber() {
        MainClass mainClass = new MainClass();
        Assert.assertTrue("is less than 45!", mainClass.getClassNumber() > 45);
    }

    @Test
    public void testGetClassString() {
        String str = new MainClass().getClassString();
        Assert.assertTrue("does not contain substring", str.contains("hello") || str.contains("Hello"));
    }

}

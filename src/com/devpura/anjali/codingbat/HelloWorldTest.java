package com.devpura.anjali.codingbat;

import junit.framework.Assert;
import org.junit.Test;

public class HelloWorldTest {

    @Test
    public void testSayMessage() throws Exception {

        HelloWorld mess = new HelloWorld();
        String output = mess.sayMessage("Baby");
        Assert.assertEquals("HelloBaby", output);
    }
    @Test
    public void testbye() throws Exception {
        HelloWorld mess = new HelloWorld();
        String output = mess.bye("Baby");
        Assert.assertEquals("ByeBaby", output);
    }
}
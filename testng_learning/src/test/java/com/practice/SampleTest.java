package com.practice;
import org.testng.annotations.Test;
import org.testng.Assert;

public class SampleTest {
    @Test
    public void testAddition() {
        Assert.assertEquals(2 + 3, 5, "Addition should be correct");
    }

    @Test
    public void testString() {
        Assert.assertEquals("TestNG", "TestNG", "String should match");
    }
}



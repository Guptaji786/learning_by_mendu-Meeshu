package com.practice;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ClassOne {

    @BeforeTest
    public void beforeAnyTestMethod(){
        System.out.println("This is execution before any test");
    }

    @BeforeMethod
    public void beforeMethodFunction(){
        System.out.println("This is the before method function.....");
    }


    @Test
    public void oneMethod() throws InterruptedException {
        Thread.sleep(700);
        System.out.println("This is first function execution....");
    }
}

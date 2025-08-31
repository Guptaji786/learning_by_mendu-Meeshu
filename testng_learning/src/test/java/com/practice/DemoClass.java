package com.practice;

import org.testng.annotations.*;

public class DemoClass {

    @BeforeClass
    public void beforeClassMethod(){
        System.out.println("This is the before class method execution.....");
    }

    @BeforeGroups(groups={"Group One"})
    public void beforeGroupMethod(){
        System.out.println("This is first group method execution......");
    }

    @Test(groups={"Group One"})
    public void groupTestOne(){
        System.out.println("This in the group test one method execution.......");
    }
    @BeforeGroups(groups={"Group Two"})
    public void beforeGroupMethodTwo(){
        System.out.println("This is second group method execution......");
    }
    @Test(groups={"Group Two"})
    public void groupTestTwo(){
        System.out.println("This in the group test two method execution.......");
    }

    @AfterGroups(groups={"Group One"})
    public void afterGroupMethod(){
        System.out.println("This is first after group method execution......");
    }
    @AfterGroups(groups={"Group Two"})
    public void afterGroupMethodTwo(){
        System.out.println("This is second after group method execution......");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("This is the before method execution ..........");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("This is the after method execution ..........");
    }

    @AfterClass
    public void afterClassMethod(){
        System.out.println("This is the after class method execution....");
    }


    @Test
    public void testMethod(){
        System.out.println("This is the test method execution........");
    }
}

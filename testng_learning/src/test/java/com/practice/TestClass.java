package com.practice;

import org.testng.annotations.Test;

@Test
public class TestClass {

    public void testMethodOne(){
        System.out.println("Test method one.");
    }
    public void testMethodTwo(){
        System.out.println("Test method two.");
    }

    //Only public methods are executed by the TestNG and private methods are neglected
    private void testMethodThree(){
        System.out.println("Test method three.");
    }


}

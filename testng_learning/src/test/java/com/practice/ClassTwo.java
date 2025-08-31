package com.practice;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ClassTwo {

    @BeforeClass
    public void beforeClassFunction(){
        System.out.println("This is before class function execution....");
    }

    @Test
    public void twoMethod(){
        System.out.println("This is second function execution....");
    }
}

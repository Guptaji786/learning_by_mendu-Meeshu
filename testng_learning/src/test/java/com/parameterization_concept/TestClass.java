package com.parameterization_concept;

import org.testng.annotations.Test;

/**
 * This is concept of data provider class in different class
 */
public class TestClass {
    @Test(dataProvider = "data-provider",dataProviderClass=DataProviderClass.class)
    public void testMethod(String data) {
        System.out.println("Data is: " + data);
    }
}

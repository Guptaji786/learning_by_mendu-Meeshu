package com.parameterization_concept;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * This is the concept data provider in the same class
 */
public class SameClassDataProvider {
    @DataProvider(name = "data-provider")
    public Object[][] dataProviderMethod() {
        return new Object[][] { { "data one" }, { "data two" } };
    }
    @Test(dataProvider = "data-provider")
    public void testMethod(String data) {
        System.out.println("Data is: " + data);
    }
}

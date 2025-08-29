package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoggedInPage;
import pages.LoginPage;

public class PositiveLoginTest extends BaseTest {

    @Test
    public void positiveLoginTest() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUsername("student");
        loginPage.enterPassword("Password123");
        loginPage.clickSubmit();

        // Verify URL
        String currentUrl = driver.getCurrentUrl();
        assert currentUrl != null;
        Assert.assertTrue(currentUrl.contains("practicetestautomation.com/logged-in-successfully/"), "URL does not match expected.");

        LoggedInPage loggedInPage = new LoggedInPage(driver);
        // Verify success text
        String successText = loggedInPage.getSuccessText();
        System.out.println("Success Login Text: " + successText);
        Assert.assertTrue(successText.contains("Congratulations") || successText.contains("Logged In Successfully"), "Success text not found.");

        // Verify logout button
        Assert.assertTrue(loggedInPage.isLogoutButtonDisplayed(), "Logout button not displayed.");
    }
}
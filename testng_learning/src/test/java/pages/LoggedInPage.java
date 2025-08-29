package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoggedInPage {
    private final WebDriver driver;

    // XPath Locators
    private final By successTextLocator = By.xpath(".//h1[contains(@class, 'post-title')]");
    private final By logoutButtonLocator = By.xpath("//a[contains(text(),'Log out')]");

    public LoggedInPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getSuccessText() {
        return driver.findElement(successTextLocator).getText();
    }

    public boolean isLogoutButtonDisplayed() {
        return driver.findElement(logoutButtonLocator).isDisplayed();
    }
}
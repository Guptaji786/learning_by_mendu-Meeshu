package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;

    // XPath Locators
    private final By usernameLocator = By.xpath("//input[@id='username']");
    private final By passwordLocator = By.xpath("//input[@id='password']");
    private final By submitLocator = By.xpath("//button[@id='submit']");
    private final By errorLocator = By.xpath("//div[@id='error']");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterUsername(String username) {
        driver.findElement(usernameLocator).sendKeys(username);
    }

    public void enterPassword(String password) {
        driver.findElement(passwordLocator).sendKeys(password);
    }

    public void clickSubmit() {
        driver.findElement(submitLocator).click();
    }

    public String getErrorText() {
        return driver.findElement(errorLocator).getText();
    }
}
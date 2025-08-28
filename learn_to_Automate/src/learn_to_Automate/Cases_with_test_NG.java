package learn_to_Automate;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Cases_with_test_NG {

    WebDriver driver;

    @beforeMethod
    public void setup(String[] args) {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(); // Use the class-level driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://practicetestautomation.com/practice-test-login/");
    }

    @Test(priority = 1)
    public void titleCheck() {
        String actualTitle = driver.getTitle();
        System.out.println("Page Title: " + actualTitle);

        if (actualTitle.equals("Test Login | Practice Test Automation")) {
            System.out.println("✅ Title Matched");
        } else {
            System.out.println("❌ Wrong Title");
        }
    }

    @Test(priority = 2)
    public void login() {
        String username = driver.findElement(By.xpath("(//b[contains(text(),'student')])[1]")).getText();
        String password = driver.findElement(By.xpath("(//b[contains(text(),'Password123')])[1]")).getText();

        driver.findElement(By.id("username")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("submit")).click();

        System.out.println("Current URL after login: " + driver.getCurrentUrl());
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
    
    
    //hey Ghochu I am not able to run this with test NG please check it once   
}

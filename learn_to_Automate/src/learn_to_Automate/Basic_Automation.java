package learn_to_Automate;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic_Automation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\cssmg0140425\\Downloads\\chromedriver-win64\\chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://practicetestautomation.com/practice-test-login/");

		// check weather you lend on correct Title or not
		titleCheck(driver);
		// login
		login(driver);
		driver.close();

	}

	public static void titleCheck(WebDriver driver) {
		System.out.println(driver.getTitle());

		String Current_title = driver.getTitle();
		if (Current_title.equals("Test Login | Practice Test Automation")) {
			System.out.println("Title Matched");
		} else {
			System.out.println("wrong title");
		}

	}

	public static void login(WebDriver driver) {

		String username = driver.findElement(By.xpath("(//b[contains(text(),'student')])[1]")).getText();
		String password = driver.findElement(By.xpath("(//b[contains(text(),'Password123')])[1]")).getText();
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("submit")).click();
		System.out.println(driver.getCurrentUrl());

	}

}

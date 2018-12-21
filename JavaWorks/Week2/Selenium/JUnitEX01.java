package Selenium;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.After;
import org.junit.Assert;

public class JUnitEX01 {

	WebDriver driver;
	String baseUrl;
		
	@Before
	public void setup() throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium-JARs\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		baseUrl="http://www.facebook.com";
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}
	
	@Test
	public void testVerifyHomePage1() throws Exception {
		driver.get(baseUrl+"/");
		String actualPageTitle = driver.getTitle();
		System.out.println("Actual Title is "+actualPageTitle);
		String pageTitle = "Facebook - Log In or Sign Up";
		Assert.assertEquals(pageTitle, actualPageTitle);
	}
	@Test
	public void testVerifyHomePage2() throws Exception {
		driver.get(baseUrl+"/");
		String actualUrl = driver.getCurrentUrl();
		System.out.println("Actual URL is "+actualUrl);
		String pageUrl = "https://www.facebook.com/";
		Assert.assertEquals(pageUrl, actualUrl);
	}
	@Ignore
	public void testVerifyHomePage3() throws Exception {
		driver.get(baseUrl+"/");
		WebElement actualElement= driver.findElement(By.id("email"));
		System.out.println("Actual Element is "+actualElement);
		
	}
	
	@After
	public void tearDown() throws Exception {
		driver.quit();
		
	}
}

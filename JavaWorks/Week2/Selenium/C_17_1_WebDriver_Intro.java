package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C_17_1_WebDriver_Intro {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium-JARs\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("http://www.facebook.com/");
		System.out.println("Page Title is " +driver.getTitle());
		
		driver.findElement(By.id("email")).sendKeys("irfan@sdettraining.com");
		driver.findElement(By.cssSelector("#pass")).sendKeys("Passw0rd!@#");
		
		driver.findElement(By.id("u_0_2")).click();
		//*[@id="pass"]--xpath
		//#pass --Selector
		
		String expectedValue = "The email you’ve entered doesn’t match any account. Sign up for an account.";
		String actualValue;
		actualValue="";
		actualValue = driver.findElement(By.cssSelector("#globalContainer > div.uiContextualLayerPositioner._572t.uiLayer>div>div>div")).getText();
				
		System.out.println("The Actual Value is " +actualValue);
		if (expectedValue.equals(actualValue)){
			System.out.println("Test Passed");
					}
		else{
			System.out.println("Test Failed");
			}
		driver.quit();	
				
	}
}

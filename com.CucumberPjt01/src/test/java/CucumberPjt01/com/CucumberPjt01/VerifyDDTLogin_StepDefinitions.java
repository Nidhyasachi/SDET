package CucumberPjt01.com.CucumberPjt01;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class VerifyDDTLogin_StepDefinitions {
	  WebDriver driver;
	    
	@Given("^A User is on the Login Page$")
	public void a_User_is_on_the_Login_Page() throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium-JARs\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);    
	}

	@When("^User enters an invalid \"([^\"]*)\"$")
	public void user_enters_an_invalid(String username) throws Throwable {
		driver.findElement(By.id("email")).sendKeys(username);
		System.out.println(username);   
	}

	@When("^enters an invalid \"([^\"]*)\"$")
	public void enters_an_invalid(String pwd) throws Throwable {
		driver.findElement(By.cssSelector("#pass")).sendKeys(pwd);  
		System.out.println(pwd);   
	}

	@When("^User clicks on the Sign in button$")
	public void user_clicks_on_the_Sign_in_button() throws Throwable {
		driver.findElement(By.id("u_0_2")).click();   
	}

	@Then("^User must not be able to log in to the application$")
	public void user_must_not_be_able_to_log_in_to_the_application() throws Throwable {
	  driver.quit();
	}

}

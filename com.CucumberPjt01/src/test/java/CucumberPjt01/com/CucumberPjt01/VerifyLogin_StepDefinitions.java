package CucumberPjt01.com.CucumberPjt01;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class VerifyLogin_StepDefinitions {
	
	WebDriver driver;
	
	@Given("^A User is on the website$")
	public void a_User_is_on_the_website() throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium-JARs\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	    //throw new PendingException();
	}

	@When("^User types UserName$")
	public void user_types_UserName() throws Throwable {
		driver.findElement(By.id("email")).sendKeys("irfan@sdettraining.com");
	}

	@When("^Usertypes Password$")
	public void usertypes_Password() throws Throwable {
		driver.findElement(By.cssSelector("#pass")).sendKeys("Passw0rd!@#");
		
	}

	@When("^User clicks on the submit button$")
	public void user_clicks_on_the_submit_button() throws Throwable {
		driver.findElement(By.id("u_0_2")).click();
	}

	/*@Then("^User must log in successfully$")
	public void user_must_log_in_successfully() throws Throwable {
		//String expectedValue = "The email you’ve entered doesn’t match any account. Sign up for an account.";
		String actualValue = driver.findElement(By.cssSelector("#globalContainer > div.uiContextualLayerPositioner._572t.uiLayer>div>div>div")).getText();
		Assert.assertEquals(expectedValue, actualValue);
		driver.quit();
	}*/
	
	@Then("^User must not be able to log in successfully and it must say \"([^\"]*)\" \\(order=(\\d+)\\)$")
	public void user_must_not_be_able_to_log_in_successfully_and_it_must_say_order(String expectedValue, int arg2) throws Throwable {
		String actualValue = driver.findElement(By.cssSelector("#globalContainer > div.uiContextualLayerPositioner._572t.uiLayer>div>div>div")).getText();
		Assert.assertEquals(expectedValue, actualValue);
		driver.quit();
	}

}

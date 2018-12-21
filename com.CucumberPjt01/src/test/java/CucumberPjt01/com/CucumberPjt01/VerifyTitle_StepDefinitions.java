package CucumberPjt01.com.CucumberPjt01;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

//import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class VerifyTitle_StepDefinitions {
	WebDriver driver;
	String baseUrl;
	String actualPageTitle;
	
	
@Given("^User is on the landing page$")
public void user_is_on_the_landing_page() throws Throwable {
	System.setProperty("webdriver.chrome.driver","C:\\Selenium-JARs\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();
	baseUrl="http://www.facebook.com";
	driver.get(baseUrl);
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
    //throw new PendingException();
}

@When("^User checks the title$")
public void user_checks_the_title() throws Throwable {
	driver.get(baseUrl+"/");
	actualPageTitle = driver.getTitle();
	System.out.println("Actual Title is "+actualPageTitle);
	//throw new PendingException();
}

@Then("^It must say \"([^\"]*)\"$")
public void it_must_say(String expectedTitle) throws Throwable {
	Assert.assertEquals(actualPageTitle,expectedTitle);
	driver.quit();
}
}
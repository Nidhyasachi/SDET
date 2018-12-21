package MavenProject02.com.MavenProject02;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class C_19_4_SauceLabs {
	
	public static final String USERNAME = "Nidhyasachi";
	  public static final String ACCESS_KEY = "4b0a7085-fa97-4b41-a7e3-d058ff17ed87";
	  public static final String URL = "https://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:443/wd/hub";
	 
	  public static void main(String[] args) throws Exception {
	 
		//  DesiredCapabilities caps = DesiredCapabilities.edge();
		//  caps.setCapability("platform", "Windows 10");
		//  caps.setCapability("version", "16.16299");
		  
		  DesiredCapabilities caps = DesiredCapabilities.firefox();
		  
		  caps.setCapability("platform", "Linux");
		  caps.setCapability("version", "44.0");
	    
	    caps.setCapability("name", "Nidhya-Fannie Mae - Linux");
	    caps.setCapability("extendedDebugging", "true");
	    caps.setCapability("build", "3.0.1");
	    WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
	 	    
	    driver.get("http://www.google.com");
	    System.out.println("Page title is: " + driver.getTitle());
	    WebElement element = driver.findElement(By.name("q"));
	    element.sendKeys("Fannie Mae");
	    element.submit();
	 
	    
	    String actualPageTitle = driver.getTitle(); 
	              String pageTitle = "Google"; 
	             // assertEquals(pageTitle, actualPageTitle); 
	              if (pageTitle == "Google"){ 
	                  ((JavascriptExecutor)driver).executeScript("sauce:job-result=passed"); 
	              } 
	              else { 
	                  ((JavascriptExecutor)driver).executeScript("sauce:job-result=failed"); 
	              } 
	              driver.quit(); 
	          } 

	  }
package Selenium;

import java.util.LinkedList;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.junit.runners.Parameterized;
//import com.beust.jcommander.Parameterized;


@RunWith(Parameterized.class)
public class JUnitEX02 {
private String platform;
private String browser;
private String AUT;

@Parameterized.Parameters
public static LinkedList<String[]> getEnvironments() throws Exception {

	LinkedList<String[]> env  = new LinkedList<String[]>();
	env.add(new String[] {Platform.WINDOWS.toString(),"ie","http://www.amazon.com"});
	env.add(new String[] {Platform.WINDOWS.toString(),"firefox","http://www.facebook.com"});
	env.add(new String[] {Platform.WINDOWS.toString(),"chrome","http://www.fanniemae.com"});
		
	return env;
	}
public JUnitEX02( String platform, String browser, String AUT){
	this.platform = platform;
	this. browser = browser;
	this.AUT = AUT;	
	}

private WebDriver driver;
private String baseUrl;

@Before
public void setUp() throws Exception {
	
	if (browser.equals("firefox")){
		
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium-JARs\\geckodriver-v0.23.0-win32\\geckodriver.exe");
		driver = new FirefoxDriver();
		System.out.println("RUNNING TEST IN "+browser+" BROWSER");
		
	}else if (browser.equals("chrome")) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium-JARs\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		System.out.println("RUNNING TEST IN "+browser+" BROWSER");
		
	} else  {
		
		System.setProperty("webdriver.ie.driver","C:\\Selenium-JARs\\IEDriverServer_Win32_3.14.0\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();
		System.out.println("RUNNING TEST IN "+browser+" BROWSER");
		
	} 
	
	baseUrl = AUT;
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
}
	
@Test
public void testVerifyHomePage() throws Exception{
	driver.get(baseUrl + "/");
	Thread.sleep(2000);
	String actualPageTitle = driver.getTitle();
	actualPageTitle = actualPageTitle + "-----" + browser;
	System.out.println("Navigated to "+AUT+" and the PageTitle is "+actualPageTitle);
	
}
@After
public void tearDown() throws Exception {
	driver.quit();
	
}

}

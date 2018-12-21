package MavenProject02.com.MavenProject02;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.phantomjs.PhantomJSDriver;

public class C_17_3b_PhantomJSDriver {

	static WebDriver driver;
	
	public static void main(String[] args) throws IOException {
		//C:\121718\softwares\phantomjs-2.1.1-windows\phantomjs-2.1.1-windows\bin
		
		File file = new File("C:\\121718\\softwares\\phantomjs-2.1.1-windows\\phantomjs-2.1.1-windows\\bin\\phantomjs.exe");				
	    
		System.setProperty("phantomjs.binary.path", file.getAbsolutePath());
		
	    driver = new PhantomJSDriver();	
	    driver.get("http://www.google.com"); 
	    
	    WebElement element = driver.findElement(By.name("q"));	
	    element.sendKeys("Donald Trump");
	    
	    captureScreenshot();
	    
	    element.submit();         			
	   
	    System.out.println("PhantomJSDriver Browser: Page title is: " + driver.getTitle());		
	    driver.quit();	
	}
	
	
	
	
	public static void captureScreenshot() throws IOException {

		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		Date d = new Date();
		String screenshotName = d.toString().replace(":", "_").replace(" ", "_") + ".jpg";

		FileUtils.copyFile(scrFile,
				new File("C:\\121718\\screenshots\\" + screenshotName));
		System.out.println("Screenshot captured and stored as: " + screenshotName);	
	
	}
	
}
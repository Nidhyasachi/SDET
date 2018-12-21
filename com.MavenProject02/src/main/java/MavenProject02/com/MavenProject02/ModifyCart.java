package MavenProject02.com.MavenProject02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ModifyCart {

	public void ModifyCartItems(WebDriver driver) {
	 
		
		driver.findElement(By.name("txtItemQty1")).clear();
	    driver.findElement(By.name("txtItemQty1")).sendKeys("3");
	    System.out.println("Modified Cart");
	    driver.findElement(By.xpath("(//input[@name='cmdSubmit'])[2]")).click();
		// next line is clicking on proceed to checkout
		driver.findElement(By.xpath("(//input[@name='cmdSubmit'])[3]")).click();
		
	    


	}

}

package MavenProject02.com.MavenProject02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddToCart {

	public void AddItemToCart(WebDriver driver) {
		driver.findElement(By.xpath("html/body/font/table[1]/tbody/tr[2]/td[3]/a/img")).click();
		System.out.println("Added to cart");
	   
	}

}
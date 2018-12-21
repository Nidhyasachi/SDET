package MavenProject02.com.MavenProject02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderConfirmation {

	public void OrderConfirmMessage(WebDriver driver) {

		String OrderConfirmationMessage = driver.findElement(By.cssSelector("h2")).getText();
		System.out.println("Placed the Order successfully"+OrderConfirmationMessage);

	}

}
package MavenProject02.com.MavenProject02;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

//import com.relevantcodes.extentreports.LogStatus;

//import com.seleniumtest.day2.Log;

public class Search {

	public void SearchItem(WebDriver driver, String ItemToSearch) {

		System.out.println("Implement Search Functionality Here");

		driver.findElement(By.name("txtSearch")).clear();

		driver.findElement(By.name("txtSearch")).sendKeys(ItemToSearch);

		// extentTest.log(LogStatus.INFO, "Searching Item: " +item2Search);

		// Log.info("Searching for Item: " + item2Search);

		System.out.println("Searching for Item: " + ItemToSearch);

		driver.findElement(By.id("Go")).click();

		

	}

}
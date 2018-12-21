package MavenProject02.com.MavenProject02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckOut {

	public void CheckOutItems(WebDriver driver) {

		driver.findElement(By.name("txtCustomerName")).clear();
		driver.findElement(By.name("txtCustomerName")).sendKeys("Irfan");
		driver.findElement(By.name("txtAddress")).clear();
		driver.findElement(By.name("txtAddress")).sendKeys("123 Main St");
		driver.findElement(By.name("txtCity")).clear();
		driver.findElement(By.name("txtCity")).sendKeys("Manhattan");
		driver.findElement(By.name("txtState")).clear();
		driver.findElement(By.name("txtState")).sendKeys("NY");
		driver.findElement(By.name("txtZIP")).clear();
		driver.findElement(By.name("txtZIP")).sendKeys("10018");
		driver.findElement(By.name("txtPhone")).clear();
		driver.findElement(By.name("txtPhone")).sendKeys("212551212");

		driver.findElement(By.name("optPaymentType")).click();
		driver.findElement(By.name("txtAcctNo")).clear();
		driver.findElement(By.name("txtAcctNo")).sendKeys("5465464654544");
		driver.findElement(By.name("txtCVV2No")).clear();
		driver.findElement(By.name("txtCVV2No")).sendKeys("123");
		driver.findElement(By.name("txtExpDate")).clear();
		driver.findElement(By.name("txtExpDate")).sendKeys("12/2015");

		driver.findElement(By.name("txtshipCustomerName")).clear();
		driver.findElement(By.name("txtshipCustomerName")).sendKeys("Irfan");
		driver.findElement(By.name("txtshipAddress")).clear();
		driver.findElement(By.name("txtshipAddress")).sendKeys("");
		driver.findElement(By.name("txtshipCity")).clear();
		driver.findElement(By.name("txtshipCity")).sendKeys("");
		driver.findElement(By.name("txtshipState")).clear();
		driver.findElement(By.name("txtshipState")).sendKeys("NJ");
		driver.findElement(By.name("txtshipZIP")).clear();
		driver.findElement(By.name("txtshipZIP")).sendKeys("");
		driver.findElement(By.name("txtshipPhone")).clear();
		driver.findElement(By.name("txtshipPhone")).sendKeys("");
		driver.findElement(By.xpath("(//input[@name='cmdSubmit'])[3]")).click();

		System.out.println("Checking Out");

	}

}
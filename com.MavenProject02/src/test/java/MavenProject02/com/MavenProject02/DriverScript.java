package MavenProject02.com.MavenProject02;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeTest;

import org.testng.annotations.Test;

public class DriverScript {

	WebDriver driver;

	String ItemToSearch = "Echo";

	@BeforeTest

	public void setup() {

		System.out.println("Browser gets prepared here and will navigate to the AUT");

		String AUT = "http://sdettraining.com/online";

		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.manage().window().maximize();

		driver.get(AUT);

	}

	@Test

	public void tc_End2EndShoppingCartTest() {

		System.out.println("Step 1: Search Class/ Page Object will get called");

		Search sp = new Search();

		sp.SearchItem(driver, ItemToSearch);

		System.out.println("Step 2: AddToCart Class/ Page Object will get called");
		
		AddToCart at = new AddToCart();
		at.AddItemToCart(driver);

		System.out.println("Step 3: ModifyCart Class/ Page Object will get called");
		ModifyCart mt = new ModifyCart();
		mt.ModifyCartItems(driver);
		
		System.out.println("Step 4: CheckOut Class/ Page Object will get called");
		CheckOut co = new CheckOut();
		co.CheckOutItems(driver);
		
		System.out.println("Step 5: OrderConfirmation Class/ Page Object will get called");
        OrderConfirmation oc = new OrderConfirmation();
        oc.OrderConfirmMessage(driver);
		

	}

	@AfterMethod
	public void tearDown() {
		System.out.println("Closing the Browser");
		driver.quit();

	}

}
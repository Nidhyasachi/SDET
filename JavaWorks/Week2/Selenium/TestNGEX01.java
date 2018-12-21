package Selenium;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeGroups;

public class TestNGEX01 {


	
@Test(priority=0)
  public void setupLogin() {
	  System.out.println("Logged In");
  }
 @BeforeGroups("Search")
 public void Search(){
	  System.out.println("Searching");
  }
  @Test(groups={"Search"}, priority=0)
  public void SearchHardware(){
	  System.out.println("Search for Hardware item");
  }
  @Test(groups={"Search"}, priority=1)
  public void SearchSoftware(){
	  System.out.println("Search for Software item");
  }
  @Test(priority=2)
  public void AddToCart(){
	  System.out.println("Adding to Cart");
  }
  @Test(priority=3)
  public void ModifyCart(){
	  System.out.println("Modifying Cart");
  }
  @Test(priority=4)
  public void Checkout(){
	  System.out.println("CheckingOut");
  }
  @Test(priority=5)
  public void ConfirmOrder(){
	  System.out.println("Confirm Order");
  }
  @Test(priority=6)
  public void Logout(){
	  System.out.println("Logout");
  }
}
  
  
  
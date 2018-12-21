package Selenium;

import org.junit.Test;
import org.testng.annotations.BeforeClass;

public class useDataFromTestNG {
	String Pet;
	@BeforeClass
	@org.testng.annotations.Parameters(value={"pet","browser","version","platform"})
	public void setUp(String pet,String browser,String version, String platform) throws Exception {
	
	 Pet = pet;
	 
		
	}
	
	@Test
	public void tc_useDataFromTestNG(){
		System.out.println("This is coming from TestNG " +Pet);
	}
	
}

package MavenProject01.com.MavenProject01.Tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TEST01 {
	String Pet;
	@BeforeClass
	@org.testng.annotations.Parameters(value={"pet","browser","version","platform"})
	public void setUp(String pet,String browser,String version, String platform) throws Exception {
	
	 Pet = pet;
	 
		
	}
	
	@Test
	public void tc_TEST(){
		System.out.println("This is coming from TestNG " +Pet);
	}
	
}

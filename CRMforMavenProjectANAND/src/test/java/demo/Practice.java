package demo;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Practice {
	

	@Test(groups = "SmokeTesting")
	public void createOraginizationTest() {
	Reporter.log("Created Org Successfully", true);
	}
	@Test
	public void
	createOraginizationWithTypeAndIndustryTest() {
	Reporter.log("Created Org with type and industry Successfully", true);
	}
	@BeforeSuite
	public void configBS() {
	Reporter.log("Establish DB Connectivity", true);
	}
	@AfterSuite
	public void configAS() {
	Reporter.log("Disconnect DB Connection", true);
	}
	@BeforeTest
	public void configBT() {
	Reporter.log("Pre-Condition", true);
	}
	@AfterTest
	public void configAT() {
	Reporter.log("Post-Condition", true);
	}
	@BeforeClass
	public void configBC() {
	Reporter.log("Launching the Browser", true);
	}
	@AfterClass
	public void configAC() {
	Reporter.log("Close the browser", true);
	}
	@BeforeMethod
	public void configBM() {
	Reporter.log("Login", true);
	}
	@AfterMethod
	public void configAM() {
	Reporter.log("Logout", true);
	}


}

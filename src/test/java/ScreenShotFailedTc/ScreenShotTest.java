package ScreenShotFailedTc;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListener.class)
public class ScreenShotTest extends Base{

	@BeforeMethod
	public void setup() {
		initialization();
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	@Test
	public void loginTest() {
		
		AssertJUnit.assertEquals(false, true);
	}
	
	@Test
	public void searchTest() {
		
		AssertJUnit.assertEquals(false, true);
	}
	@Test
	public void CreateDealsTest() {
		
		AssertJUnit.assertEquals(false, true);
	}
	@Test
	public void CreateContactTest() {
		
		AssertJUnit.assertEquals(false, true);
	}
	@Test
	public void hompageTest() {
		
		AssertJUnit.assertEquals(false, true);
	}
}

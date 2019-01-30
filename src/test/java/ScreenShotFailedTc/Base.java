package ScreenShotFailedTc;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

	public static WebDriver driver;

	public static void initialization() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\prashant\\Desktop\\seleniumjarfiles\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("http://www.google.com");
	}

	public void failed(String testMethodName) throws IOException {
		File scrfile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrfile,new File("C:\\Users\\prashant\\eclipse-workspace\\ScreenShotOnlyFailedTc\\Screenshots"
        		+ "\\"+testMethodName+"_"+".jpg"));
        System.out.println("sjdhsjhdfjhjgh345");
        System.out.println("my name is prashant");

      
	}

}

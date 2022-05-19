
package org.stepdefin;

import java.io.File

;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.base.FunctionalLib;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks  {
	WebDriver driver;
	
	@Before
	public void chrome() throws IOException {
	TakesScreenshot ts =(TakesScreenshot)driver;
	File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(screenshotAs, new File("C:\\Users\\lenovo\\Desktop\\suma.png"));
		
	}
@After
public void after() throws IOException {
	TakesScreenshot ts =(TakesScreenshot)driver;
	File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(screenshotAs, new File("C:\\Users\\lenovo\\Desktop\\summa.png"));
	
}

}

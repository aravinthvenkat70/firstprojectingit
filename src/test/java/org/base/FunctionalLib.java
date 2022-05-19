package org.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FunctionalLib {
	public static WebDriver driver;
	
	public static void browserlaunch(String browser,String url) {
		switch (browser) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get(url);
			driver.manage().window().maximize();
			
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			driver.get(url);
			driver.manage().window().maximize();
			
			break;


		default:
			break;
		}
		

	}
	
	public static void passtext(WebElement element,String txt) {
	element.sendKeys(txt);

	}
	public static void click(WebElement element) {
		element.click();

	}
	public static void clear(WebElement element) {
		element.clear();

	}
	

}

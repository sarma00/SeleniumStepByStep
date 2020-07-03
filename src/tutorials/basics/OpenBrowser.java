package tutorials.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;

public class OpenBrowser {
	WebDriver driver;
	String appUrl = "https://www.facebook.com";
	String expectedTitle = "Facebook – log in or sign up";
	
	
	public static void main(String[] args){		
		OpenBrowser browserObj =  new OpenBrowser();
		browserObj.openChromeBrowser();
		browserObj.openFirefoxBrowser();
		browserObj.openIEBrowser();		
	}
	
	public void openChromeBrowser(){
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(appUrl);
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
	}
	
	public void openFirefoxBrowser(){
		System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get(appUrl);
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);		
	}

	public void openIEBrowser(){
		System.setProperty("webdriver.ie.driver", "drivers/IEDriverServer.exe");
		driver = new InternetExplorerDriver();
		driver.get(appUrl);
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
	}
}

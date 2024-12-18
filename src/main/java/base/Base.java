package base;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import utils.GenricUtils;

public class Base {
	public static WebDriver driver;
	public GenricUtils util= new GenricUtils();
   
	public void openBrowser() throws IOException {
		// TODO Auto-generated method stub
		try{String browser=util.readData("browser");
		if(browser.equalsIgnoreCase("chrome"))
		{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
        WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		}
		else
		{
		System.out.println("Please provide a proper browser value..");
		}
		String url=util.readData("URL");
        driver.get(url);
        driver.manage().window().maximize();
		} 
		
	   catch (Exception e) {
			throw new RuntimeException(e);
		}  
	}
	
	public static void closeBrowser(){
		driver.quit();
	}

}

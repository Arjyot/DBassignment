package utils;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class GenricUtils {

    static WebDriver driver;
	
	public String readData(String value) throws IOException{
		FileReader reader= new FileReader(System.getProperty("user.dir")+"\\src\\main\\resources\\Config\\config.properties");
		Properties properties = new Properties();
		properties.load(reader);
		
		return properties.getProperty(value);
	}
	public static  void explicitwait(WebElement ele) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		try {
		wait.until(ExpectedConditions.visibilityOf(ele));}
		catch(Exception e){
			System.out.println("Element is not visble in specific time");
			}
		}
}
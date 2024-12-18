package pages;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Base;
import utils.GenricUtils;

public class HomePage extends Base {
	
	
	@FindBy( xpath = "//img[@alt='ESPNcricinfo']")
	private WebElement espnLogo;

	@FindBy( xpath = "//a[contains(text(),'Live Scores')]")
	private WebElement liveScore;
	
    @FindBy( xpath = "//a[contains(text(),'Series')]")
	private WebElement series;
    
    @FindBy( xpath = "//a[contains(text(),'Teams')]")
	private WebElement teams;
    
    @FindBy( xpath = "//a[contains(text(),'News')]")
	private WebElement news;
	
    @FindBy( xpath = "//a[contains(text(),'Features')]")
	private WebElement features;
    
    @FindBy( xpath = "//a[contains(text(),'Videos')]")
	private WebElement videos;
    
    @FindBy( xpath = "//a[contains(text(),'Stats')]")
	private WebElement stats;
    
    @FindBy( xpath = "//div[contains(text(),'Edition IN')]")
	private WebElement editionIN;
    
    @FindBy( xpath = "//i[@class='icon-wb_sunny-filled ds-text-icon-inverse']")
	private WebElement sunnyModeIcon;
    
    @FindBy( xpath = "//i[@class='icon-dark_mode-filled ds-text-icon-inverse']")
	private WebElement darkModeIcon;
    
    @FindBy( xpath = "//i[@class='icon-notifications-filled ds-text-icon-inverse']")
	private WebElement notificationsIcon;
    
    @FindBy( xpath = "//i[@class='icon-translate ds-text-icon-inverse ds-mr-1']")
	private WebElement translateIcon;
    
    @FindBy( xpath = "//i[@class='icon-apps-filled ds-text-icon-inverse ci-nav-item ci-nav-hover ds-cursor-pointer']")
	private WebElement appsIcon;
    
    @FindBy( xpath = "//i[@class='icon-search-outlined ds-text-icon-inverse ci-nav-item ci-nav-hover']")
	private WebElement searchIcon;
    
    
    public HomePage() throws IOException {
		openBrowser();
		PageFactory.initElements(driver, this);
		
	}
	public void validatehomepage(String title) {
		GenricUtils.explicitwait(espnLogo);
		if(espnLogo.isDisplayed()) {
			Assert.assertTrue(true);
		}
		Assert.assertEquals(driver.getTitle(), title);
	}
	
	public void validateHeaderData(String data1, String data2, String data3, String data4, String data5, String data6, String data7,String data8) {
		
		if(liveScore.getText().equalsIgnoreCase(data1) && series.getText().equalsIgnoreCase(data2) &&
				teams.getText().equalsIgnoreCase(data3) && news.getText().equalsIgnoreCase(data4)&&
				features.getText().equalsIgnoreCase(data5) &&videos.getText().equalsIgnoreCase(data6) 
				&& stats.getText().equalsIgnoreCase(data7)&& editionIN.getText().equalsIgnoreCase(data8) 
				&& darkModeIcon.isDisplayed() && notificationsIcon.isDisplayed()&& translateIcon.isDisplayed() 
				&& appsIcon.isDisplayed() && searchIcon.isDisplayed() )
		{
			Assert.assertTrue("Hearder text and icons are verifed", true);;
			
		}
		else {
			Assert.fail("Hearder text and icons are missing form header");
		}
		}
	
	public void sunnyMode() {
		
		if(darkModeIcon.isDisplayed()) {
			Assert.assertTrue("sunny mode is on", true);
		}
		else {
			Assert.fail("Sunny mode icon is not display");
		}
		}
	
	public void DarkMode() {
		GenricUtils.explicitwait(darkModeIcon);
		darkModeIcon.click();
		if(sunnyModeIcon.isDisplayed()) {
			Assert.assertTrue("dark mode is on", true);
		}
		else {
			Assert.fail("dark mode icon is not display");
		}
		}
	}

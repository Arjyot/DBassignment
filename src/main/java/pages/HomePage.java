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
	private WebElement liveScoreLink;
	
    @FindBy( xpath = "//a[contains(text(),'Series')]")
	private WebElement seriesLink;
    
    @FindBy( xpath = "//a[contains(text(),'Teams')]")
	private WebElement teamsLink;
    
    @FindBy( xpath = "//a[contains(text(),'News')]")
	private WebElement newsLink;
	
    @FindBy( xpath = "//a[contains(text(),'Features')]")
	private WebElement featuresLink;
    
    @FindBy( xpath = "//a[contains(text(),'Videos')]")
	private WebElement videosLink;
    
    @FindBy( xpath = "//a[contains(text(),'Stats')]")
	private WebElement statsLink;
    
    @FindBy( xpath = "//div[contains(text(),'Edition IN')]")
	private WebElement editionINLink;
    
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
	
	public void validateHeaderData(String header1, String header2, String header3, String header4, String header5, String header6, String header7,String header8) {
		
		if(liveScoreLink.getText().equalsIgnoreCase(header1) && seriesLink.getText().equalsIgnoreCase(header2) &&
				teamsLink.getText().equalsIgnoreCase(header3) && newsLink.getText().equalsIgnoreCase(header4)&&
				featuresLink.getText().equalsIgnoreCase(header5) &&videosLink.getText().equalsIgnoreCase(header6) 
				&& statsLink.getText().equalsIgnoreCase(header7)&& editionINLink.getText().equalsIgnoreCase(header8) 
				 )
		{
			Assert.assertTrue("Hearder text and icons are verifed", true);;
			
		}
		
		else {
			Assert.fail("Hearder text and icons are missing form header");
		}
		
		if(darkModeIcon.isDisplayed() && notificationsIcon.isDisplayed()&& translateIcon.isDisplayed() 
				&& appsIcon.isDisplayed() && searchIcon.isDisplayed()) {
			
	     Assert.assertTrue("icons are verifed", true);;
			
		}
		
		else {
			Assert.fail("icons are missing form header");
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

package stepDefinitions;

import java.io.IOException;

import base.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;

public class HomePageStepDefinitions {
	
	HomePage homePage;
	
	
	@Given("lunch bowser then open the ESPNcricinfo Website")
	public void lunch_bowser_then_open_the_ESPNcricinfo_Website() throws IOException {
		homePage = new HomePage();
		}
	

    @When("validate the home homepage title {string}")
    public void validate_the_home_homepage_title(String title) {
    	homePage.validatehomepage(title);
    }

    @Then("validate the header data{string}{string}{string}{string}{string}{string}{string}{string}")
    public void validate_the_header_data_live_scores(String header1, String header2, String header3, String header4, String header5, String header6, String header7,String header8) {
     homePage.validateHeaderData(header1, header2, header3, header4, header5, header6, header7, header8);;
     Base.closeBrowser();
    }

    @When("validate the sunny mode")
    public void validate_the_sunny_mode() {
    	homePage.sunnyMode();
    }

    @When("validate the night mode")
    public void validate_the_night_mode() {
    	homePage.DarkMode();
    	Base.closeBrowser();
    }
   }

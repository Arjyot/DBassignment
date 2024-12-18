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
    public void validate_the_header_data_live_scores(String data1, String data2, String data3, String data4, String data5, String data6, String data7,String data8) {
     homePage.validateHeaderData(data1, data2, data3, data4, data5, data6, data7, data8);
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

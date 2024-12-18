Feature: Validate the homepage header and data

Background:
Given lunch bowser then open the ESPNcricinfo Website 

@reg
Scenario Outline: Verify the header of ESPNcricinfo Website 
When validate the home homepage title "Today's Cricket Match | Cricket Update | Cricket News | ESPNcricinfo"
Then validate the header data"<Header1>""<Header2>""<Header3>""<Header4>""<Header5>""<Header6>""<Header7>""<Header8>"


Examples:
|Header1|Header2|Header3|Header4|Header5|Header6|Header7|Header8|
|Live Scores|Series|Teams|News|Features|Videos|Stats|Edition IN|

@reg
Scenario Outline: Verify the sunnymode and night mode  
When validate the sunny mode
When validate the night mode
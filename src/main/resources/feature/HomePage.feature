Feature: Validate the homepage header and data

Background:
Given lunch bowser then open the ESPNcricinfo Website 

@reg
Scenario Outline: Verify the header of ESPNcricinfo Website 
When validate the home homepage title "Today's Cricket Match | Cricket Update | Cricket News | ESPNcricinfo"
Then validate the header data"<text1>""<text2>""<text3>""<text4>""<text5>""<text6>""<text7>""<text8>"


Examples:
|text1|text2|text3|text4|text5|text6|text7|text8|
|Live Scores|Series|Teams|News|Features|Videos|Stats|Edition IN|

@reg
Scenario Outline: Verify the sunnymode and night mode  
When validate the sunny mode
When validate the night mode
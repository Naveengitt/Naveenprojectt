package com.stepdefinitionfarrow;

import com.Baseclass.Base_Classs;
import com.pom.Pageobjectmanagerr;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepdeffarrow extends Base_Classs {	
	Pageobjectmanagerr pom = new Pageobjectmanagerr(driver);
	@Given("User needs to Launch the Browser")
	public void user_needs_to_launch_the_browser() {
	   browserlaunch("https://farrow.com/");
	}
	
	@When("User needs to navigate to services section")
	public void user_needs_to_navigate_to_services_section() {
	    mousemovetoelement(pom.getst().getServicesmovetotab());
	}
	@When("User needs to click customs brokeage")
	public void user_needs_to_click_customs_brokeage() {
	   clickonelementt(pom.getst().getCustomsbrokage());
	}
	@When("User needs scroll down to first time and occassional")
	public void user_needs_scroll_down_to_first_time_and_occassional() {
	   executeJavaScriptt("arguments[0].scrollIntoView();", pom.getst().getLearnmore());
	}
	@Then("User needs to click on learn more")
	public void user_needs_to_click_on_learn_more() {
	    mouseclick(pom.getst().getLearnmore());
	}    
	
	@Given("Switch to another window")
	public void switch_to_another_window() {
	    windowswitch(1);
	}
	@When("User needs scroll to automotive")
	public void user_needs_scroll_to_automotive() {
	    executeJavaScriptt("arguments[0].scrollIntoView();", pom.getst().getAutomotivesection());
	}
	@Then("User needs to click on learn more1")
	public void user_needs_to_click_on_learn_more1() {
	    clickonelementt(pom.getst().getAutomotivesection());
	}
	
	@Given("User needs to switch to another window")
	public void user_needs_to_switch_to_another_window() {
	   windowswitch(2);
	}
	@When("User needs to scroll to industrial overview")
	public void user_needs_to_scroll_to_industrial_overview() {
	    executeJavaScriptt("arguments[0].scrollIntoView();", pom.getat().getIndoverview());
	}
	@When("User needs to click on the industrial overview")
	public void user_needs_to_click_on_the_industrial_overview() {
	    clickonelementt(pom.getat().getIndoverview());
	}
	@When("User needs to scroll to view all resources")
	public void user_needs_to_scroll_to_view_all_resources() {
	   executeJavaScriptt("arguments[0].scrollIntoView();", pom.getat().getAllresources());
	}
	@Then("User needs to click on view all resources")
	public void user_needs_to_click_on_view_all_resources() {
	   clickonelementt(pom.getat().getAllresources());
	   implictttwaitt();
	   closebrowser();
	}

}

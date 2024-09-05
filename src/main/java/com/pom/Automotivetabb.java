package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Baseclass.Base_Classs;

public class Automotivetabb extends Base_Classs {
	
	public Automotivetabb(WebDriver driver1) {
		driver= driver1;
		PageFactory.initElements(driver, this);
	}
	
	

	@FindBy(xpath = "(//a[text()='Industries Overview'])[2]")
	private WebElement indoverview;
	
	@FindBy(xpath = "(//a[text()='View All Resources'])[1]")
	private WebElement allresources;

	public WebElement getIndoverview() {
		return indoverview;
	}

	public WebElement getAllresources() {
		return allresources;
	}
	
	
	
	

}

package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.Baseclass.Base_Classs;

public class Pageobjectmanagerr extends Base_Classs {
	public Pageobjectmanagerr(WebDriver driver1) {
		driver = driver1;
		PageFactory.initElements(driver, this);
	}
	
	private Automotivetabb at;
	
	private servicetabb st;
	
	public servicetabb getst() {
		st = new servicetabb(driver);
		return st;
	}
	
	public Automotivetabb getat() {
		at = new Automotivetabb(driver);
		return at;
	}

}

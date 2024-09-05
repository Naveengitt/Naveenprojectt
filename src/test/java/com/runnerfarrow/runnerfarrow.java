package com.runnerfarrow;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\nsk47\\eclipse-workspace\\Cucumberfarrowproject\\src\\test\\java\\com\\featurefarrow\\Farrowwebsite.feature"
                  ,glue = "com.stepdefinitionfarrow",
                  plugin = {"pretty",
                  "html:Reports/farrow.html",
                  "json:Reports/farrow.json",
                  "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
}

)

public class runnerfarrow {

	
}

package org.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.report.ReportGenerator;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features= {"src\\test\\resources\\testdata.Feature"},glue= {"org.stepdefin"},dryRun=false,strict=true,plugin= {"pretty","json:C:\\Users\\lenovo\\eclipse-workspace\\sample1\\target\\sam.json"})
public class TestRunner {
	
	
@AfterClass
public static void afterclas() {
	ReportGenerator.ReportGenerator("C:\\Users\\lenovo\\eclipse-workspace\\sample1\\target\\sam.json");

}
	
}

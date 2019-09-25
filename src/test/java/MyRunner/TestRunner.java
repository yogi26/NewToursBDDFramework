package MyRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		//Give the folder name of feature files
		features= "NewToursFeatures",
		//package name of step definition 
		glue={"stepDefinations"},
		//to display output in well format in external files
		//format={"pretty","html:test-output","junit:junit_output/cucumber.xml"},
		format={"pretty","html:test-output","json:json_output/cucumber.json"},
		// display console output in well format
		monochrome=true,
		//if you are using strict=true then it will stop the execution if there are any pending steps definition
		strict=false,
		//to check the mapping is proper between feature file and step def
		dryRun=false
		)
public class TestRunner 
{
	
}

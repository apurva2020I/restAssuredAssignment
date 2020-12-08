package stepDefinitions9;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="C:\\Users\\apurva.jyoti\\eclipse-workspace\\seleniumProject\\abc\\src\\test\\resources\\features\\testNGReport.feature",
glue={"stepDefinitions9"},
plugin= {"pretty","testng:target/testNG_Report/testng.html"},
monochrome = true)

public class TestRunner extends TestNGReport {

}

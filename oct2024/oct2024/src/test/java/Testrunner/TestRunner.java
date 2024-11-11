package Testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"C:\\Users\\srikar.kotha\\eclipse-workspace\\oct2024\\src\\test\\java\\Features\\login.feature"},
		glue= {"stepdefinition"},
		plugin= {"pretty"},
		monochrome=true)



public class TestRunner {

}

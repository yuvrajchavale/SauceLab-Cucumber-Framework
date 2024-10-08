package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"./FeatureFiles/SauceLogin.feature"},glue = {"LoginStepDefination"}
,plugin= {"pretty","html:target/cucumber-reports"},monochrome = true)
public class LoginRunner {

}

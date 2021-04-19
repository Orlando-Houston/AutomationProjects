package Runnerpackage;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/FeatureFiles/HYMain.feature",
        glue = "StepDefinitionsFiles")
public class RunnerClass {
}

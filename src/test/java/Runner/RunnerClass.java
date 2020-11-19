package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


    @RunWith(Cucumber.class)
    @CucumberOptions(
            plugin = {"html:target/cucumberHTML-report"},
            features = "src/resources/",
            glue ="StepDef",
            dryRun = false,
            tags ="@amazon"

    )
    public class RunnerClass{


    }





package skeleton;

import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(plugin= {"pretty","html:src/cucumber-report", "json:src/cucumber-report/reports.json"}, features="src/test/resources/casestudy/casestudythree.feature")
public class runCucunber {

}

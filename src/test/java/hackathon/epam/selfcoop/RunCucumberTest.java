package hackathon.epam.selfcoop;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = {"pretty", "html:target/cucumber-report.html"})
public class RunCucumberTest {
}

package cucumber.demoqa.sortable;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

import static utils.constants.Directories.COMMONGLUE;
import static utils.constants.Directories.CUCUMBER;

@RunWith(Cucumber.class)
@CucumberOptions(features = CUCUMBER + "demoqa/sortable", extraGlue = COMMONGLUE,
        plugin = "io.qameta.allure.cucumber6jvm.AllureCucumber6Jvm")
public class CucumberTest
{

}

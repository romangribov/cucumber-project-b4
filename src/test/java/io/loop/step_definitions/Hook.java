package io.loop.step_definitions;

import io.cucumber.java.*;
import io.loop.utilities.BrowserUtils;
import io.loop.utilities.Driver;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;




import javax.swing.*;

public class Hook {

    private Scenario scenario;

    @Before
    public void setUp(Scenario scenario) {
        Driver.getDriver();
        BrowserUtils.myScenario = scenario;

    }

    @After
    public void tearDown() {
        // only takes screenshot when scenario is failed
        if(scenario.isFailed()) {
            final  byte[] screenshoot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshoot, "image/png", scenario.getName());

        }
        Driver.closeDriver();
    }

    @AfterStep
    public void takeScreenshot(Scenario scenario){
        final  byte[] screenshoot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
        scenario.attach(screenshoot, "image/png", scenario.getName());

    }
}
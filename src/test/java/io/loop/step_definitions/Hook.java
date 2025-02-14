package io.loop.step_definitions;

import io.cucumber.java.*;
import io.loop.utilities.BrowserUtils;
import io.loop.utilities.Driver;

import javax.swing.*;

public class Hook {

    @Before
    public void setUp(){
        Driver.getDriver();

    }

    @After
    public void tearDown(){
        Driver.closeDriver();
    }
}

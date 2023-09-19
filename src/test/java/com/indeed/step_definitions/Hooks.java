package com.indeed.step_definitions;

import com.indeed.utilities.Driver;
import io.cucumber.java.After;

public class Hooks {

    @After
    public void closeDriver(){
        Driver.closeDriver();
    }

}

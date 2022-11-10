package com.cydeo.step_definitions;

import com.cydeo.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


public class Hooks {

    @After
    public void teardownScenario(Scenario scenario){
        // We will implement taking screenshot in this method
        //System.out.println("It will be closing browser using cucumber @After each scenario");

        if(scenario.isFailed()){

            byte [] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"image/png",scenario.getName());

        }


        Driver.closeDriver();
    }

    //@Before (order = 1)
    public void setupScenario(){
        System.out.println("@Before. Order = 1. Setting up browser using cucumber @Before each scenario");
    }

    // @Before ( order = 2)
    public void setupForLogin(){
        // If you want to run any code before any specific feature/scenario,
        // you can use value = "@tagname" to determine this
        System.out.println("@Before. Order = 2.");
    }

    //@Before ( order = 3) // Runs before every scenario
    public void setupDatabaseScenario(){
        System.out.println("@Before. Order = 3.");
    }
    //@After
    public void teardownScenario(){
        System.out.println("@After. It will be closing browser using cucumber @After each scenario");
    }

    //@BeforeStep // Runs before every step in every scenario
    public void setupScenarioStep(){
        // We will implement taking screenshot in this method
        System.out.println("@BeforeStep. Setting up browser using cucumber @Before each scenario step");
    }
}

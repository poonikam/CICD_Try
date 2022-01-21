package com.mbr.qa.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
//import org.apache.logging.log4j.Logger;
//import org.apache.logging.log4j.LogManager;
import io.qameta.allure.Allure;
import org.junit.Assert;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import io.restassured.RestAssured;
//import org.apache.log4j.BasicConfigurator;

public class MyStepdefs {
  //  private static final Logger log = LogManager.getRootLogger();

    @Given("I launch the Calender")
    public void iLaunchTheCalender() throws IOException {
        //BasicConfigurator.configure();

        RestAssured.baseURI = "https://reqres.in";
        System.out.println("step 1");
        System.out.println("url");
        System.out.println(getEnvironmentValue("url"));


  //      log.info("This is Logger test step 1" );
        Assert.assertEquals(1,1);

    }

    @When("I perform GET call with given endpoint")

    public void iPerformGETCallWithGivenEndpoint() {
        System.out.println("step 2");
        Allure.step("func1:" + "user login with name kuldeep and pwd is asasd" );
        Allure.step("func1:" + "user login with name kuldeep and pwd is asasd" );
        Allure.step("func1:" + "user login with name kuldeep and pwd is asasd" );

        Allure.description("This is my desc");

    //    log.info("This is Logger test step 2" );
        Assert.assertEquals(1,1);
    }

    @Then("I get responce")
    public void iGetResponce() {
        System.out.println("step 3");
      //  log.info("This is Logger test step 3" );
        //log.warn("Warning Message");
        System.out.println("Debugging Message111");
        //log.debug("Debugging Message");
        Assert.assertEquals(1,0);
    }

    public static Properties getEnvironmentValue(String key) throws IOException {
        Properties prop = new Properties();
        FileInputStream fs = new FileInputStream("C:\\Kuldeep\\Framework\\src\\test\\resources\\environment.properties");
        prop.load(fs);
        prop.getProperty(key);
        return prop;



    }
}

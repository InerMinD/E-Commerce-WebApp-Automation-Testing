package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;
import org.example.pages.P02_login;

public class D02_loginstepdef {

    P02_login login = new P02_login();
    SoftAssert soft = new SoftAssert();

    @Given("At homepage user clicks on login") public void login_Home () throws InterruptedException {

        Hooks.driverH.findElement(By.cssSelector("a[class=\"ico-login\"]")).click();
        Thread.sleep(3000);


    }
    @When("^user enter \"(.*)\" and \"(.*)\"$") public void fill_login_data (String username , String password) {

        login.login_data(username, password);
    }

    @And("user clicks on login button") public void click_login_button () throws InterruptedException {
              login.login_button().click();
              Thread.sleep(3000);

    }

    @Then("user gets directed to Homepage") public void go_Home ()
    {
        soft.assertEquals(Hooks.driverH.getCurrentUrl()
                ,"https://demo.nopcommerce.com/"
                ,"Error msg : Wrong home URL");
    }

    @And("user should see my Account tab") public void My_Account_Tab ()
    {
        soft.assertTrue(Hooks.driverH.findElement(By.xpath("//a[@class=\"ico-account\"]")).isDisplayed());

    }




}

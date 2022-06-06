package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;
import org.example.pages.P01_register;


public class D01_registerstepdef {

    P01_register register = new P01_register() ;
    SoftAssert soft = new SoftAssert();

    @Given("At homepage user clicks on register") public void register_Home () throws InterruptedException {

        Hooks.driverH.findElement(By.cssSelector("a[class=\"ico-register\"]")).click();
         Thread.sleep(3000);


    }


    @When("user fill required fields with valid data") public void fill_data () {

        register.registerdata("abdelrahman", "yehia"
                , "testing8@example.com"
                , "Automation Company"
                , "P@sswOrd", "P@sswOrd");
        register.gender().click();
        register.date_month_year();
    }
    @And("user clicks on register button") public void click_REGISTER1() throws InterruptedException {
            register.REGISTER().click();
            Thread.sleep(3000);
        }

    @Then("user gets directed to register success page") public void register_success_page ()
    {
        soft.assertEquals(Hooks.driverH.getCurrentUrl(),"https://demo.nopcommerce.com/registerresult/1?returnUrl=/"
                ,"Error msg : Wrong register success URL");
    }

    @And("user should be able to register successfully") public void register_flash_msg ()
    {
        String expectedResult = "Your registration completed" ;
        String actualResult = register.RegflashMsg().getText();
        soft.assertTrue(actualResult.contains(expectedResult),
                "ERROR msg : Wrong register msg");
        String coloracutal = register.RegflashMsg().getCssValue("color");
        System.out.println("color :" + coloracutal);
        String expectedcolor= "rgba(76, 177, 124, 1)";
        soft.assertTrue(coloracutal.contains(expectedcolor),
                "Error msg : Wrong Register msg color");
         soft.assertAll();
    }








}

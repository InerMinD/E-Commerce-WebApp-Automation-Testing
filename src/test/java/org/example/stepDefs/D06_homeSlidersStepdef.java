package org.example.stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import org.example.pages.P03_homepage;

public class D06_homeSlidersStepdef {
    P03_homepage home = new P03_homepage();


    @When("user select slider one") public void sliders_select () throws InterruptedException {

        Thread.sleep(4000);
        home.sliders().click();
        Thread.sleep(2000);
    }


    @Then("user gets directed to product page in slider") public void nokia_product_page ()
    {
        Assert.assertTrue(Hooks.driverH.getCurrentUrl().contains("https://demo.nopcommerce.com/nokia-lumia-1020")
                ,"Error : Wrong product URL page");
    }

    @When("user select slider two") public void sliders2_select () throws InterruptedException {
        home.sliders2().click();
        Thread.sleep(2000);
    }


    @Then("user gets directed to  other product page in slider") public void iphone_product_page ()
    {
        Assert.assertTrue(Hooks.driverH.getCurrentUrl().contains("https://demo.nopcommerce.com/iphone-6")
                ,"Error msg : Wrong product URL page");
    }










//    @Then("relative product for first slider is displayed")
//    public void first_product_details_opened()
//    {
//        // To create explicit wait condition, you need to create new object from WebDriverWait class then call your expected conditions as shown below
//        WebDriverWait wait = new WebDriverWait(Hooks.driverH,10);
//        boolean check =  wait.until(ExpectedConditions.urlContains("https://demo.nopcommerce.com/nokia-lumia-1020"));
//        Assert.assertTrue(check);
//
//    }

}

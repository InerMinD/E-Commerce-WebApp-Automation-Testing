package org.example.stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.example.pages.P03_homepage;

public class D08_Shoppingcartstepdef {

    P03_homepage home = new P03_homepage();
    @When("user clicks the add to cart button of a product") public void add_to_cart_click ()
    {
         home.add_to_cart_button().click();
    }

    @Then("product added to cart") public void product_add_to_cart ()
    {
       int size = Hooks.driverH.findElements(By.cssSelector("div[class=\"count\"]")).size();
        Assert.assertTrue(size>0);

    }




}

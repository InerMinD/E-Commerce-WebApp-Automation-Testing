package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.example.pages.P03_homepage;

public class D09_Wishliststepdef {


    P03_homepage home = new P03_homepage();

    @When("user clicks the wishlist button of a product") public void wishlist_button_click ()
    {
     home.add_to_wish_list_button().click();
    }
    @And("user click the  wishlist tab") public void wishlist_tab_click ()
    {
        home.wishlist_tab().click();
    }
    @Then("user find the product in wish list") public void product_added_to_wishlist ()
    {

        Assert.assertTrue(Hooks.driverH.findElement(By.cssSelector("div[class=\"wishlist-content\"]")).isDisplayed());
    }







}

package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.asserts.SoftAssert;


public class D04_searchstepdef {

    SoftAssert soft = new SoftAssert();

    @Given("user clicks on search bar") public void clicks_searchbar ()
    {
        Hooks.driverH.findElement(By.id("small-searchterms")).click();
    }

    @And("user enter a product name") public void search_store () throws InterruptedException {
        Hooks.driverH.findElement(By.id("small-searchterms")).sendKeys("Apple");
        Hooks.driverH.findElement(By.id("small-searchterms")).sendKeys(Keys.ENTER);
        Thread.sleep(3000);
    }
    @Then("user gets relative results in store") public void search_results ()
    {
        String expectedurl = "https://demo.nopcommerce.com/search?q=Apple";
        String actualurl = Hooks.driverH.getCurrentUrl();
        soft.assertTrue(actualurl.contains(expectedurl),"Error msg :Wrong search url");
        int size = Hooks.driverH.findElements(By.cssSelector("div[class=\"item-grid\"]")).size();
        soft.assertTrue(size>0,"Error msg :no results");
        soft.assertAll();


    }





}

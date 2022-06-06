package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class D11_selectdiff_tags_stepdef {

    SoftAssert soft = new SoftAssert();

    @When("user enter product name in search bar and press Enter") public void search_diff_tags () throws InterruptedException {
        Hooks.driverH.findElement(By.id("small-searchterms")).sendKeys("laptop");
        Hooks.driverH.findElement(By.id("small-searchterms")).sendKeys(Keys.ENTER);
        Thread.sleep(3000);
    }
    @Then("user get results in store") public void tags_results ()
        {
            String expectedurl = "https://demo.nopcommerce.com/search?q=laptop";
            String actualurl = Hooks.driverH.getCurrentUrl();
            soft.assertTrue(actualurl.contains(expectedurl), "Error msg :Wrong search url");
            int size = Hooks.driverH.findElements(By.cssSelector("div[class=\"item-grid\"]")).size();
            soft.assertTrue(size > 0, "Error msg :no results");
            soft.assertAll();
        }
    @And("user can select different tags to show different products") public void select_two_tags ()
    {
        Hooks.driverH.findElement(By.cssSelector("a[href=\"/compact\"]")).click();

        soft.assertTrue(Hooks.driverH.findElement(By.cssSelector("img[alt=\"Picture of Asus N551JK-XO076H Laptop\"]")).isDisplayed());

        Hooks.driverH.findElement(By.cssSelector("a[href=\"/camera\"]")).click();

        soft.assertTrue(Hooks.driverH.findElement(By.cssSelector("img[alt=\"Picture of Nikon D5500 DSLR\"]")).isDisplayed());
        soft.assertAll();

    }


}

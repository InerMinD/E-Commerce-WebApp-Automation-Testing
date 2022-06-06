package org.example.stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;


public class D05_hovercatstepdef {

    String subCategoryName;
    String pageTitle;

    @When("user hover category and select subcategory")
    public void user_hover_category() throws InterruptedException {

        Actions action = new Actions(Hooks.driverH);
        WebElement computers = Hooks.driverH.findElement(By.cssSelector("ul[class=\"top-menu notmobile\"] a[href=\"/computers\"]"));
        action.moveToElement(computers).perform();
        Thread.sleep(1000);

        WebElement desktops = Hooks.driverH.findElement(By.cssSelector("ul[class=\"top-menu notmobile\"] a[href=\"/desktops\"]"));
        subCategoryName = desktops.getText().toLowerCase().trim();        // this will change "Desktops " to "desktops"
        System.out.println(subCategoryName);
        desktops.click();
    }

    @Then("user gets directed to sub category") public void subcategory_select ()
    {
        WebElement title = Hooks.driverH.findElement(By.cssSelector("div[class=\"page-title\"]"));
        pageTitle = title.getText().toLowerCase().trim();
        Assert.assertTrue(pageTitle.contains(subCategoryName));

    }

}

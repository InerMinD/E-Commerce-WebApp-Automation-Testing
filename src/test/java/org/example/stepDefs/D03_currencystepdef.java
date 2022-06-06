package org.example.stepDefs;

import io.cucumber.java.en.Given;
import org.openqa.selenium.By;

public class D03_currencystepdef {

    @Given("user should be able to switch to Euro from drop down list") public void currency_swap ()
    {
    Hooks.driverH.findElement(By.xpath("//option[@value=\"https://demo.nopcommerce.com/changecurrency/6?returnUrl=%2F\"]"))
            .click();
    }



}

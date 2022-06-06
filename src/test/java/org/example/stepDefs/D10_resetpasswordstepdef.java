package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;

public class D10_resetpasswordstepdef {

    @Given("user navigates to password recovery page") public void password_recovery_page () throws InterruptedException {
        Hooks.driverH.navigate().to("https://demo.nopcommerce.com/passwordrecovery");
        Thread.sleep(4000);
    }

    @And("user types a valid email") public void email_enters () {
        Hooks.driverH.findElement(By.cssSelector("input[class=\"email\"]")).sendKeys("testing8@example.com");
        Hooks.driverH.findElement(By.cssSelector("input[class=\"email\"]")).sendKeys(Keys.ENTER);

    }

    @Then("user receives email with instructions to reset password") public void email_send ()
    {
      String expectedResult = "Email with instructions has been sent to you.";
      String acutalResult = Hooks.driverH.findElement(By.cssSelector("p[class=\"content\"]")).getText();
        System.out.println("message :" + acutalResult);
        Assert.assertTrue((acutalResult.contains(expectedResult)));


    }




}

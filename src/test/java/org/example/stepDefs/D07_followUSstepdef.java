package org.example.stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import org.example.pages.P03_homepage;

import java.util.ArrayList;

public class D07_followUSstepdef {

    P03_homepage home = new P03_homepage();

    @When("user clicks on facebook link") public void facebook_button ()
    {
     home.face_link().click();
    }

    @Then("user gets directed to facebook page") public void face_tab () throws InterruptedException {
        Thread.sleep(2000);
        ArrayList<String> Tabs = new ArrayList<>(Hooks.driverH.getWindowHandles());
        Hooks.driverH.switchTo().window(Tabs.get(1));
        System.out.println(Hooks.driverH.getCurrentUrl());
        Assert.assertEquals(Hooks.driverH.getCurrentUrl(), "https://www.facebook.com/nopCommerce"
                ,"Error :Wrong face URL");
        Hooks.driverH.close();
        Hooks.driverH.switchTo().window(Tabs.get(0));

    }
    @When("user clicks on twitter link") public void twitter_button ()
        {
            home.twit_link().click();
        }

    @Then("user gets directed to twitter page") public void twit_tab () throws InterruptedException {
        Thread.sleep(2000);
        ArrayList<String> Tabs2 = new ArrayList<>(Hooks.driverH.getWindowHandles());
        Hooks.driverH.switchTo().window(Tabs2.get(1));
        System.out.println(Hooks.driverH.getCurrentUrl());
        Assert.assertEquals(Hooks.driverH.getCurrentUrl(), "https://twitter.com/nopCommerce"
                , "Error: Wrong twitt URL");
        Hooks.driverH.close();
        Hooks.driverH.switchTo().window(Tabs2.get(0));
     }

        @When("user clicks on rss link") public void Rss_button ()
        {
            home.rss_link().click();
        }

        @Then("user gets directed to rss page") public void Rss_tab () throws InterruptedException {
            Thread.sleep(2000);
            ArrayList<String> Tabs3 = new ArrayList<>(Hooks.driverH.getWindowHandles());
            Hooks.driverH.switchTo().window(Tabs3.get(1));
            System.out.println(Hooks.driverH.getCurrentUrl());
            Assert.assertEquals(Hooks.driverH.getCurrentUrl(), "https://demo.nopcommerce.com/new-online-store-is-open"
                    ,"Error :Wrong rss URL");
            Hooks.driverH.close();
            Hooks.driverH.switchTo().window(Tabs3.get(0));

        }
        @When("user clicks on youtube link") public void Youtube_button ()
        {
            home.tube_link().click();
        }

        @Then("user gets directed to youtube page") public void Youtube_tab () throws InterruptedException {
            Thread.sleep(2000);
            ArrayList<String> Tabs4 = new ArrayList<>(Hooks.driverH.getWindowHandles());
            Hooks.driverH.switchTo().window(Tabs4.get(1));
            System.out.println(Hooks.driverH.getCurrentUrl());
            Assert.assertEquals(Hooks.driverH.getCurrentUrl(),"https://www.youtube.com/user/nopCommerce"
                    ,"Error: Wrong tube URL");
            Hooks.driverH.close();
            Hooks.driverH.switchTo().window(Tabs4.get(0));




















    }


}

package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.example.stepDefs.Hooks;



public class P03_homepage {



    public WebElement sliders ()
    {

//       return Hooks.driverH.findElement(By.cssSelector("a[class=\"nivo-imageLink\"]:nth-child("+num+")"));
        return Hooks.driverH.findElement(By.cssSelector("a[class=\"nivo-imageLink\"]:nth-child("+1+")"));
    }


    public WebElement sliders2 ()
    {


        return Hooks.driverH.findElement(By.cssSelector("a[class=\"nivo-imageLink\"]:nth-child("+2+")"));
    }

    public WebElement face_link ()
    {
       return Hooks.driverH.findElement(By.cssSelector("a[href=\"http://www.facebook.com/nopCommerce\"]"));

    }

    public WebElement twit_link ()
    {
        return Hooks.driverH.findElement(By.cssSelector("a[href=\"https://twitter.com/nopCommerce\"]"));

    }

    public WebElement rss_link()
    {
        return Hooks.driverH.findElement(By.cssSelector("a[href=\"/news/rss/1\"]"));

    }
    public WebElement tube_link()
    {
        return Hooks.driverH.findElement(By.cssSelector("a[href=\"http://www.youtube.com/user/nopCommerce\"]"));

    }

    public WebElement add_to_cart_button ()
    {
        return Hooks.driverH.findElement(By.xpath("//div[@data-productid=\"18\"]//button[@class=\"button-2 product-box-add-to-cart-button\"]"));
    }

    public WebElement add_to_wish_list_button ()
    {
        return Hooks.driverH.findElement(By.xpath("//div[@data-productid=\"18\"]//button[@class=\"button-2 add-to-wishlist-button\"]"));
    }
    public WebElement wishlist_tab ()
    {
        return Hooks.driverH.findElement(By.cssSelector("a[class=\"ico-wishlist\"]"));
    }



}

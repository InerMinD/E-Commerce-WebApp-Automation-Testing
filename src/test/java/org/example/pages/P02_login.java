package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.example.stepDefs.Hooks;

public class P02_login {


    public  void login_data ( String email , String password) {

        Hooks.driverH.findElement(By.id("Email")).sendKeys(email);
        Hooks.driverH.findElement(By.id("Password")).sendKeys(password);

    }

    public WebElement login_button ()
    {
        WebElement login_button = Hooks.driverH.findElement(By.cssSelector("button[class=\"button-1 login-button\"]"));
        return login_button ;
    }



}



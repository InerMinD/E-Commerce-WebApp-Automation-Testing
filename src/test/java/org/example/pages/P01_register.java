package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.example.stepDefs.Hooks;

import static org.example.stepDefs.Hooks.driverH;

public class P01_register {

     public WebElement  gender ()
     {
         WebElement gender=Hooks.driverH.findElement(By.id("gender-male"));
         return gender ;
     }

     public void date_month_year ()
     {
          Hooks.driverH.findElement(By.xpath("//select[@name=\"DateOfBirthDay\"]/option[@value=\"9\"]")).click();
          Hooks.driverH.findElement(By.xpath("//select[@name=\"DateOfBirthMonth\"]/option[@value=\"1\"]")).click();
          Hooks.driverH.findElement(By.xpath("//select[@name=\"DateOfBirthYear\"]/option[@value=\"1994\"]")).click();
     }



public  void registerdata (String firstname , String lastname , String email ,
                           String company , String password, String ConfirmPassword)
{

     Hooks.driverH.findElement(By.id("FirstName")).sendKeys(firstname);
     Hooks.driverH.findElement(By.id("LastName")).sendKeys(lastname);
     Hooks.driverH.findElement(By.id("Email")).sendKeys(email);
     Hooks.driverH.findElement(By.id("Company")).sendKeys(company);
     Hooks.driverH.findElement(By.id("Password")).sendKeys(password);
     Hooks.driverH.findElement(By.id("ConfirmPassword")).sendKeys(ConfirmPassword);

}
     public WebElement  REGISTER ()
     {
          WebElement REGISTER =Hooks.driverH.findElement(By.id("register-button"));
          return REGISTER ;
     }
     
     public WebElement RegflashMsg ()
     {
       WebElement RegflashMsg = driverH.findElement(By.cssSelector("div[class=\"result\"]"));

       return RegflashMsg ;
     }


}

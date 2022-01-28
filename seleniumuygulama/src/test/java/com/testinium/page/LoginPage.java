package com.testinium.page;

import com.testinium.methods.Methods;
import org.openqa.selenium.By;

public class LoginPage {

    Methods methods;
    public LoginPage(){
        methods = new Methods();
    }

    public void login(){
        methods.click(By.xpath("//div[@class='menu-top-button login']"));
        methods.waitBySeconds(1);

        methods.sendKeys(By.id("login-email"),"tugbacan1717@gmail.com");
        methods.waitBySeconds(1);

        methods.sendKeys(By.id("login-password"),"1q2w3e4r5t");
        methods.waitBySeconds(1);

        methods.click(By.cssSelector(".ky-btn.ky-btn-orange.w-100.ky-login-btn"));
        methods.waitBySeconds(5);
    }

    //textControlTest ekle
}

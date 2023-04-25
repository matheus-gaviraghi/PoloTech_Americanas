package com.ada.aulaselenium.pages;

import org.openqa.selenium.WebDriver;

public class BasicPage {

    private WebDriver driver;

    public BasicPage(WebDriver driver){
        this.driver = driver;
        driver.get("http://www.google.com");
    }

    public String getTitulo(){
        return driver.getTitle();
    }
}

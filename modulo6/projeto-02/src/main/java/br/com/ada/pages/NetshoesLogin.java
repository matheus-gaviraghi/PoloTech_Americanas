package br.com.ada.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NetshoesLogin extends BasicPage{

    public NetshoesLogin(WebDriver driver){
        super(driver);
        driver.get("https://www.netshoes.com.br/auth/login");
    }

    public WebElement getUserInput() {
        return getPageDriver().findElement(By.id("user"));
    }

    public WebElement getPasswordInput() {
        return getPageDriver().findElement(By.id("password"));
    }

    public WebElement getAccessAccountButton() {
        return getPageDriver().findElement(By.xpath("/html/body/div[1]/main/div[1]/section[1]/form/div[6]/div/div/button"));
    }

    public void login(String user, String password) {
        getUserInput().sendKeys(user);
        getPasswordInput().sendKeys(password);
        getAccessAccountButton().click();
    }
}

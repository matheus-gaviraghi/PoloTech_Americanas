package br.com.ada.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NetshoesSearch extends BasicPage{

    public NetshoesSearch(WebDriver driver){
        super(driver);
        driver.get("https://www.netshoes.com.br");
    }

    public WebElement getCampoPesquisa(){
        return getPageDriver().findElement(By.id("search-input"));
    }

    public void pesquisarPor(String texto){
        WebElement campo = this.getCampoPesquisa();
        campo.clear();
        campo.sendKeys(texto);
        campo.submit();
    }

    public WebElement getBotaoPesquisar(){
        return getPageDriver().findElement(By.xpath("//*[@id=\"header-content\"]/header/div[1]/section[2]/section/form/div/button"));
    }
}

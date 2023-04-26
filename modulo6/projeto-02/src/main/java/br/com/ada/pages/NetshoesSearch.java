package br.com.ada.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

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

    public WebElement getElementoFiltroOrdenacao() {
        return getPageDriver().findElement(By.xpath("//*[@id=\"content\"]/section/section[2]/div[1]/div/div/ul/li/a"));
//        return getPageDriver().findElement(By.xpath("//*[@id=\"content\"]/section/section[2]/div[1]/div/div"));
    }

    public void setTipoFiltroOrdenacao() {
        WebElement elementoOrdenacao = getPageDriver().findElement(By.xpath("//*[@id=\"content\"]/section/section[2]/div[1]/div/div"));
        elementoOrdenacao.click();

        permitirCookies();

        WebElement opcaoMenorPreco = (new WebDriverWait(getPageDriver(), Duration.ofMillis(500)))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"content\"]/section/section[2]/div[1]/div/div/ul/li/div/a[7]")));
        opcaoMenorPreco.click();
    }

    public void permitirCookies(){
        WebElement permicaoCookies = getPageDriver().findElement(By.xpath("/html/body/section/div/div[2]"));
        permicaoCookies.click();
    }
}

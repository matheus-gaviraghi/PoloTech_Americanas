package com.ada.aulaselenium.pages;


import org.asynchttpclient.util.Assertions;
import org.junit.Test;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GoogleTest {

    @Test
    public void testeTitulo(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mathe\\Downloads\\selenium\\chromedriver.exe");

        System.setProperty("webdriver.http.factory", "jdk-http-client");
        // Ou essa de cima, ou essa de baixo, funcionam
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--remote-allow-origins=*");

        ChromeDriver chrome = new ChromeDriver();
        chrome.get("http://www.google.com");

        String title = chrome.getTitle();
        String expected = "Google";
        assertEquals(expected, title);

        WebElement textArea = chrome.findElement(By.id("APjFqb"));
        textArea.sendKeys("cotação dólar");
//        textArea.submit();
        WebElement botao = chrome.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]"));
        botao.click();


        assertTrue(chrome.getTitle().equals("cotação dólar - Pesquisa Google"));
    }


    @Test
    public void testeTempoEspera(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mathe\\Downloads\\selenium\\chromedriver.exe");

        System.setProperty("webdriver.http.factory", "jdk-http-client");

        ChromeDriver chrome = new ChromeDriver();
        chrome.get("http://www.google.com");

        String textoPesquisado = "cotação bitcoin";

        WebElement textArea = chrome.findElement(By.id("APjFqb"));
        textArea.sendKeys(textoPesquisado);
        textArea.submit();

        ExpectedCondition condicao = new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver driver){
                return driver.getTitle().toLowerCase().startsWith(textoPesquisado.toLowerCase());
            }
        };

        (new WebDriverWait(chrome, Duration.ofMillis(500))).until(condicao);
    }
}

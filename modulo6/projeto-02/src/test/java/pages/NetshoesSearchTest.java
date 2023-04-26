package pages;

import br.com.ada.pages.NetshoesSearch;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.Assert.assertEquals;

public class NetshoesSearchTest {

    @Test
    public void testeTitulo(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mathe\\Downloads\\selenium\\chromedriver.exe");
        System.setProperty("webdriver.http.factory", "jdk-http-client");

        ChromeDriver driver = new ChromeDriver();

        NetshoesSearch homePage = new NetshoesSearch(driver);

        String title = homePage.getTitulo();
        String expected = "Loja de Artigos Esportivos Online | Netshoes";
        assertEquals(expected, title);
    }

    @Test
    public void testePesquisaItem(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mathe\\Downloads\\selenium\\chromedriver.exe");
        System.setProperty("webdriver.http.factory", "jdk-http-client");

        ChromeDriver driver = new ChromeDriver();

        NetshoesSearch homePage = new NetshoesSearch(driver);

        String textoPesquisado = "camiseta do Grêmio";

        homePage.pesquisarPor(textoPesquisado);

        ExpectedCondition condicaoEsperada = new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver driver) {
                System.out.println("Item pesquisado (LowerCase): " + textoPesquisado.toLowerCase());
                System.out.println("Título recebido (LowerCase): " + driver.getTitle().toLowerCase());
                return driver.getTitle().toLowerCase().startsWith(textoPesquisado.toLowerCase());
            }
        };
        new WebDriverWait(driver, Duration.ofMillis(500)).until(condicaoEsperada);
    }

    @Test
    public void testePesquisaItem_QuandoOrdenacaoMenorValor(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mathe\\Downloads\\selenium\\chromedriver.exe");
        System.setProperty("webdriver.http.factory", "jdk-http-client");

        ChromeDriver driver = new ChromeDriver();
        NetshoesSearch homePage = new NetshoesSearch(driver);

        String textoPesquisado = "camiseta do Grêmio";
        homePage.pesquisarPor(textoPesquisado);

        String tipoOrdenacaoEsperado = "Menor Preço";

        homePage.setTipoFiltroOrdenacao();
        new WebDriverWait(driver, Duration.ofMillis(500));
        String tipoOrdenacaoObtido = homePage.getElementoFiltroOrdenacao().getText();

        assertEquals(tipoOrdenacaoEsperado, tipoOrdenacaoObtido);

    }
}

package pages;

import br.com.ada.pages.NetshoesSearch;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

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
}

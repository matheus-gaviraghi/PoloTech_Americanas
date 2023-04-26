package pages;

import br.com.ada.pages.NetshoesLogin;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class NetshoesLoginTest {

    @Test
    public void testeLogin() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mathe\\Downloads\\selenium\\chromedriver.exe");
        System.setProperty("webdriver.http.factory", "jdk-http-client");

        ChromeDriver driver = new ChromeDriver();
        NetshoesLogin loginPage = new NetshoesLogin(driver);

        loginPage.login("teste@teste.com", "teste");
    }
}

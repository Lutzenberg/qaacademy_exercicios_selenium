import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class  ExercicioWindow {

    private WebDriver driver;

    @Before
    public void before() {

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demo.automationtesting.in/Windows.html");
        driver.findElement(By.xpath("//*[@id=\"Tabbed\"]/a/button")).click();
    }

    @Test
    public void testeTabWindow() {

        driver.findElement(By.xpath("//*[@id=\"Tabbed\"]/a/button")).click();
        Object[] janelas = driver.getWindowHandles().toArray();
        driver.switchTo().window((janelas[1]).toString());
        String textoNovaTab = "Selenium automates browsers. That's it!";
        String paginaTotal = driver.getPageSource();
        Assert.assertTrue(paginaTotal.contains(textoNovaTab));
    }

    @Test
    public void testeWindow() {

        driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"Seperate\"]/button")).click();
        Object[] janelas = driver.getWindowHandles().toArray();
        driver.switchTo().window((janelas[1]).toString());
        String textoNovaWindow = "Selenium automates browsers. That's it!";
        String paginaHtml = driver.getPageSource();
        Assert.assertTrue(paginaHtml.contains(textoNovaWindow));
    }

    @After
    public void after() {
        driver.quit();
    }
}

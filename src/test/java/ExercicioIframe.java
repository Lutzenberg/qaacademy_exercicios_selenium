import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ExercicioIframe {

    private WebDriver driver;

    @Before
    public void before() {

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demo.automationtesting.in/Frames.html");
    }

    @Test
    public void testeIfarme() {

        WebElement ifarme = driver.findElement(By.id("singleframe"));
        driver.switchTo().frame(ifarme);
        WebElement html = driver.findElement(By.xpath("/html/body/section/div/div/div/input"));
        String text = "Esudo de Iframe";
        html.sendKeys(text);
        Assert.assertTrue(driver.getPageSource().contains("iFrame Demo"));

    }

    @After
    public void after() {
        driver.quit();
    }
}

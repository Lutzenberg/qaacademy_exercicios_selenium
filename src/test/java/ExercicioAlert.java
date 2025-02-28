import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ExercicioAlert {

    private WebDriver driver;

    @Before
    public void before() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
        driver.get("https://demo.automationtesting.in/Alerts.html");

    }

    @Test
    public void testeAlert() {

        driver.findElement(By.xpath("//*[@id=\"OKTab\"]/button")).click();

        // Instacia e muda o contexto
        Alert alert = driver.switchTo().alert();
        String text = alert.getText();

        // Valida o conteudo
        Assert.assertEquals("I am an alert box!", text);
        // Fecha o alerta
        alert.dismiss();
        driver.quit();
    }
}

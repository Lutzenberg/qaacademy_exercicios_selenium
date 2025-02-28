import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class ExercicioTabs {

    @Test
    public void testeTab() {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demo.automationtesting.in/Windows.html");
        driver.findElement(By.xpath("//*[@id=\"Tabbed\"]/a/button")).click();
        // Mensagens das tabs abertas
        Object[] janelas = driver.getWindowHandles().toArray();
        // Troca de tabs
        driver.switchTo().window((janelas[1]).toString());

        String textoNovaTab = "Selenium automates browsers. That's it!";
        String paginaTotal = driver.getPageSource();
        Assert.assertTrue(paginaTotal.contains(textoNovaTab));

    }
}

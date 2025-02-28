import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class DragAndDrop {

    WebDriver driver;

    @Test
    public void testeDragAndDrop() {

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demo.automationtesting.in/Static.html");
        WebElement incone = driver.findElement(By.xpath("//*[@id=\"node\"]"));
        WebElement destino = driver.findElement(By.xpath("//*[@id=\"droparea\"]"));
        Actions actions = new Actions(driver);
        actions.dragAndDrop(incone, destino).perform();
    }
}

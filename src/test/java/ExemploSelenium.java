import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;


public class ExemploSelenium {
    @Test
    public void testeSelenium() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
        driver.get("http://demo.automationtesting.in/Register.html");

        // Campo primeiro nome
        driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input")).sendKeys("QA");
        // Campo segundo nome
        driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input")).sendKeys("Academy");
        // Campo de endereço
        driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea\n")).sendKeys("Rodovia 7, 658");
        // Campo de e-mail
        driver.findElement(By.xpath("//*[@id=\"eid\"]/input")).sendKeys("estudo@gmail.com");
        // Campo de telefone
        driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[4]/div/input\n")).sendKeys("2198709-2560");
        // Gender
        driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[1]/input")).click();
        // Hobbies
        driver.findElement(By.xpath("//*[@id=\"checkbox2\"]")).click();
        // Expandir lista linguage
        driver.findElement(By.xpath("//*[@id=\"msdd\"]")).click();
        //Click na linguage
        driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[7]/div/multi-select/div[2]/ul/li[29]/a")).click();

        //lista skills option
        //Select select = new Select(driver.findElement(By.xpath("//*[@id=\"Skills\"]")));
        //select.selectByVisibleText("Java");
        // Lista de paises
        //driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[10]/div/span/span[1]/span")).click();
        //driver.findElement(By.xpath("//*[@id=\"select2-country-container\"]"));

        // Lista data de nascimento
        WebElement elementAno = driver.findElement(By.xpath("//*[@id=\"yearbox\"]"));
        Select selectAno = new Select(elementAno);
        selectAno.selectByVisibleText("2000");

        WebElement elementMes = driver.findElement(By.xpath(("//*[@id=\"basicBootstrapForm\"]/div[11]/div[2]/select")));
        Select selectMes = new Select(elementMes);
        selectMes.selectByVisibleText("May");

        WebElement elementDia = driver.findElement(By.xpath(("//*[@id=\"daybox\"]")));
        Select selectDia = new Select(elementDia);
        selectDia.selectByVisibleText("3");

        // Preencher senha
        driver.findElement(By.xpath("//*[@id=\"firstpassword\"]")).sendKeys("Estudo");
        // Confirmar senha
        driver.findElement(By.xpath("//*[@id=\"secondpassword\"]")).sendKeys("Estudo");
        // Clicar em Submit
        driver.findElement(By.xpath("//*[@id=\"submitbtn\"]")).click();


        driver.quit();

    }
}

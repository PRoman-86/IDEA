import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Selenium {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:/_install/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://google.com/");

        WebElement input = driver.findElement(By.className("gLFyf"));
        input.sendKeys("luba\n");

        WebElement result = driver.findElement(By.xpath("//h3[text() = 'Luba — Википедия']"));

        Assert.assertEquals(result.getText(), "Luba — Википедия");

        Thread.sleep(5000);

        driver.quit();

    }


}
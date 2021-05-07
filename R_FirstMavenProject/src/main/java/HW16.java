import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW16 {

    public static void main(String[] args) {
        try {
            tenMinuteMailTest();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static boolean tenMinuteMailTest() throws InterruptedException {

        String currentMail="";

        System.setProperty("webdriver.chrome.driver", "C:/_install/chromedriver.exe");
        WebDriver chromedrv = new ChromeDriver();
        chromedrv.get("https://10mail.org/");
        Thread.sleep(3000);

        WebElement mailArea = chromedrv.findElement(By.className("address"));
        currentMail = mailArea.getText();

        if (currentMail.equals(""))
            return false;

        System.out.println("Received mail: "+currentMail);

        chromedrv.quit();

        return true;
    }

}

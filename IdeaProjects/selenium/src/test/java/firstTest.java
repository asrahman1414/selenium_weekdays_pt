import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


@Test

public class firstTest {
    public void enterdataintoTextfield () {
        System.setProperty("web driver.chrome.driver", " /Users/admin/Documents/chrome driver");
        WebDriver driver;
        driver = new ChromeDriver();
        driver.get("https://facebook.com");
        driver.findElement(By.xpath("//*[@id=\'email\']")).sendKeys("test@gmail.com");
        }
    }


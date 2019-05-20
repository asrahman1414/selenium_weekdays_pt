import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;





    @Test

    public class secondTest {
        public void enterdataintoTextfield () {
            System.setProperty("web driver.chrome.driver", " /Users/admin/Documents/chrome driver");
            WebDriver driver;
            driver = new ChromeDriver();
            driver.get("https://facebook.com");
            driver.findElement(By.xpath("//*[@id=\'email\']")).sendKeys("test@gmail.com");
            driver.findElement(By.xpath("//*[@id=\'pass\']")).sendKeys("password");
            driver.findElement(By.xpath("//*[@name=\'firstname\']")).sendKeys("FirstName");
            driver.findElement(By.xpath("//*[@name=\'lastname\']")).sendKeys("LastName");
            driver.findElement(By.xpath("//*[@name=\'reg_email__\']")).sendKeys("gdrahman@gmail.com");


        }

    }



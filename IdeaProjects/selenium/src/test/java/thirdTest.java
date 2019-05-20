import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

       public class thirdTest {


      // WebDriver driver;

       @Test

        public void dropDownDate () {
           System.setProperty("web driver.chrome.driver", " /Users/admin/Documents/chrome driver");
           WebDriver driver;
           driver = new ChromeDriver();
           driver.get("https://facebook.com");


           WebElement day = driver.findElement(By.xpath("//*[@id=\'day\']"));
           Select select = new Select(day);
           select.selectByValue("10");

           WebElement month = driver.findElement(By.xpath("//*[@id=\'month\']"));
           select = new Select(month);
           select.selectByValue("3");


           WebElement year = driver.findElement(By.xpath("//*[@id=\'year\']"));
           select = new Select(year);
           select.selectByValue("1963");


       }

}

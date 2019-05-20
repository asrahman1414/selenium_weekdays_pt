import com.sun.tools.internal.xjc.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;


@Test
public class forthTest {



    public void Mouseover () {
        System.setProperty("web driver.chrome.driver", " /Users/admin/Documents/chrome driver");
        WebDriver driver;
        driver = new ChromeDriver();
        driver.get("https://www.wix.com/blog/category/promote-your-site/social-media/");
        WebElement features = driver.findElement(By.xpath("//*[@id=\'comp-j76913xj0label\']"));

        //Actions action = new Actions(driver);
        //action.moveToElement(features).build().perform();
        Actions action = new Actions(driver);
        action.moveToElement(features).build().perform();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
           driver.findElement(By.linkText("Trends")).click();

    }

}











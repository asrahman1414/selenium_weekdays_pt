import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Set;





public class testFive {

/* This program is about web-automation with selenium. I"ve tried to create an auto test program
 in a certain website call LearningAutomation. In the same page the youtube link need to lunch
 Once That happened , after a little while youtube page should be click to close. So the test guy can go
 back to the automation training page to complete a task.Finally Test guy decided to close the browser





*/





        @Test

        public void windowshands () {
            System.setProperty("web driver.chrome.driver", " /Users/admin/Documents/chrome driver");
            WebDriver driver;
            driver = new ChromeDriver();
            driver.get("http://automationpractice.com/index.php");
            driver.findElement(By.xpath("//*[@id=\"social_block\"]/ul/li[3]/a")).click();


            //String windowsId = driver.getWindowHandle();
            Set<String> windowsId = driver.getWindowHandles();
            Iterator<String> itr =  windowsId.iterator();
            String parentId = itr.next();
            String childId = itr.next();
            driver.switchTo().window(childId);

            try {
                Thread.sleep(3000);
            } catch(InterruptedException e) {
                e.printStackTrace();
            }
            driver.close();





            driver.switchTo().window("parentId");
            driver.findElement(By.xpath("//*[@id=\'block_top_menu\']/ul/li[1]/a"));

            driver.close();
            driver.switchTo().window(parentId);
            driver.findElement(By.xpath("//*[@id=\'columns\']/div[1]")).click();


            //itr = windowsId.iterator();
            //String parentId = itr.next();
            //String child = itr.next();
            //driver.switchTo().window("child");
            //driver.close();
            //driver.switchTo().window(parentId);
            //driver.findElement(By.xpath("");

        }

    }


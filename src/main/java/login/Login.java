package login;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class Login {


    @Test
    public void testCase1() {
            System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
            ChromeDriver driver = new ChromeDriver();
            driver.get("https://www.baidu.com");
            driver.manage().window().maximize();
            WebElement username_0 = driver.findElement(By.id("kw"));
            System.out.println(username_0);
            username_0.sendKeys("你好");
            WebElement btn = driver.findElement(By.id("su"));
            btn.click();
            driver.quit();
        }

    @Test
    public void test2(){
        System.out.println("pppp");
//        throw new NullPointerException("pppp");


    }

}

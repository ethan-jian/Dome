package base;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base {

    public void exceElement(){
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.baidu.com");
        WebElement element = (new WebDriverWait(driver,5)).until(ExpectedConditions.presenceOfElementLocated(By.id("kw")));

    }
}

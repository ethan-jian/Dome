package flows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class Base {
    public static WebDriver driver;

    public List<WebElement> exceElement(String expression) {

        List<WebElement> webElements = (new WebDriverWait(driver, 5)).until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(expression)));
        WebElement webElement = webElements.get(0);

        for (WebElement e: webElements){
            System.out.println(e.getText());
        }

        return webElements;

    }

    public static void main(String[] args){
        Base base = new Base();
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.baidu.com/");
        System.out.println(base.exceElement("//*[@id=\"u1\"]//a"));
    }
}

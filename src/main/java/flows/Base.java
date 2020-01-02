package flows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class Base {

    public WebDriver driver;

    public WebElement[] locateElement(String expression) {
        /**
         * 元素xpath定位
         * @expression传入的xpath表达式
         * @return一组元素
         */
        List<WebElement> elements_list = (new WebDriverWait(driver, 5)).until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(expression)));

        return elements_list.toArray(WebElement[]::new);
    }

    public void  clickElement(String expression) {

        return this.locateElement(expression).g;

    }

    public void exceElement(String expression, String exceType, String inputText, int waitTime) {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.baidu.com/");
        List<WebElement> webElements = (new WebDriverWait(driver, 5)).until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(expression)));
        WebElement webElement = webElements.get(0);
        if (exceType.equals("click")){
            webElement.click();
        }

        for (WebElement e: webElements){
            System.out.println(e.getText());
        }



    }

    public static void main(String[] args){
        Base base = new Base();
//        System.out.println(base.exceElement("//*[@id=\"u1\"]//a"));
    }
}

package flow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.io.*;
import java.util.Properties;
import java.util.List;
import java.util.ResourceBundle;

public class Base {
    private static String URL;

    public WebDriver driver;

    public List<WebElement> exceElement(String expression) {

        List<WebElement> webElements = (new WebDriverWait(driver, 5)).until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(expression)));
        WebElement webElement = webElements.get(0);
        for (WebElement e: webElements){
            System.out.println(e.getText());
        }

        return webElements;
    }

    public static void main(String[] args) {
        try {
//            InputStream inputStream = Base.class.getClassLoader().getResource("resources/config.properties").openStream();
            Properties properties = new Properties();
            properties.load(new FileInputStream("config.properties"));
            URL = properties.getProperty("url");
            System.out.println(URL);
        } catch (IOException e) {
            e.printStackTrace();
        }


        Base base = new Base();
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
        base.driver = new ChromeDriver();
        base.driver.get(URL);
        System.out.println(base.exceElement("//*[@id=\"u1\"]//a"));
    }
}

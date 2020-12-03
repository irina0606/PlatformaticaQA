import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SimpleTest {

    @Test
    public void simpleTest() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/petrokuzyk/.m2/repository/webdriver/chromedriver/mac64/87.0.4280.20/chromedriver");

        WebDriver browser = new ChromeDriver();
        browser.get("https://github.com/SergeiDemyanenko/PlatformaticaQA");
        WebElement name = browser.findElement(By.xpath("//strong/a"));

        Assert.assertEquals(name.getText(), "PlatformaticaQA");

        Thread.sleep(3000);
        browser.close();
    }
}

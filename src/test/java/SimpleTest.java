import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SimpleTest {

    @Test
    public void simpleTest() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "c:/Users/amack/IdeaProjects/git project/chromedriver.exe");

        WebDriver browser = new ChromeDriver();
        browser.get("https://github.com/SergeiDemyanenko/PlatformaticaQA");

        WebElement name = browser.findElement(By.xpath("//span/a"));

        Assert.assertEquals(name.getText(), "SergeiDemyanenko");

        Thread.sleep(3500);
        browser.close();
    }
}

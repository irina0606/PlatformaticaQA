import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import runner.BaseTest;

public class GroupEastern extends BaseTest {

    @Test
    public void viktoriiaPrudka() {

        WebDriver driver = getDriver();
        driver.get("https://wagwalking.com/");

        WebElement button = driver.findElement(By.xpath("//p[text()='Book a walk']"));
        button.click();

        Assert.assertEquals(driver.getCurrentUrl(), "https://app.wagwalking.com/signup/welcome?preferred_service=1&utm_campaign=service_carousel_walking&utm_medium=homepage&utm_source=web");




    }
}

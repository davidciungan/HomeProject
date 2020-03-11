import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterTest {


    private WebDriver driver;

    @Before
    public void initDriver() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
    }

    @After
    public void close() {
        driver.quit();
    }



   @Test
   public  void reg () {


        driver.get("http://testfasttrackit.info/selenium-test/");

        driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label")).click();
        driver.findElement(By.cssSelector("#header-account > div > ul > li:nth-child(5) > a")).click();
        driver.findElement(By.cssSelector("#firstname")).sendKeys("Dav");
        driver.findElement(By.cssSelector("#lastname")).sendKeys("Ciungan");
        driver.findElement(By.cssSelector("#email_address")).sendKeys("davici@mailinator.com");
        driver.findElement(By.cssSelector("#password")).sendKeys("A123446");
        driver.findElement(By.cssSelector("#confirmation")).sendKeys("A123446");
        driver.findElement(By.cssSelector("#is_subscribed")).click();

       WebElement registerbutton =driver.findElement(By.cssSelector("#form-validate > div.buttons-set > button"));
        registerbutton.click();
       WebElement thankyou= driver.findElement(By.cssSelector("body > div > div.page > div.main-container.col2-left-layout > div > div.col-main > div.my-account > div > ul > li > ul > li > span"));
       Assert.assertEquals("Thank you for registering with Madison Island.", thankyou.getText());
    }

}

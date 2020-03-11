import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WhishList {

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
    public  void wish () {

        driver.get("http://testfasttrackit.info/selenium-test/");
    driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label")).click();
    driver.findElement(By.cssSelector("#header-account > div > ul > li.last > a")).click();
    driver.findElement(By.cssSelector("#email")).sendKeys("davici@mailinator.com");
    driver.findElement(By.cssSelector("#pass")).sendKeys("A123446");
    WebElement inbutton=driver.findElement(By.cssSelector("#send2"));
    inbutton.click();
    WebElement home=driver.findElement(By.cssSelector("#header > div > a > img.large"));
    home.click();
        driver.findElement(By.cssSelector("body > div > div.page > div.main-container.col1-layout > div > div > div.std > div.widget.widget-new-products > div.widget-products > ul > li:nth-child(1) > div > h3 > a")).click();
        WebElement list=driver.findElement(By.cssSelector("#product_addtocart_form > div.product-shop > div.product-options-bottom > ul.add-to-links > li:nth-child(1) > a"));
        list.click();
        WebElement mes=driver.findElement(By.cssSelector("body > div > div.page > div.main-container.col2-left-layout > div > div.col-main > div.my-account > div.my-wishlist > ul > li > ul > li"));
        Assert.assertEquals("Chelsea Tee has been added to your wishlist. Click here to continue shopping.",mes.getText());

    }

}

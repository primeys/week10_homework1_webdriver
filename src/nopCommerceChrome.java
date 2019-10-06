import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class nopCommerceChrome {

    public static void main(String[] args) {
        String baseUrl = "https://demo.nopcommerce.com";

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver;
        driver = new ChromeDriver();
        driver.get(baseUrl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

        //find elements for login link
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();

        // find elements for emailfield and type email
        WebElement emilField = driver.findElement(By.id("Email"));
        emilField.sendKeys("jay@gmail.com");

        //find elements for password field and type password
        WebElement passwordField = driver.findElement(By.id("Password"));
        passwordField.sendKeys("jay123");

        //find elements for loginbtn and click.
        WebElement loginBtn = driver.findElement(By.xpath("//input[@class='button-1 login-button']"));
        loginBtn.submit();

        //driver.quit();

    }

}
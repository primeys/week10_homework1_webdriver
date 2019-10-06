import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class nopCommerceFirefox {

    public static void main(String[] args) {

        String baseUrl = "https://demo.nopcommerce.com";
        System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");

        WebDriver driver;
        driver = new FirefoxDriver();
        driver.get(baseUrl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement loginLink = driver.findElement(By.className("ico-login"));
        loginLink.click();

        WebElement emilField = driver.findElement(By.id("Email"));
        emilField.sendKeys("Jay@gmail.com");

        WebElement passwordField = driver.findElement(By.id("Password"));
        passwordField.sendKeys("jay123");

        WebElement loginBtn = driver.findElement(By.xpath("//input[@class='button-1 login-button']"));
        loginBtn.click();

    }


}

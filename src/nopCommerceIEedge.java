import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

public class nopCommerceIEedge {
    public static void main(String[] args) {
        String baseUrl = "https://demo.nopcommerce.com";
        System.setProperty("webdriver.ie.driver","drivers/IEDriverServer.exe");

        WebDriver driver;
        driver = new InternetExplorerDriver();
        driver.get(baseUrl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();

        WebElement emailField = driver.findElement(By.id("Email"));
        emailField.sendKeys("jay@gmail.com");

        WebElement passwordField = driver.findElement(By.id("Password"));
        passwordField.sendKeys("jay123");

        WebElement loginBtn = driver.findElement(By.xpath("//input[@class='button-1 login-button']"));
        loginBtn.click();






    }

}

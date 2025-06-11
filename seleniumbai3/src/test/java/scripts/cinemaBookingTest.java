package scripts;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.ProfilePage;
import pages.PurChasePage;

import java.time.Duration;

public class cinemaBookingTest {
    static WebDriver driver;
    public static <webElement> void main(String[] args) throws InterruptedException{
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://demo1.cybersoft.edu.vn/");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("susantest04","Abcd1234");
        Thread.sleep(10000);
        driver.get("https://demo1.cybersoft.edu.vn/purchase/43540");
        PurChasePage purchasePage = new PurChasePage(driver);
        ProfilePage profilePage = new ProfilePage(driver);
        loginPage.login("susantest04","Abcd1234");
        PurChasePage.purchaseSlot("55");

        //hover vaof vubff phim
//        webElement firmPlayButton = driver.findElement((By.xpath()))

    }

}
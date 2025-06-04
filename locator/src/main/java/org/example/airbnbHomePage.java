package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class airbnbHomePage {
    static Logger logger = LogManager.getLogger("testHrmAdminPage");
    public static void main(String[] args) {
        // tu dong tai va cau hinh chromedriver
        WebDriverManager.chromedriver().setup();
        //WebDriverManager.chromedriver().setup();
        //tạo 1 doi tuong chrome de selenium dieu kien
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        try {
            Thread.sleep(2000);
            driver.get("https://demo4.cybersoft.edu.vn/");

            Thread.sleep(5000);

            //1 Locator Admin
            driver.findElement(By.xpath("//a[@href='/web/index.php/admin/viewAdminModule']")).click();
            Thread.sleep(5000);
            // System.out.println("đã đi vào pim thành cong.");
            logger.info("đã đi vào admin thành công.");

            //2 Locator PIM
            driver.findElement(By.xpath("//a[@href='/web/index.php/pim/viewPimModule']")).click();
            Thread.sleep(5000);
            // System.out.println("đã đi vào pim thành cong.");
            logger.info("đã đi vào pim thành công.");

            //3 Locator Leave
            driver.findElement(By.xpath("//a[@href='/web/index.php/leave/viewLeaveModule']")).click();
            Thread.sleep(5000);
            // System.out.println("đã đi vào pim thành cong.");
            logger.info("đã đi vào leave thành công.");

            //Locator Admin
            driver.findElement(By.xpath("//a[@href='/web/index.php/admin/viewAdminModule']")).click();
            Thread.sleep(5000);
            // System.out.println("đã đi vào pim thành cong.");
            logger.info("đã đi vào admin thành công.");

//            //Locator Admin
//            //(//input[@class='oxd-input oxd-input--active'])[2]
//            driver.findElement(By.xpath("//label[text()='Username']/following:://input[@class='oxd-input oxd-input--active']")).click();
//            Thread.sleep(5000);
//            // System.out.println("đã đi vào pim thành cong.");
//            logger.info("đã đi vào admin thành công.");

            //4 Locator User name
            driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).click();
            // System.out.println("sendkey thành cong.");
            logger.info("Click thành công user name.");

            //5 Locator User Role
            driver.findElement(By.xpath("(//div[@class='oxd-select-text oxd-select-text--active'])[1]")).click();
            // System.out.println("sendkey thành cong.");
            logger.info("Click thành công user role.");

            //7 Locator Admin
            driver.findElement(By.xpath("(//div[@class='oxd-select-text-input'][normalize-space()='Admin'])[1]")).click();
            // System.out.println("sendkey thành cong.");
            logger.info("Locator Admin");

            //8 Locator Employee Name
            driver.findElement(By.xpath("(//input[@placeholder='Type for hints...'])[1]")).click();
            logger.info("Locator Employee Name");

            //9 Locator button reset
            driver.findElement(By.xpath("//button[normalize-space()='Reset']")).click();
            logger.info("Locator button reset");

            //10 Locator button Search
            driver.findElement(By.xpath("//button[normalize-space()='Search']")).click();
            logger.info("Locator button Search");

            //11 Locator User Management
            driver.findElement(By.xpath("//span[normalize-space()='User Management']")).click();
            logger.info("Locator User Management");

            //12 Locator Dena.Parisian
            driver.findElement(By.xpath("//div[contains(text(),'Dena.Parisian')]")).click();
            logger.info("Locator Dena.Parisian");

            //13 Locator ESS
            driver.findElement(By.xpath("(//div[contains(text(),'ESS')])[2]")).click();
            logger.info("Locator ESS");

            //14 Locator button remove
            driver.findElement(By.xpath("(//button[@type='button'])[7]")).click();
            logger.info("Locator button remove");

            //15 Locator button edit
            driver.findElement(By.xpath("(//button[@type='button'])[8]")).click();
            logger.info("Locator button edit");

            //16 Locator User Role
            driver.findElement(By.xpath("//div[@role='columnheader'][normalize-space()='']")).click();
            logger.info("Locator User Role");

            //17 Locator Employee Name
            driver.findElement(By.xpath("(//div[@role='columnheader'])[1]")).click();
            logger.info("Locator Employee Name");

            //18 Locator Admin/User Management
            driver.findElement(By.xpath("//span[@class='oxd-topbar-header-breadcrumb']")).click();
            logger.info("Admin/User Management");

            //19 Locator button <
            driver.findElement(By.xpath("//button[@role='none']")).click();
            logger.info("Locator button <");

            //20 Locator button ^
            driver.findElement(By.xpath("//i[@class='oxd-icon bi-caret-up-fill']")).click();
            logger.info("Locator button ^");

            //21 Locator button add
            driver.findElement(By.xpath("//button[normalize-space()='Add']")).click();
            logger.info("Locator button add");

        } catch (InterruptedException e) {

            e.printStackTrace();

        } finally {
            //   driver.quit();

        }

    }

}

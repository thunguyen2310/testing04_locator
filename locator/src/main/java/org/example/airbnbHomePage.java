package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class airbnbHomePage {
    static Logger logger = LogManager.getLogger("testAirbnbHomePage");
    public static void main(String[] args) {
        // tu dong tai va cau hinh chromedriver
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        try {
            Thread.sleep(2000);
            driver.get("https://demo4.cybersoft.edu.vn/");

            Thread.sleep(5000);

            //1 Locator Admin
            WebElement locatorLogo =  driver.findElement(By.xpath("//span[normalize-space()='airbnb']"));
            locatorLogo.click();
            Thread.sleep(5000);
            logger.info("Đã click vào locator Logo Airbnb");

            //2 Locator Home
            WebElement Home = driver.findElement(By.xpath("//a[normalize-space()='Home']"));
            logger.info("Đã click vào locator Home");
            Thread.sleep(3000);

            //3  Locator About
            WebElement locatorAbout = driver.findElement(By.xpath("//a[normalize-space()='About']"));
            locatorAbout.click();
            logger.info("Đã click vào locator About" );

            //4 Locator Avatar
            WebElement locatorAvatar = driver.findElement(By.xpath("//button[contains(@class, ' text-sm bg-main')]"));
            locatorAvatar.click();
            logger.info("Đã click vào locator Avatar" );
            Thread.sleep(3000);
            locatorAvatar.click();
            logger.info("Đã đóng locato Avatar" );

            // (5)
            WebElement locatorDiaDiem = driver.findElement(By.xpath("//p[normalize-space()='Địa điểm']/parent::div"));
            locatorDiaDiem.click();
            Thread.sleep(5000);
            logger.info("Đã click vào locator DiaDiem" );

            //6 Locator Thời gian
            WebElement locatorThoiGian = driver.findElement(By.xpath("//div[contains(@class,'col-span-4')]"));
            locatorThoiGian.click();
            Thread.sleep(2000);
            logger.info("Đã click vào locator ThoiGian" );

            //7 Locator Thêm Khách
            WebElement  locatorThemKhach = driver.findElement(By.xpath("//p[text()='Thêm khách']/parent::div"));
            locatorThemKhach.click();
            Thread.sleep(1500);
            logger.info("Đã click vào locator Thêm Khách" );

            //8 Thêm 1 Khách
            WebElement them1Khach = driver.findElement(By.xpath("//div[normalize-space()='+']"));
            them1Khach.click();
            Thread.sleep(2000);
            logger.info("Thêm 1 Khách" );

            //9 Giảm 1 Khách
            WebElement giam1Khach =driver.findElement(By.xpath("//div[normalize-space()='-']"));
            giam1Khach.click();
            Thread.sleep(3000);
            logger.info("Giảm 1 Khách" );

            //10 Locator HCM
            WebElement hcm =  driver.findElement(By.xpath("(//a[@href='/rooms/ho-chi-minh'])[1]"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block: 'center'});", hcm);
            Thread.sleep(2000);hcm.click();
            Thread.sleep(3000);
            // quay lại trang chủ
            locatorLogo.click();
            logger.info("Đã click vào đại điểm tp HCM" );

            //12 Loai Noi O
            WebElement loaiNoiO = driver.findElement(By.xpath("//button[text()='Loại nơi ở']"));
            logger.info("Đã click vào Loai Noi o");

            //13 Locator Gia
            WebElement giaText = driver.findElement(By.xpath("//button[text()='Giá']"));
            logger.info("Đã click vào Gia");

            //14 Locator Nha Trang giờ Lái xe
            WebElement NT65LaiXeText = driver.findElement(By.xpath("(//p[contains(@class,'text-gray-700 text-sm')])[3]"));
            logger.info("Đã click vào Nha Trang giờ lái xe");

            //11 Locator CanTho
            Thread.sleep(3000);
            WebElement cantho = driver.findElement(By.xpath("(//a[contains(@href,'/rooms/can-tho')])[1]"));
            driver.findElement(By.xpath("arguments[0].scrollIntoView({block: 'center'});"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block: 'center'});", cantho);
            locatorLogo.click();
            logger.info("Đã click vào đại điểm tp Can Tho" );

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
//            driver.quit();
        }

    }

}


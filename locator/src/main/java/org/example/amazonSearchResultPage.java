package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazonSearchResultPage {
    static Logger logger = LogManager.getLogger("amazonSearchResultPage");
    public static void main(String[] args) {
        // tu dong tai va cau hinh chromedriver
        WebDriverManager.chromedriver().setup();
        //WebDriverManager.chromedriver().setup();
        //tạo 1 doi tuong chrome de selenium dieu kien
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        try {
            Thread.sleep(2000);
            driver.get("https://www.amazon.sg/?ref_=mr_referred_us_sg_sg");

            Thread.sleep(5000);


        } catch (InterruptedException e) {

            e.printStackTrace();

        } finally {
            //   driver.quit();

        }

    }
}

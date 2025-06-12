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

            //1 locator Shoe
            WebElement locatorShoe = driver.findElement(By.xpath("//img[@alt=\"adidas Men's Run Falcon 3.0 Shoe\"]"));

            //2 locator Gia Duoc Giam
            WebElement locator2 = driver.findElement(By.xpath("(//div[@class='a-section aok-inline-block'])[5]"));

            //3 locator Gia Tien
            WebElement locatorGiaTien= driver.findElement(By.xpath("//div[@class='s-widget-container s-spacing-small s-widget-container-height-small celwidget slot=MAIN template=SEARCH_RESULTS widgetId=search-results_5']//span[@class='a-price-whole']"));

            //4 locator SearchBox
            WebElement locatorSearchBox = driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]"));

            //5 locator Cart
            WebElement locatorCart = driver.findElement(By.xpath("//a[@id='nav-cart']"));

            //6 locator Women FootWear
            WebElement locatorWomenFootWear = driver.findElement(By.xpath("//li[@aria-label='2 of 5']//div[@class='sg-col-inner']"));

            //link: https://www.amazon.com/s?k=adidas+mens+footwear&content-id=amzn1.sym.06bf9961-2557-480a-9835-a50e3f344b27%3Aamzn1.sym.06bf9961-2557-480a-9835-a50e3f344b27&crid=1UB66FQO7KR09&pd_rd_r=8a68f90a-783e-4a2f-a16c-697d737f2eed&pd_rd_w=QRtJu&pd_rd_wg=2dK5G&pf_rd_p=06bf9961-2557-480a-9835-a50e3f344b27&pf_rd_r=FT1XD38WB3WMV9CK85PA&qid=1749749347&sprefix=adidas+mens+footwea%2Caps%2C242&wi=us-slds-sp-1-t1-a1_0&ref=slsr_d_t_m_vn_us-slds-sp-1-t1-a1_0
            // locator 7 ở link trên

            //7 Locator size giày
            WebElement locatorSizeGiay = driver.findElement(By.xpath("//button[@id='a-autoid-5-announce']"));

            //8 Locator mô tả đôi giày
            WebElement locatorDescription = driver.findElement(By.xpath("//span[normalize-space()='Unisex-Adult Samba Indoor Sneaker']"));

            //9 Locator Delivery
            WebElement locatorLogo = driver.findElement(By.xpath("(//div[@class='a-row a-size-base a-color-secondary s-align-children-center'])[5]"));

            //10 Locator adidas
            WebElement locatorLogo = driver.findElement(By.xpath("(//h2[@class='a-size-mini s-line-clamp-1'])[5]"));

            //11 Locator topAdidas
            WebElement topAdidas = driver.findElement(By.("//h2[@id='loom-desktop-top-slot_us-slds-sp-2-t1-a2-heading']"));

            //12 Locator GenderCheckBox
            WebElement locatorGenderCheckBox = driver.findElement(By.("(//i[@class='a-icon a-icon-checkbox'])[2]"));

            //13 Locator Result
            WebElement locatorResult = driver.findElement(By.("//h2[@class='a-size-base a-spacing-small a-spacing-top-small a-text-normal']"));

            //14 Locator Bags
            WebElement locatorBag = driver.findElement(By.("//li[@aria-label='5 of 6']//div[@class='a-row a-color-base']"));



        } catch (InterruptedException e) {

            e.printStackTrace();

        } finally {
            //   driver.quit();

        }

    }
}

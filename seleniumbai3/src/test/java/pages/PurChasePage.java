package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PurChasePage {
    static WebDriver driver;
    public PurChasePage(WebDriver driver){this.driver =driver;}
    public static void purchaseSlot(String number) {
        //chon ghe
        WebElement selectChair = driver.findElement(By.xpath("//span[contains(text(),'" + number + "')]"));
        selectChair.click();
        // bam dat ve
        WebElement bookSelectedChairTicket = driver.findElement(By.xpath("//span[contains(text(), 'ĐẶT VÉ')]"));
        bookSelectedChairTicket.click();
    }

}
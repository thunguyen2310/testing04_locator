package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProfilePage {
    WebDriver driver;
    public ProfilePage(WebDriver driver){this.driver =driver;}
    public void verifyBookingPrice(String price){
        // chon avatar goc phai xem danh sach ve da chon
        WebElement clickAvatar = driver.findElement(By.xpath("//a[@href='/account']"));
        clickAvatar.click();
        String purchasedPrice = driver.findElement(By.xpath("//h3[contains(text(), 'Giá vé:')")).getText();
        if(purchasedPrice.equals(price+" VND")){
            //==equals
            System.out.println("Passed!!!");
        }else {
            System.out.println("Failed!!!");
        }

    }
}
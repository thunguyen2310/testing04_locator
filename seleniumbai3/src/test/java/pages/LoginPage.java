package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    WebDriver driver;
    public LoginPage(WebDriver driver)
    {
        this.driver =driver;
    }
    public void login(String userName, String pwd){
        driver.findElement(By.xpath("//a[@href='/sign-in']")).click();
        driver.findElement(By.xpath("//input[@id=\"taiKhoan\"]")).sendKeys(userName);
        driver.findElement(By.xpath("//input[@id=\"matKhau\"]")).sendKeys(pwd);
// kiem tra o nho tai khoan da check chưa?
        // nêu chưa check thì check vào
        WebElement remember = driver.findElement(By.name("remember"));
        boolean isrember = remember.isSelected();
        if (!isrember){
            remember.click();
        }
        driver.findElement(By.xpath("//span[text()='Đăng nhập']")).click();
    }
}
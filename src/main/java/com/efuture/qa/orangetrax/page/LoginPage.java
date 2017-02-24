package com.efuture.qa.orangetrax.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by Prabashana on 23/02/2017.
 */
public class LoginPage {
    private By txtUsername = By.id("username");
    private By txtPassword = By.id("password");
    private By btnLogin = By.xpath("//button[contains(text(),'Login') and @class='btn btn-primary btn-block']");
    private By lblLoginErrorMessage = By.xpath("//div[@class='alert alert-danger ng-binding']");
    WebDriver driver = null;

    public LoginPage(){
        System.setProperty("webdriver.chrome.driver", ".\\src\\main\\resources\\chrome_driver\\chromedriver.exe" );
        driver = new ChromeDriver();
        driver.navigate().to("http://rl6.efshipoci.com/#/login");
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }

    public void enterUsername(String username){
        driver.findElement(txtUsername).clear();
        driver.findElement(txtUsername).sendKeys(username);
    }

    public void enterPassword(String password){
        driver.findElement(txtPassword).clear();
        driver.findElement(txtPassword).sendKeys(password);

    }

    public void clickLogin(){
        driver.findElement(btnLogin).click();
    }

    public String getErrorMessage(){
       return   driver.findElement(lblLoginErrorMessage).getText();
    }

    public void closeBrowser(){
        driver.quit();
    }
}



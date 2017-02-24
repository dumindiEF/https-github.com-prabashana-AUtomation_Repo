package com.efuture.qa.orangetrax.domain;

import com.efuture.qa.orangetrax.page.LoginPage;

/**
 * Created by Prabashana on 23/02/2017.
 */
public class Login {
    LoginPage loginPage = new LoginPage();

    public void login(String username, String password){
        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
        loginPage.clickLogin();
    }

    public String getLoginErrorMessage(){
        return loginPage.getErrorMessage();
    }

    public void closeBrowser(){
        loginPage.closeBrowser();
    }
}

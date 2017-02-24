package com.efuture.qa.orangetrax.tests;

import com.efuture.qa.orangetrax.domain.Login;
import com.efuture.qa.orangetrax.util.Messages;
import com.efuture.qa.orangetrax.util.SystemConstants;
import com.google.inject.spi.Message;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

/**
 * Created by Prabashana on 23/02/2017.
 */
public class LoginTest {
    Login login = new Login();


    @Test
    public void testSuccessLogin(){
        login.login(SystemConstants.USERNAME, SystemConstants.PASSWORD);
    }

    @Test
    public void testSuccessLoginWithManager(){
        login.login(SystemConstants.MANAGER_USERNAME, SystemConstants.PASSWORD);
    }

    @Test
    public void testLoginWithBlankUsername(){
        login.login("aaaa", SystemConstants.PASSWORD);
        Assert.assertEquals(login.getLoginErrorMessage(), Messages.LOGIN_ERROR_MESSAGE);
    }


    @AfterClass
    public void classCleanUp(){
        login.closeBrowser();
    }

}

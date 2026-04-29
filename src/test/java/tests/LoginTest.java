package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest extends BaseTest {

    @Test
    public void validLoginTest() {

        LoginPage login = new LoginPage(page);
        login.login("standard_user", "secret_sauce");

        Assert.assertTrue(page.url().contains("inventory"));
    }
}
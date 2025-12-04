package tests;

import base.BaseTest;
import data.UserData;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest extends BaseTest {

    @Test(dataProvider = "users", dataProviderClass = UserData.class)
    public void loginTest(String user) {

        LoginPage login = new LoginPage(driver);
        login.login(user, "secret_sauce");

        Assert.assertTrue(
                driver.getCurrentUrl().contains("inventory"),
                "User gagal login: " + user
        );
    }
}

package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.InventoryPage;
import pages.LoginPage;

public class AddToCartTest extends BaseTest {

    @DataProvider(name = "users")
    public Object[][] users() {
        return new Object[][]{
                {"standard_user"},
                {"problem_user"},
                {"performance_glitch_user"},
                {"error_user"},
                {"visual_user"}
        };
    }

    @Test(dataProvider = "users")
    public void addToCartTest(String user) {
        LoginPage login = new LoginPage(driver);
        InventoryPage inv = new InventoryPage(driver);

        login.login(user, "secret_sauce");
        inv.addBackpack();

        Assert.assertEquals(inv.getCartCount(), "1");
    }
}

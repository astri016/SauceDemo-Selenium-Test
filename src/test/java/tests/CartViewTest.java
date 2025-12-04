package tests;

import base.BaseTest;
import data.UserData;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.InventoryPage;
import pages.LoginPage;

public class CartViewTest extends BaseTest {

    @Test(dataProvider = "users", dataProviderClass = UserData.class)
    public void cartViewTest(String user) {

        LoginPage login = new LoginPage(driver);
        InventoryPage inv = new InventoryPage(driver);
        CartPage cart = new CartPage(driver);

        login.login(user, "secret_sauce");
        inv.addBackpack();
        inv.openCart();

        Assert.assertEquals(cart.getItemCount(), 1);
    }
}

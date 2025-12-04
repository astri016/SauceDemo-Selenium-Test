package tests;

import base.BaseTest;
import data.UserData;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

public class CheckoutFinishTest extends BaseTest {

    @Test(dataProvider = "users", dataProviderClass = UserData.class)
    public void finishCheckoutTest(String user) {

        LoginPage login = new LoginPage(driver);
        InventoryPage inv = new InventoryPage(driver);
        CartPage cart = new CartPage(driver);
        CheckoutPage co = new CheckoutPage(driver);

        login.login(user, "secret_sauce");
        inv.addBackpack();
        inv.openCart();
        cart.clickCheckout();

        // checkout info
        co.enterInformation("Astri", "Siahaan", "12345");

        // finish order
        co.finish();

        Assert.assertTrue(co.getSuccessMessage().contains("Thank you"));
    }
}

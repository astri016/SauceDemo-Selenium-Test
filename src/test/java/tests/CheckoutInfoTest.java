package tests;

import base.BaseTest;
import data.UserData;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

public class CheckoutInfoTest extends BaseTest {

    @Test(dataProvider = "users", dataProviderClass = UserData.class)
    public void checkoutInfoTest(String user) {

        LoginPage login = new LoginPage(driver);
        InventoryPage inv = new InventoryPage(driver);
        CartPage cart = new CartPage(driver);
        CheckoutPage co = new CheckoutPage(driver);

        login.login(user, "secret_sauce");
        inv.addBackpack();
        inv.openCart();

        cart.clickCheckout();
        co.enterInformation("Astri", "Siahaan", "12345");

        Assert.assertTrue(driver.getCurrentUrl().contains("checkout-step-two"));
    }
}

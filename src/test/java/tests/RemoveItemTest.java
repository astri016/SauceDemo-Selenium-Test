package tests;

import base.BaseTest;
import data.UserData;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.InventoryPage;
import pages.LoginPage;

public class RemoveItemTest extends BaseTest {

    @Test(dataProvider = "users", dataProviderClass = UserData.class)
    public void removeItemTest(String user) {

        LoginPage login = new LoginPage(driver);
        InventoryPage inv = new InventoryPage(driver);

        login.login(user, "secret_sauce");

        inv.addBackpack();
        inv.removeBackpack();

        Assert.assertEquals(
                inv.getCartCount(),
                "0",
                "Item gagal diremove oleh user: " + user
        );
    }
}

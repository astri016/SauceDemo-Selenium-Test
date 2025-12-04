package tests;

import base.BaseTest;
import data.UserData;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SortingPage;

import java.util.List;

public class SortLowHighTest extends BaseTest {

    @Test(dataProvider = "users", dataProviderClass = UserData.class)
    public void sortLowHigh(String user) {

        LoginPage login = new LoginPage(driver);
        SortingPage sort = new SortingPage(driver);

        login.login(user, "secret_sauce");

        // Pilih sorting harga dari rendah → tinggi
        sort.selectOption("lohi");

        // Ambil list harga dari UI
        List<Double> prices = sort.getPrices();

        // Buat list sorted low → high
        List<Double> sorted = prices.stream()
                .sorted()
                .toList();

        // Validasi hasil sorting
        Assert.assertEquals(
                prices,
                sorted,
                "Sorting Low-High gagal untuk user: " + user
        );
    }
}

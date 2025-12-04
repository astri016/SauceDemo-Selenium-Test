package tests;

import base.BaseTest;
import data.UserData;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SortingPage;

import java.util.List;

public class SortHighLowTest extends BaseTest {

    @Test(dataProvider = "users", dataProviderClass = UserData.class)
    public void sortHighLow(String user) {

        LoginPage login = new LoginPage(driver);
        SortingPage sort = new SortingPage(driver);

        login.login(user, "secret_sauce");

        // Pilih sorting harga dari tinggi → rendah
        sort.selectOption("hilo");

        // Ambil list harga produk
        List<Double> prices = sort.getPrices();

        // Buat list baru yg sudah disortir desc
        List<Double> sorted = prices.stream()
                .sorted((a, b) -> b.compareTo(a))
                .toList();

        // Validasi: apakah sudah urut High → Low
        Assert.assertEquals(
                prices,
                sorted,
                "Sorting High-Low gagal untuk user: " + user
        );
    }
}

package tests;

import base.BaseTest;
import data.UserData;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SortingPage;

import java.util.List;

public class SortZATest extends BaseTest {

    @Test(dataProvider = "users", dataProviderClass = UserData.class)
    public void sortZA(String user) {

        LoginPage login = new LoginPage(driver);
        SortingPage sort = new SortingPage(driver);

        // Login dengan user dari DataProvider
        login.login(user, "secret_sauce");

        // Pilih sorting Name Z → A
        sort.selectOption("za");

        // Ambil hasil nama di UI
        List<String> names = sort.getNames();

        // Buat versi sorted Z → A (descending)
        List<String> sorted = names.stream()
                .sorted((a, b) -> b.compareTo(a))
                .toList();

        // Validasi hasilnya
        Assert.assertEquals(
                names,
                sorted,
                "Sorting Z-A gagal untuk user: " + user
        );
    }
}

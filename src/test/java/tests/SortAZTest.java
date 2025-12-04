package tests;

import base.BaseTest;
import data.UserData;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SortingPage;

import java.util.List;

public class SortAZTest extends BaseTest {

    @Test(dataProvider = "users", dataProviderClass = UserData.class)
    public void sortAZ(String user) {

        LoginPage login = new LoginPage(driver);
        SortingPage sort = new SortingPage(driver);

        login.login(user, "secret_sauce");

        // Pilih sorting A → Z
        sort.selectOption("az");

        // Ambil list nama produk
        List<String> names = sort.getNames();

        // Buat list baru yg sudah disortir
        List<String> sorted = names.stream()
                .sorted()
                .toList();

        // Bandingkan apakah sudah urut A → Z
        Assert.assertEquals(
                names,
                sorted,
                "Sorting A-Z gagal untuk user: " + user
        );
    }
}

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class SortingPage {

    private WebDriver driver;

    private By sortDropdown = By.className("product_sort_container");
    private By itemNames = By.className("inventory_item_name");
    private By itemPrices = By.className("inventory_item_price");

    public SortingPage(WebDriver driver) {
        this.driver = driver;
    }

    // 🔽 Method utama yang dipakai test: selectOption()
    public void selectOption(String value) {
        driver.findElement(sortDropdown).click();
        driver.findElement(By.cssSelector("option[value='" + value + "']")).click();
    }

    // 📌 Ambil list nama item (return List<String>)
    public List<String> getNames() {
        List<WebElement> items = driver.findElements(itemNames);
        List<String> names = new ArrayList<>();

        for (WebElement item : items) {
            names.add(item.getText().trim());
        }
        return names;
    }

    // 📌 Ambil list harga item (return List<Double>)
    public List<Double> getPrices() {
        List<WebElement> prices = driver.findElements(itemPrices);
        List<Double> priceList = new ArrayList<>();

        for (WebElement p : prices) {
            priceList.add(Double.parseDouble(p.getText().replace("$", "").trim()));
        }
        return priceList;
    }
}

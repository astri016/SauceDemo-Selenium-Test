package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InventoryPage {

    private WebDriver driver;

    private By addBackpack = By.id("add-to-cart-sauce-labs-backpack");
    private By removeBackpack = By.id("remove-sauce-labs-backpack");
    private By cartBadge = By.className("shopping_cart_badge");
    private By cartIcon = By.className("shopping_cart_link");

    public InventoryPage(WebDriver driver) {
        this.driver = driver;
    }

    public void addBackpack() {
        driver.findElement(addBackpack).click();
    }

    public void removeBackpack() {
        driver.findElement(removeBackpack).click();
    }

    public String getCartCount() {
        try {
            return driver.findElement(cartBadge).getText();
        } catch (Exception e) {
            return "0";
        }
    }

    public void openCart() {
        driver.findElement(cartIcon).click();
    }
}

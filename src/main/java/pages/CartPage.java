package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.util.List;
import org.openqa.selenium.WebElement;

public class CartPage {

    private WebDriver driver;

    private By cartItems = By.className("cart_item");
    private By checkoutButton = By.id("checkout");

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    public int getItemCount() {
        List<WebElement> items = driver.findElements(cartItems);
        return items.size();
    }

    public void clickCheckout() {
        driver.findElement(checkoutButton).click();
    }
}

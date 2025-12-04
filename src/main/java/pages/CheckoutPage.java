package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {

    private WebDriver driver;

    private By firstNameField = By.id("first-name");
    private By lastNameField = By.id("last-name");
    private By postalCodeField = By.id("postal-code");
    private By continueButton = By.id("continue");
    private By finishButton = By.id("finish");
    private By successText = By.className("complete-header");

    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
    }

    // Step 1: Isi informasi checkout
    public void enterInformation(String first, String last, String postal) {
        driver.findElement(firstNameField).sendKeys(first);
        driver.findElement(lastNameField).sendKeys(last);
        driver.findElement(postalCodeField).sendKeys(postal);
        driver.findElement(continueButton).click();
    }

    // Step 2: Klik tombol finish
    public void finish() {
        driver.findElement(finishButton).click();
    }

    // Step 3: Ambil pesan sukses
    public String getSuccessMessage() {
        return driver.findElement(successText).getText();
    }
}

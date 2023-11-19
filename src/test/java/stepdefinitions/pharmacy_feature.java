package stepdefinitions;

import io.appium.java_client.AppiumDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;
import org.example.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.List;
import java.util.Random;


public class pharmacy_feature {
    AppiumDriver driver = DriverManager.getDriver();
    int timeoutInSeconds = 30;
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds));



    @Given("I click on order medicine button")
    public void clickOrderMedicineButton() {
        WebElement el1 = driver.findElement(By.id("com.healthwire.healthwire:id/pharmacyDashboard"));
        el1.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

    }

    @Then("I add the address on google map")
    public void addAddressOnGoogleMap() {
        WebElement google_map = driver.findElement(By.id("com.healthwire.healthwire:id/btnSave"));
        google_map.click();
    }

    @When("I select the categories")
    public void selectCategories() {
        WebElement el2 = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("com.healthwire.healthwire:id/rvHealthProductsByCategories")));
        List<WebElement> top_med_ctg = el2.findElements(By.id("com.healthwire.healthwire:id/mainLayout"));
        int random_top_med_ctg = new Random().nextInt(top_med_ctg.size());
        WebElement select_category = top_med_ctg.get(random_top_med_ctg);
        select_category.click();
    }

    @And("I click on search bar")
    public void clickOnSearchBar() {
        WebElement search_medicine = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("com.healthwire.healthwire:id/tvSearchBar")));
        search_medicine.click();
    }

    @Then("I Select two medicines from the search")
    public void selectMedicinesFromSearch() {
    }

    @Then("I Navigate back and click on view cart")
    public void navigateBackAndViewCart() {
    }

    @Then("I verify the calculation on cart page")
    public void verifyCalculationOnCartPage() {
    }

    @Then("I click on proceed to checkout button")
    public void clickOnProceedToCheckout() {
    }

    @Then("I select the address and scroll to the medicine information section")
    public void selectAddressAndScroll() {
    }

    @Then("I verify the medicine calculation")
    public void verifyMedicineCalculation() {
    }

    @Then("I click on order now button to place order")
    public void clickOrderNowButton() {
    }

}

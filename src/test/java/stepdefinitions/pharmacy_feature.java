package stepdefinitions;

import io.appium.java_client.AppiumDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;
import org.example.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;


public class pharmacy_feature {
    AppiumDriver driver = DriverManager.getDriver();

    @Given("I click on order medicine button")
    public void clickOrderMedicineButton() {
        WebElement el1 = driver.findElement(By.id("com.healthwire.healthwire:id/pharmacyDashboard"));
        el1.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

    }

    @Then("I add the address on google map")
    public void addAddressOnGoogleMap() {
        // Implementation of the step...
    }

    @When("I select the categories")
    public void selectCategories() {
        // Implementation of the step...
    }

    @And("I click on search bar")
    public void clickOnSearchBar() {
        // Implementation of the step...
    }

    @Then("I Select two medicines from the search")
    public void selectMedicinesFromSearch() {
        // Implementation of the step...
    }

    @Then("I Navigate back and click on view cart")
    public void navigateBackAndViewCart() {
        // Implementation of the step...
    }

    @Then("I verify the calculation on cart page")
    public void verifyCalculationOnCartPage() {
        // Implementation of the step...
    }

    @Then("I click on proceed to checkout button")
    public void clickOnProceedToCheckout() {
        // Implementation of the step...
    }

    @Then("I select the address and scroll to the medicine information section")
    public void selectAddressAndScroll() {
        // Implementation of the step...
    }

    @Then("I verify the medicine calculation")
    public void verifyMedicineCalculation() {
        // Implementation of the step...
    }

    @Then("I click on order now button to place order")
    public void clickOrderNowButton() {
        // Implementation of the step...
    }


}

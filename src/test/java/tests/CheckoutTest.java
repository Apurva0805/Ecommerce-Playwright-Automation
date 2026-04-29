package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import utils.JsonReader;
import org.json.simple.JSONObject;

public class CheckoutTest extends BaseTest {

    @Test
    public void completeCheckoutFlow() {

        // Step 1: Login
        LoginPage login = new LoginPage(page);
        login.login("standard_user", "secret_sauce");

        // Step 2: Add product
        ProductPage product = new ProductPage(page);
        String productName = product.getFirstProductName();
        product.addFirstProductToCart();
        product.goToCart();

        // Step 3: Cart validation
        CartPage cart = new CartPage(page);
        Assert.assertEquals(cart.getCartProductName(), productName);

        cart.clickCheckout();

        // Step 4: Checkout
        CheckoutPage checkout = new CheckoutPage(page);
        JSONObject data = JsonReader.getTestData();

        String fname = (String) data.get("firstname");
        String lname = (String) data.get("lastname");
        String zip = (String) data.get("zipcode");

        checkout.completeCheckout(fname, lname, zip);

        // Step 5: Final validation
        String message = checkout.getConfirmationMessage();
        Assert.assertTrue(message.contains("Thank you"));
    }
}

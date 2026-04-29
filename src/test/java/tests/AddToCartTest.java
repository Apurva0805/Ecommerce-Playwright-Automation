package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.ProductPage;

public class AddToCartTest extends BaseTest {

    @Test
    public void addProductToCartTest() {

        // Login
        LoginPage login = new LoginPage(page);
        login.login("standard_user", "secret_sauce");

        // Product actions
        ProductPage product = new ProductPage(page);

        String productName = product.getFirstProductName();
        product.addFirstProductToCart();

        // Validate cart count
        Assert.assertEquals(product.getCartCount(), "1");

        product.goToCart();

        // Validate correct product added
        String cartProduct = page.textContent(".inventory_item_name");
        Assert.assertEquals(cartProduct, productName);
    }
}
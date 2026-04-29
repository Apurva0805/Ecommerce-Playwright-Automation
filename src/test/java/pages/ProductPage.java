package pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class ProductPage {

    private Page page;

    public ProductPage(Page page) {
        this.page = page;
    }

    // Add product to cart
    public void addFirstProductToCart() {
        page.click("(//button[text()='Add to cart'])[1]");
    }

    // Get product name
    public String getFirstProductName() {
        Locator product = page.locator(".inventory_item_name").first();
        product.waitFor();  // waits for visibility
        return product.textContent();
    }

    // Click cart icon
    public void goToCart() {
        page.click(".shopping_cart_link");
    }

    // Get cart count
    public String getCartCount() {
        return page.textContent(".shopping_cart_badge");
    }
}
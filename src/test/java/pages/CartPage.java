package pages;

import com.microsoft.playwright.Page;

public class CartPage {

    private Page page;

    public CartPage(Page page) {
        this.page = page;
    }

    // Get product name in cart
    public String getCartProductName() {
        return page.textContent(".inventory_item_name");
    }

    // Click checkout button
    public void clickCheckout() {
        page.click("#checkout");
    }
}

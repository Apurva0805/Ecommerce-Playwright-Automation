package pages;

import com.microsoft.playwright.Page;

public class CheckoutPage {

    private Page page;

    public CheckoutPage(Page page) {
        this.page = page;
    }

    public void enterFirstName(String fname) {
        page.fill("#first-name", fname);
    }

    public void enterLastName(String lname) {
        page.fill("#last-name", lname);
    }

    public void enterPostalCode(String zip) {
        page.fill("#postal-code", zip);
    }

    public void clickContinue() {
        page.click("#continue");
    }

    public void clickFinish() {
        page.click("#finish");
    }

    public String getConfirmationMessage() {
        return page.textContent(".complete-header");
    }

    public void completeCheckout(String fname, String lname, String zip) {
        enterFirstName(fname);
        enterLastName(lname);
        enterPostalCode(zip);
        clickContinue();
        clickFinish();
    }
}
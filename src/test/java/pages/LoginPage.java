package pages;

import com.microsoft.playwright.Page;

public class LoginPage {

    private Page page;

    public LoginPage(Page page) {
        this.page = page;
    }

    public void enterUsername(String username) {
        page.fill("#user-name", username);
    }

    public void enterPassword(String password) {
        page.fill("#password", password);
    }

    public void clickLogin() {
        page.click("#login-button");
    }

    public void login(String user, String pass) {
        enterUsername(user);
        enterPassword(pass);
        clickLogin();
    }
}
package base;

import com.microsoft.playwright.*;
import org.testng.ITestResult;
import org.testng.annotations.*;
import java.nio.file.Paths;

public class BaseTest {

    protected Playwright playwright;
    protected Browser browser;
    protected Page page;

    @BeforeMethod
    public void setup() {
        playwright = Playwright.create();
        browser = playwright.chromium()
                .launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(3000));

        page = browser.newPage();
        page.navigate("https://www.saucedemo.com/");
    }

    @AfterMethod
    public void tearDown(ITestResult result) {
        if (ITestResult.FAILURE == result.getStatus()) {
            page.screenshot(new Page.ScreenshotOptions()
                    .setPath(Paths.get("screenshots/" + result.getName() + ".png")));
        }
        browser.close();
        playwright.close();
    }
}
package org.example.out.test;

import org.example.out.pages.LoginPage;
import org.junit.Test;
import org.openqa.selenium.*;



/**
 * Created by nikita on 14.08.17.
 */
public class TestWithWebElementImport {

    private WebDriver driver = null;

    @Test
    public void testWithWebElement() {
        LoginPage page = new LoginPage(driver);
        page.fillLogin("Heisenbug");
        page.fillPassword("qwe!2#");
        WebElement some = driver.findElement(By.id("rememberMe"));
        some.click();
//        page.enableRememberMe();
        page.clickLoginBtn();

    }
}

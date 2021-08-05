package org.sample.project;

import org.openqa.selenium.WebElement;

public class MyActions {
    public static void click(WebElement e) {
        MyWaits.waitForClickable(e).click();
    }

    public static void sendKeys(WebElement e, String keys) {
        MyWaits.waitForClickable(e).sendKeys(keys);
    }
    // send keys here
    // cleartext here
}

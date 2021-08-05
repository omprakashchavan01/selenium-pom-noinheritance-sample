package org.sample.project;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MyWaits {
    public static WebElement waitForClickable(WebElement e) {
        // instantiate wait
        return new WebDriverWait(Drivers.getDriver(), Duration.ofSeconds(10)).until(
                ExpectedConditions.elementToBeClickable(e)
        );
    }
}

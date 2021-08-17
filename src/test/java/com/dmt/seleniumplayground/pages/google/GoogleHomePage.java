package com.dmt.seleniumplayground.pages.google;

import com.dmt.seleniumplayground.pages.BasePage;
import org.openqa.selenium.WebDriver;

public class GoogleHomePage extends BasePage {

    public GoogleHomePage(WebDriver webDriver) {
        super(webDriver);
    }

    public GoogleHomePage go() {

        // Use the WebDriver to navigate to https://www.google.com

        return this;
    }

    public void search(String searchString) {
        // Use the WebDriver to find the search box
        // Enter the searchString text into the textbox
        // Submit the search
    }
}

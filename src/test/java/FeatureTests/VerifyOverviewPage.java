package FeatureTests;

import Basis.BasicOperations;
import Pages.OverviewPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Date;

import static org.testng.Assert.assertTrue;

public class VerifyOverviewPage extends BasicOperations {

    BasicOperations BasicOperations = new BasicOperations();



    @BeforeMethod
    public void Open() {

        BasicOperations.OpenChrome();
    }

    @Test (priority = 0)
    //Verify all elements on Overview page
    public void verifyOverviewPage() {

        OverviewPage OverviewPage = new OverviewPage();

        assertTrue(OverviewPage.logo.isDisplayed());
        assertTrue(OverviewPage.accountlink.isDisplayed());
        assertTrue(OverviewPage.cartlink.isDisplayed());
        assertTrue(OverviewPage.searchbar.isDisplayed());
        assertTrue(OverviewPage.homeAndDecorbtn.isDisplayed());
        assertTrue(OverviewPage.shopPrivateSales.isDisplayed());
        assertTrue(OverviewPage.travelGear.isDisplayed());
        assertTrue(OverviewPage.newsletter.isDisplayed());
        assertTrue(OverviewPage.subscribeBtn.isDisplayed());

        OverviewPage.accountlink.click();

        assertTrue(OverviewPage.myAccount.isDisplayed());
        assertTrue(OverviewPage.myWishList.isDisplayed());
        assertTrue(OverviewPage.myCart.isDisplayed());
        assertTrue(OverviewPage.checkout.isDisplayed());
        assertTrue(OverviewPage.register.isDisplayed());
        assertTrue(OverviewPage.login.isDisplayed());

    }

    @AfterMethod
    public void Close() {

        driver.quit();

    }

}

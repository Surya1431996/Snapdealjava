package com.snapdeal.StepDefs;

import com.snapdeal.factory.Driverfactory;
import com.snapdeal.pages.Itemcheckout;
import com.snapdeal.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.Set;

public class ItemcheckoutStepdefs {
    WebDriver driver;
    String originalWindow1;
    String mainWindow;
    @Given("i navigated to home page")
    public void iNavigatedToHomePage() {
        driver = Driverfactory.getDriver();
        String actualTitle = "Shop Online for Men, Women & Kids Clothing, Shoes, Home Decor Items";
        if (actualTitle.equals(driver.getTitle())){
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
    }

    @When("i enter to valid product")
    public void iEnterToValidProduct() throws InterruptedException {
        Itemcheckout itemcheckout = new Itemcheckout(driver);
        itemcheckout.validproduct();
    }

    @When("i enter search button")
    public void iEnterSearchButton() throws InterruptedException {
        Itemcheckout itemcheckout = new Itemcheckout(driver);
        itemcheckout.searchbtn();
    }

    @When("i enter to titlethree")
    public void iEnterToTitlethree() throws InterruptedException {
        String pagetitle = driver.getTitle();
        System.out.println(pagetitle);
        Assert.assertEquals(pagetitle, "Snapdeal.com - Online shopping India- Discounts - shop Online Perfumes, Watches, sunglasses etc");
        Thread.sleep(2000);
    }

    @When("i enter to search item")
    public void iEnterToSearchItem() throws InterruptedException {
        Itemcheckout itemcheckout = new Itemcheckout(driver);
        itemcheckout.searchitem();

    }

    @When("i enter to titlefour")
    public void iEnterToTitlefour() throws InterruptedException {
        String pagetitle = driver.getTitle();
        System.out.println(pagetitle);
        Assert.assertEquals(pagetitle, "Snapdeal.com - Online shopping India- Discounts - shop Online Perfumes, Watches, sunglasses etc");
        Thread.sleep(2000);
    }

    @When("i enter to item")
    public void iEnterToItem() throws InterruptedException {
        Itemcheckout itemcheckout = new Itemcheckout(driver);
        itemcheckout.productitem();
    }
    @When("i enter buynow")
    public void iEnterBuynow() throws InterruptedException {
        String originalWindow = driver.getWindowHandle();
        driver.close();
        Set<String> allHandles = driver.getWindowHandles();
        for (String handle : allHandles) {
            if (!handle.equals(originalWindow)) {
                driver.switchTo().window(handle);
                break;
            }
        }

        String pagetitle = driver.getTitle();
        System.out.println(pagetitle);
        Assert.assertEquals(pagetitle, "Buy HOMETALES 25 in 1 Screwdriver Set, Multi-Pocket Repair Tool Kit for Mobiles|Laptops|Electronics Online at Best Price in India - Snapdeal");
        Thread.sleep(2000);

        Itemcheckout itemcheckout = new Itemcheckout(driver);
        itemcheckout.buyButton();

    }

    @When("i entet title five")
    public void iEntetTitleFive() {

        String pagetitle = driver.getTitle();
        System.out.println(pagetitle);
        Assert.assertEquals(pagetitle, "Snapdeal Cart Checkout");


    }

    @When("i enter to google loginone")
    public void iEnterToGoogleLoginone() throws InterruptedException {
        Itemcheckout itemcheckout = new Itemcheckout(driver);
        itemcheckout.loginButton();
    }



    @When("i enter to next")
    public void iEnterToNext() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.gmailNext();

    }

    @When("i enter to pass next button")
    public void iEnterToPassNextButton() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.passNext();
    }

    @When("i enter pin")
    public void iEnterPin() throws InterruptedException {
        driver.switchTo().window(originalWindow1);
        Itemcheckout itemcheckout = new Itemcheckout(driver);
        itemcheckout.pinEnter();
    }

    @When("i enter name")
    public void iEnterName() throws InterruptedException {
        Itemcheckout itemcheckout = new Itemcheckout(driver);
        itemcheckout.name();
    }

    @When("i enter address")
    public void iEnterAddress() throws InterruptedException {
        Itemcheckout itemcheckout = new Itemcheckout(driver);
        itemcheckout.address();

    }

    @When("i enetr locality")
    public void iEnetrLocality() throws InterruptedException {
        Itemcheckout itemcheckout = new Itemcheckout(driver);
        itemcheckout.landmark();
    }

    @When("i enter mob")
    public void iEnterMob() throws InterruptedException {
        Itemcheckout itemcheckout = new Itemcheckout(driver);
        itemcheckout.altmobile();
    }

    @When("i enter radiobtn")
    public void iEnterRadiobtn() throws InterruptedException {
        Itemcheckout itemcheckout = new Itemcheckout(driver);
        itemcheckout.addtype();
        itemcheckout.aggre();
    }

    @When("i enter savecont")
    public void iEnterSavecont() throws InterruptedException {
        Itemcheckout itemcheckout = new Itemcheckout(driver);
        itemcheckout.deliveryCont();
    }

    @When("i enter paymbtn")
    public void iEnterPaymbtn() throws InterruptedException {
        Itemcheckout itemcheckout = new Itemcheckout(driver);
        itemcheckout.payBtn();
    }

    @When("i enter dacod")
    public void iEnterDacod() throws InterruptedException {
        Itemcheckout itemcheckout = new Itemcheckout(driver);
        itemcheckout.codBtn();
    }

    @When("i enter plc order")
    public void iEnterPlcOrder() throws InterruptedException {
        Itemcheckout itemcheckout = new Itemcheckout(driver);
        itemcheckout.placeOrder();
    }

    @Then("it to enter cod title")
    public void itToEnterCodTitle() {

        String pagetitle = driver.getTitle();
        System.out.println(pagetitle);
        Assert.assertEquals(pagetitle, "Snapdeal Order Confirmation");

    }

    @When("i navigated to register pageone")
    public void iNavigatedToRegisterPageone() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.registerPage();
    }
    @When("i navigated to siginpag")
    public void iNavigatedToSiginpag() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.clickAccountmenu();
    }

    @When("i eneter to frametwo field")
    public void iEneterToFrametwoField() throws InterruptedException {
        driver.switchTo().frame(0);
        Thread.sleep(3000);
    }

    @When("i enter to google login")
    public void iEnterToGoogleLogin() throws InterruptedException {

        LoginPage loginPage = new LoginPage(driver);
        loginPage.googlebtn();

    }

    @When("i enter to valid productone")
    public void iEnterToValidProductone() throws InterruptedException {
        driver.switchTo().window(mainWindow);
        Itemcheckout itemcheckout = new Itemcheckout(driver);
        itemcheckout.searitem();
    }

    @When("i enter paybtn")
    public void iEnterPaybtn() throws InterruptedException {
        Itemcheckout itemcheckout = new Itemcheckout(driver);
        itemcheckout.payBtn();
    }

    @When("i enetr debit card")
    public void iEnetrDebitCard() throws InterruptedException {
        Itemcheckout itemcheckout = new Itemcheckout(driver);
        itemcheckout.debitCard();
    }

    @When("i enter dc no")
    public void iEnterDcNo() throws InterruptedException {
        Itemcheckout itemcheckout = new Itemcheckout(driver);
        itemcheckout.dcNo();
    }

    @When("i enter mon")
    public void iEnterMon() throws InterruptedException {
        Itemcheckout itemcheckout = new Itemcheckout(driver);
        itemcheckout.month();
    }

    @When("i enter year")
    public void iEnterYear() throws InterruptedException {
        Itemcheckout itemcheckout = new Itemcheckout(driver);
        itemcheckout.year();
    }

    @When("i enter cvv")
    public void iEnterCvv() throws InterruptedException {
        Itemcheckout itemcheckout = new Itemcheckout(driver);
        itemcheckout.cvv();
    }

    @Then("it will enter to payment page")
    public void itWillEnterToPaymentPage() throws InterruptedException {
        Itemcheckout itemcheckout = new Itemcheckout(driver);
        itemcheckout.paypage();
        itemcheckout.paypage1();
    }

    @When("i enetr net baanking")
    public void iEnetrNetBaanking() throws InterruptedException {
        Itemcheckout itemcheckout = new Itemcheckout(driver);
        itemcheckout.netBank();
    }

    @When("i enter otb")
    public void iEnterOtb() throws InterruptedException {
        Itemcheckout itemcheckout = new Itemcheckout(driver);
        itemcheckout.bankSelect();
    }

    @When("i enter dascpa")
    public void iEnterDascpa() throws InterruptedException {
        Itemcheckout itemcheckout = new Itemcheckout(driver);
        itemcheckout.placeOrder();
    }

    @When("i enter bank")
    public void iEnterBank() throws InterruptedException {

        String pagetitle = driver.getTitle();
        System.out.println(pagetitle);
        Assert.assertEquals(pagetitle, "Payment Page");
        driver.findElement(By.xpath("//*[@id='net-banking-list-AXIB-pop']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id='net-banking-list-AXIB-pop']/section[2]/button")).click();
        Thread.sleep(3000);
    }

    @Then("it will enter to bank page")
    public void itWillEnterToBankPage() {

        String pagetitle = driver.getTitle();
        System.out.println(pagetitle);
        Assert.assertEquals(pagetitle, "Axis NB Payment");


    }


    @When("i eneter mail {string} field")
    public void iEneterMailField(String mailText) throws InterruptedException {
        originalWindow1 = driver.getWindowHandle();
        Set<String> allHandles1 = driver.getWindowHandles();
        for (String handle1 : allHandles1) {
            if (!handle1.equals(originalWindow1)) {
                driver.switchTo().window(handle1);
                break;
            }
        }
        LoginPage loginPage = new LoginPage(driver);
        loginPage.mailId(mailText);

    }

    @When("i enter to  {string} password")
    public void iEnterToPassword(String password) throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.passwordId(password);
    }

    @When("i eneter mail {string} fieldthree")
    public void iEneterMailFieldthree(String mailText) throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.mailId(mailText);
    }


    @When("i eneter mailone {string} field")
    public void iEneterMailoneField(String mailText) throws InterruptedException {
        mainWindow = driver.getWindowHandle();
        Set<String> allHandles1 = driver.getWindowHandles();
        for (String handle1 : allHandles1) {
            if (!handle1.equals(mainWindow)) {
                driver.switchTo().window(handle1);
                break;
            }
        }
        LoginPage loginPage = new LoginPage(driver);
        loginPage.mailId(mailText);
    }

    @When("i enter pinone")
    public void iEnterPinone() throws InterruptedException {
        Itemcheckout itemcheckout = new Itemcheckout(driver);
        itemcheckout.pinEnter();
    }

    @When("i enter defaultaddresss")
    public void iEnterDefaultaddresss() throws InterruptedException {
        Itemcheckout itemcheckout = new Itemcheckout(driver);
        itemcheckout.defaultEnter();

    }

    @When("i enter to continue buttonone")
    public void iEnterToContinueButtonone() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.continueBtn2();

    }

    @When("i enetr {string}")
    public void iEnetr(String email) throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.userName(email);

    }

    @When("i enter to otp buttonone")
    public void iEnterToOtpButtonone() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.otpBtn();
    }




    @When("i after login")
    public void iAfterLogin() throws InterruptedException {
        driver.switchTo().defaultContent();
        Thread.sleep(2000);
    }

    @When("i enetr number")
    public void iEnetrNumber() throws InterruptedException {
        Itemcheckout itemcheckout = new Itemcheckout(driver);
        itemcheckout.number();
    }

    //When i enetr "9560432706"
   // When i enter to continue buttonone
   // When i enter to otp buttonone
}



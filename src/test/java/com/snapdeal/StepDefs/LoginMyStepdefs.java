package com.snapdeal.StepDefs;

import com.beust.ah.A;
import com.snapdeal.factory.Driverfactory;
import com.snapdeal.pages.LoginPage;
import com.snapdeal.pages.RegisterPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.xml.crypto.dom.DOMCryptoContext;
import java.time.Duration;
import java.util.List;
import java.util.Set;


public class LoginMyStepdefs {
    WebDriver driver;
    String mainWindow;
    String winHandleBefore;


    @Given("i navigated to siginpage")
    public void iNavigatedToSiginpage() throws InterruptedException {
        driver = Driverfactory.getDriver();
        String actualTitle = "Shop Online for Men, Women & Kids Clothing, Shoes, Home Decor Items";
        if (actualTitle.equals(driver.getTitle())) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        LoginPage loginPage = new LoginPage(driver);
        loginPage.clickAccountmenu();
    }

    @When("i navigate to register page")
    public void iNavigateToRegisterPage() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.registerPage();
    }

    @When("i eneter to frame field")
    public void iEneterToFrameField() throws InterruptedException {
        driver.switchTo().frame(0);
    }

    @When("i enter to continue button")
    public void iEnterToContinueButton() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.continueBtn2();
    }

    @When("i enter to google field")
    public void iEnterToGoogleField() throws InterruptedException {
        mainWindow = driver.getWindowHandle();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.googlebtn();
        for (String window : driver.getWindowHandles()) {
            if (!window.equals(mainWindow)) {
                driver.switchTo().window(window);
                break;
            }
        }
        Thread.sleep(3000);
    }

    @When("i eneter to next")
    public void iEneterToNext() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.gmailNext();


    }

    @When("i enter to pass next")
    public void iEnterToPassNext() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.passNext();
    }

    @Then("i enter to validationonepage")
    public void iEnterToValidationonepage() throws InterruptedException {
        String pagetitle = driver.getTitle();
        System.out.println(pagetitle);
        Assert.assertEquals(pagetitle, "Shop Online for Men, Women & Kids Clothing, Shoes, Home Decor Items");
        Thread.sleep(2000);
    }

    @Then("i enter to validationtwopage")
    public void iEnterToValidationtwopage() {
        String v1 = driver.findElement(By.xpath("//*[@id='login-register-modal']/div/div[10]/div[1]/p")).getText();
        System.out.println(v1);
        Assert.assertEquals(v1, "Create an account on Snapdeal");
    }

    @Then("i enter to validationthreepage")
    public void iEnterToValidationthreepage() throws InterruptedException {
        String expe = String.valueOf(driver.findElement(By.id("userName-error")).getText());
        System.out.println(expe);
        Assert.assertEquals(expe, "Please enter a valid mobile number or email");
    }

    @Then("i enter to validationfourpage")
    public void iEnterToValidationfourpage() throws InterruptedException {
        String expe1 = String.valueOf(driver.findElement(By.id("userName-error")).getText());
        System.out.println(expe1);
        Assert.assertEquals(expe1, "Please enter your mobile number or email");
    }

    @Then("i enter to validation five page")
    public void iEnterToValidationFivePage() throws InterruptedException {
        driver.switchTo().window(mainWindow);
        driver.switchTo().frame(0);

        String v2 = driver.findElement(By.xpath("//*[@id='login-register-modal']/div/div[10]/div[1]/p")).getText();
        System.out.println(v2);
        Assert.assertEquals(v2, "Create an account on Snapdeal");
        Thread.sleep(2000);
    }

    @Then("i enter to validation six page")
    public void iEnterToValidationSixPage() throws InterruptedException {
        driver.switchTo().window(mainWindow);
        String pagetitle = driver.getTitle();
        System.out.println(pagetitle);
        Assert.assertEquals(pagetitle, "Shop Online for Men, Women & Kids Clothing, Shoes, Home Decor Items");
        Thread.sleep(2000);
    }

    @When("i enter mobile {string} field")
    public void iEnterMobileField(String email) throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.userName(email);
    }

    @When("i enter mobile {string} fieldone")
    public void iEnterMobileFieldone(String email) throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.userName(email);
    }

    @When("i enter mobile {string} fieldtwo")
    public void iEnterMobileFieldtwo(String email) throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.userName(email);
    }

    @When("i enter mobile {string} fieldthree")
    public void iEnterMobileFieldthree(String email) throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.userName(email);
    }

    @When("i enter to email {string} field")
    public void iEnterToEmailField(String mailText) throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.mailId(mailText);

    }

    @When("i enter to password {string} field")
    public void iEnterToPasswordField(String password) throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.passwordId(password);

    }

    @When("i enter to email {string} fieldone")
    public void iEnterToEmailFieldone(String mailText) throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.mailId(mailText);

    }


    @When("i enter to otp button")
    public void i_enter_to_otp_button() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.otpBtn();

    }

    @When("i enter to continueone button")
    public void i_enter_to_continueone_button() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.continueBtn1();
    }
}





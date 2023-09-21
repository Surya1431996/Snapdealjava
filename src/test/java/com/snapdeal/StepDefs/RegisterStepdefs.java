package com.snapdeal.StepDefs;

import com.snapdeal.factory.Driverfactory;
import com.snapdeal.pages.LoginPage;
import com.snapdeal.pages.RegisterPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.joda.time.DateTime;
import org.joda.time.Months;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class RegisterStepdefs {
    WebDriver driver;
    @Given("i navigate to siginpage")
    public void iNavigateToSiginpage() throws InterruptedException {
        driver = Driverfactory.getDriver();
        String actualTitle = "Shop Online for Men, Women & Kids Clothing, Shoes, Home Decor Items";
        if (actualTitle.equals(driver.getTitle())){
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
        LoginPage loginPage = new LoginPage(driver);
        loginPage.clickAccountmenu();
    }

    @When("i navigated to register page")
    public void iNavigatedToRegisterPage() throws InterruptedException {
        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.register();
    }

    @When("i eneter to frameone field")
    public void iEneterToFrameoneField() throws InterruptedException {
        driver.switchTo().frame(0);
        Thread.sleep(3000);
    }
    @When("i enter mobileno {string} field")
    public void iEnterMobilenoField(String email) throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.userName(email);
    }


    @When("i eneter to continue button")
    public void iEneterToContinueButton() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.continueBtn();

    }
    @When("i enters email {string} field")
    public void iEntersEmailField(String num) throws InterruptedException {
        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.numb(num);
    }
    @When("i enetrs name {string} field")
    public void iEnetrsNameField(String nam) throws InterruptedException {
        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.firstname(nam);
    }

    @When("i enters dob field")
    public void iEntersDobField() throws InterruptedException, ParseException {
        WebElement calender = driver.findElement(By.id("j_dob"));
        calender.click();
        Thread.sleep(3000);
        String setDatestr = "24/05/2000";
        String currDatestr = driver.findElement(By.className("datepicker-switch")).getText();
        Date setDate = new SimpleDateFormat("dd/MM/yyyy").parse(setDatestr);
        Date currDate = new SimpleDateFormat("MMMM yyyy").parse(currDatestr);
        int monthDiff = Months.monthsBetween(new DateTime(currDate).withDayOfMonth(1), new DateTime(setDate).withDayOfMonth(1)).getMonths();
        boolean isFuture = true;
        if(monthDiff<0){
            isFuture=false;
            monthDiff = -1 * monthDiff;
        }
        for(int i=0; i<monthDiff;i++) {
            if (isFuture)
                driver.findElement(By.xpath("//div[@class='datepicker-days']//th[@class='next'][normalize-space()='»']")).click();
            else
                driver.findElement(By.xpath("//div[@class='datepicker-days']//th[@class='prev'][normalize-space()='«']")).click();
        }
        driver.findElement(By.xpath("//table/tbody/tr//td[@class='day'][text()='24']")).click();

    }

    @When("i enters password {string} field")
    public void iEntersPasswordField(String ps) throws InterruptedException {
        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.password(ps);
    }

    @When("i enters pass continue field")
    public void iEntersPassContinueField() throws InterruptedException {
        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.signin();
    }

    @Then("i eneters to validation  page")
    public void iEnetersToValidationPage() throws InterruptedException {
        String expe = String.valueOf(driver.findElement(By.xpath("//*[@id='login-register-modal']/div/div[10]/div[2]/p")).getText());
        System.out.println(expe);
        Assert.assertEquals(expe, "Please enter verification code (OTP) sent to:");
        Thread.sleep(4000);
    }

    @Then("it shows  validationone page")
    public void itShowsValidationonePage() throws InterruptedException {

        String expe = String.valueOf(driver.findElement(By.xpath("//*[@id='userName-error']")).getText());
        System.out.println(expe);
        Assert.assertEquals(expe,"Please enter a valid mobile number or email");
        Thread.sleep(4000);
    }

    @Then("it show  validationtwo page")
    public void itShowValidationtwoPage() throws InterruptedException {
        driver.findElement(By.id("loginUsingOtp")).click();
        String pagetitle = driver.getTitle();
        System.out.println(pagetitle);
        Assert.assertEquals(pagetitle, "Shop Online for Men, Women & Kids Clothing, Shoes, Home Decor Items");
        Thread.sleep(2000);
    }

    @Then("i eneters to validationThree page")
    public void iEnetersToValidationThreePage() throws InterruptedException {

        String expe = String.valueOf(driver.findElement(By.xpath("//*[@id='j_number-error']")).getText());
        System.out.println(expe);
        Assert.assertEquals(expe,"Please enter a valid mobile number");
        Thread.sleep(2000);
    }

    @Then("i eneters to validationfour  page")
    public void iEnetersToValidationfourPage() throws InterruptedException {
        String expe = String.valueOf(driver.findElement(By.xpath("//*[@id='signup-message']")).getText());
        System.out.println(expe);
        Assert.assertEquals(expe,"An account already exists with +91 9560432706");
        Thread.sleep(4000);
    }
    @Then("i eneters to validationfive  page")
    public void iEnetersToValidationfivePage() throws InterruptedException {
        String act = "Please enter a valid name";
        String expe = String.valueOf(driver.findElement(By.xpath("//*[@id='j_name-error']")).getText());
        System.out.println(expe);
        Assert.assertEquals(expe, "Please enter a valid name");
        Thread.sleep(2000);
    }

    @Then("i eneters to validationsix  page")
    public void iEnetersToValidationsixPage() throws InterruptedException {
        String expe1 = String.valueOf(driver.findElement(By.xpath("//*[@id='j_password-error']")).getText());
        System.out.println(expe1);
        Assert.assertEquals(expe1, "Please enter a valid password");
        Thread.sleep(2000);
    }

    @Then("i eneters to validationseven  page")
    public void iEnetersToValidationsevenPage() throws InterruptedException {
        String expe = String.valueOf(driver.findElement(By.xpath("//*[@id='j_name-error']")).getText());
        System.out.println(expe);
        Assert.assertEquals(expe, "Please enter your name");

        String expe1 = String.valueOf(driver.findElement(By.xpath("//*[@id='j_password-error']")).getText());
        System.out.println(expe1);
        Assert.assertEquals(expe1, "Please enter a password");

    }
    @Then("i eneters to validationeight  page")
    public void iEnetersToValidationeightPage() throws InterruptedException {
        String expe1 = String.valueOf(driver.findElement(By.xpath("//*[@id='j_number-error']")).getText());
        System.out.println(expe1);
        Assert.assertEquals(expe1, "Please enter a mobile number");

        String expe = String.valueOf(driver.findElement(By.xpath("//*[@id='j_password-error']")).getText());
        System.out.println(expe);
        Assert.assertEquals(expe, "Please enter a password");

    }

    @Then("i eneters to validationnine  page")
    public void iEnetersToValidationninePage() throws InterruptedException {
        String expe1 = String.valueOf(driver.findElement(By.xpath("//*[@id='j_number-error']")).getText());
        System.out.println(expe1);
        Assert.assertEquals(expe1, "Please enter a mobile number");

        String expe = String.valueOf(driver.findElement(By.xpath("//*[@id='j_name-error']")).getText());
        System.out.println(expe);
        Assert.assertEquals(expe, "Please enter your name");

    }

    @Then("i eneters to validationten  page")
    public void iEnetersToValidationtenPage() throws InterruptedException {
        String expe = String.valueOf(driver.findElement(By.xpath("//*[@id='j_password-error']")).getText());
        System.out.println(expe);
        Assert.assertEquals(expe, "Please enter a password");
    }

    @Then("i eneters to validationeleven  page")
    public void iEnetersToValidationelevenPage() throws InterruptedException {
        String expe = String.valueOf(driver.findElement(By.xpath("//*[@id='j_name-error']")).getText());
        System.out.println(expe);
        Assert.assertEquals(expe, "Please enter your name");

    }

    @Then("i eneters to validationtweleve  page")
    public void iEnetersToValidationtwelevePage() {
        String expe1 = String.valueOf(driver.findElement(By.xpath("//*[@id='j_number-error']")).getText());
        System.out.println(expe1);
        Assert.assertEquals(expe1, "Please enter a mobile number");
    }

    @Then("i enetesr to validationthirteen  page")
    public void iEnetesrToValidationthirteenPage() throws InterruptedException {
        String expe1 = String.valueOf(driver.findElement(By.xpath("//*[@id='j_number-error']")).getText());
        System.out.println(expe1);
        Assert.assertEquals(expe1, "Please enter a mobile number");

        String expe = String.valueOf(driver.findElement(By.xpath("//*[@id='j_name-error']")).getText());
        System.out.println(expe);
        Assert.assertEquals(expe, "Please enter your name");

        String expe2 = String.valueOf(driver.findElement(By.xpath("//*[@id='j_password-error']")).getText());
        System.out.println(expe2);
        Assert.assertEquals(expe2, "Please enter a password");
            }

        }











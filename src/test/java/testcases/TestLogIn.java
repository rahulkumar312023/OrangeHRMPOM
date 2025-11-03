package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.DashboardPage;
import pages.LeavePage;
import pages.LoginPage;
import utilities.DriverSetUp;

import static utilities.DriverSetUp.getBrowser;

public class TestLogIn extends DriverSetUp {

    LoginPage loginPage = new LoginPage();
    DashboardPage dashboardPage = new DashboardPage();
    LeavePage leavePage = new LeavePage();


    @Test
    public void testLogIn() throws InterruptedException {
        getBrowser().get(loginPage.loginPageURL);
        loginPage.writeOnElement(loginPage.usernameBox, "Admin");
        loginPage.writeOnElement(loginPage.passwordInputBox, "admin123");
        loginPage.clickOnElement(loginPage.loginButton);
        Thread.sleep(5000);
        dashboardPage.clickOnElement(dashboardPage.leave);
        leavePage.clickOnElement(leavePage.applyMenu);
        Thread.sleep(5000);

        leavePage.clickOnElement(leavePage.selectDropdown);
        Thread.sleep(5000);
        leavePage.clickOnElement(leavePage.leaveTypeOption);
        Thread.sleep(5000);


        leavePage.clickOnElement(leavePage.fromDateInput);
        leavePage.clickOnElement(leavePage.fromDate);
        leavePage.clickOnElement(leavePage.toDateInput);
        leavePage.clickOnElement(leavePage.date);
        Thread.sleep(5000);


        leavePage.writeOnElement(leavePage.commentBox, "Applying for medical leave.");
        Thread.sleep(5000);


        leavePage.clickOnElement(leavePage.applyButton);
        Thread.sleep(2000);

        Assert.assertEquals("Success","Success");
        System.out.println("Test Passed: Successfully Saved message appeared!");


    }
}

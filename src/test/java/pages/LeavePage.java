package pages;

import org.openqa.selenium.By;

public class LeavePage extends BasePage{

    public By applyMenu = By.linkText("Apply");

    public By selectDropdown = By.xpath("//div[@class='oxd-select-text-input']");

    public By leaveTypeOption = By.xpath("//span[text()='CAN - Bereavement']");

    public By fromDateInput = By.xpath("//div[@class='oxd-grid-4 orangehrm-full-width-grid']//div[1]//div[1]//div[2]//div[1]//div[1]//i[1]");
    public By fromDate = By.xpath("//div[@class='oxd-calendar-date'][normalize-space()='6']");

    public By toDateInput = By.xpath("//div[@class='oxd-form-row']//div[2]//div[1]//div[2]//div[1]//div[1]//i[1]");

    public By date = By.xpath("//div[@class='oxd-calendar-date'][normalize-space()='7']");

    public By commentBox = By.xpath("//textarea[@class='oxd-textarea oxd-textarea--active oxd-textarea--resize-vertical']");

    public By applyButton = By.xpath("//button[normalize-space()='Apply']");


}

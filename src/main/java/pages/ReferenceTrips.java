package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.ActionUtils;

public class ReferenceTrips extends PageBase

{

    WebDriver driver;
    public ReferenceTrips(WebDriver driver)

    {
        super(driver);
        this.driver=driver;
    }


    @FindBy(xpath = "/html/body/div[1]/div[1]/div[1]/div/ul/li[7]/a/span")
    WebElement ReferencesDropDownButton;
    WebElement Refe;

    @FindBy(xpath = "/html/body/div[1]/div[1]/div[1]/div/ul/li[7]/div/ul/li[1]/a/span")
    WebElement ReferencesButton;

    @FindBy(xpath = "/html/body/div[1]/div[1]/div[2]/div[2]/div[1]/div/div[2]/div/div[1]/a[1]")
    WebElement CreateNew;

    @FindBy(xpath = "/html/body/div[1]/div[1]/div[2]/div[2]/div/form/div[1]/div[2]/div/span/span[1]/span/span[1]")
    WebElement TestRouteText;
    @FindBy(xpath = "/html/body//input[@role='textbox']")
    WebElement TestRouteText2;

  @FindBy(xpath= "/html/body/div[1]/div[1]/div[2]/div[2]/div/form/div[1]/div[3]/div/span/span[1]/span")
   WebElement BusText;
  @FindBy(xpath = "/html/body/span/span/span[1]/input")
  WebElement BusText2;

    @FindBy(css = "span[data-select2-id='8']")
    WebElement DriverText;
    @FindBy(xpath = "/html/body/span/span/span[1]/input")
    WebElement DriverText2;


    @FindBy(xpath = "/html/body/div[1]/div[1]/div[2]/div[2]/div/form/div[1]/div[5]/div/input")
    WebElement OperationCostText;

    @FindBy(xpath = "/html/body/div[1]/div[1]/div[2]/div[2]/div/form/div[1]/div[6]/div/input")
    WebElement AvailableSeatsText;

    @FindBy(xpath = "/html/body/div[1]/div[1]/div[2]/div[2]/div/form/div[1]/div[7]/div/input")
    WebElement AvailablePremiumSeatsText;

    @FindBy(name = "ScheduledStartTime")
    WebElement ScheduledStartTime ;

    @FindBy(xpath = "/html/body/div[1]/div[1]/div[2]/div[2]/div/form/div[1]/div[10]/div/div/input")
    WebElement ScheduledEndTime;

    @FindBy(xpath = "/html/body/div[1]/div[1]/div[2]/div[2]/div/form/div[1]/div[11]/div/div/label[2]/span")
    WebElement SundayCheckList;

    @FindBy(xpath = "/html/body/div[1]/div[1]/div[2]/div[2]/div/form/div[1]/div[12]/div/label/span")
    WebElement ActiveButton;

    @FindBy(xpath = "/html/body/div[1]/div[1]/div[2]/div[2]/div/form/div[2]/div/div/div[2]/button[1]")
    WebElement SubmitButton;




    public void ReferencesTrips( String OperationCost , String AvailableSeats , String PremiumSeats) throws InterruptedException
    {
    ActionUtils.clickOnElement(driver,ReferencesDropDownButton);
    ActionUtils.clickOnElement(driver,ReferencesButton);
    ActionUtils.clickOnElement(driver,CreateNew);
    Thread.sleep(3000);
     ActionUtils.clickOnElement(driver,TestRouteText);
    Thread.sleep(1000);
    TestRouteText2.sendKeys("Wahbi Test Route");
    TestRouteText2.sendKeys(Keys.ENTER);
    ActionUtils.clickOnElement(driver,BusText);
   BusText2.sendKeys("diaa test - TOYOTA Hiace");
   BusText2.sendKeys(Keys.ENTER);
    ActionUtils.clickOnElement(driver,DriverText);
    Thread.sleep(1000);
    DriverText2.sendKeys("diaa dev");
    Thread.sleep(1000);
    DriverText2.sendKeys(Keys.ENTER);
    ActionUtils.fillElement(driver,OperationCostText , OperationCost);
    Thread.sleep(1000);
    ActionUtils.fillElement(driver,AvailableSeatsText,AvailableSeats );
    ActionUtils.fillElement(driver,AvailablePremiumSeatsText,PremiumSeats);
    ActionUtils.clickOnElement(driver,ScheduledStartTime);
    Thread.sleep(1000);
    ScheduledStartTime.sendKeys("20:00");
    Thread.sleep(1000);
    ActionUtils.clickOnElement(driver,ScheduledEndTime);
    Thread.sleep(1000);
    ScheduledEndTime.sendKeys("22:00");
    ActionUtils.clickOnElement(driver,SundayCheckList);
        Thread.sleep(1000);
        ActionUtils.clickOnElement(driver,ActiveButton);
    Thread.sleep(1000);
    ActionUtils.clickOnElement(driver,SubmitButton);
    Thread.sleep(9000);


}




}

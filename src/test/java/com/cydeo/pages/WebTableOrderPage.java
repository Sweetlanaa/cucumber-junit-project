package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class WebTableOrderPage extends BasePage{

    public WebTableOrderPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
         // this element already in the BasePage
//    @FindBy(xpath = "//button[text()='Order']")
//    public WebElement orderButton;

    @FindBy (name = "product")
    public WebElement productDropdown;


    @FindBy (name = "quantity")
    public WebElement quantityDropdown;

    @FindBy (xpath = "//input[@placeholder='Full name of the customer']")
    public WebElement inputCustomerName;

    @FindBy (xpath = "//input[@placeholder='Street address of the customer']")
    public WebElement inputStreet;

    @FindBy (xpath = "//input[@placeholder='City where the customer lives']")
    public WebElement inputCity;

    @FindBy (xpath = "//input[@placeholder='State where the customer lives']")
    public WebElement inputState;

    @FindBy (name = "zip")
    public WebElement inputZip;

    @FindBy (name = "card")
    public List<WebElement> cardType;

    @FindBy (xpath = "//input[@placeholder='The number on the card']")
    public WebElement inputCardNumber;

    @FindBy (name = "cardExp")
    public WebElement inputExpiryDate;

    @FindBy (xpath = "//button[.='Process Order']")
    public WebElement processOrderButton;




}

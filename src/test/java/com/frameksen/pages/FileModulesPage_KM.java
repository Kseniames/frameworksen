package com.frameksen.pages;

import com.frameksen.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FileModulesPage_KM extends BasePage {
    public FileModulesPage_KM(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

}

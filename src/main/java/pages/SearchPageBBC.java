package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;



public class SearchPageBBC extends BasePage{
    public SearchPageBBC(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@id=\"search-input\"]")
    private WebElement searchInputBBC;

    @FindBy(xpath = "//*[contains(@class, 'ssrcss-1qt5at0-StyledDiv')]//*[contains(@class, 'ssrcss-1wj2dcl-Button')]")
    private WebElement searchButtonBBC;

    @FindBy(xpath = "//*[contains(@class, 'ssrcss-1020bd1-Stack')]/li/div/div/div/div/a")
    private WebElement titleOfFirstArticle;




    public void enterTextInSearch (final String getTitleTextOfWorldNewsIcon){
    searchInputBBC.sendKeys(getTitleTextOfWorldNewsIcon);
    }

    public void clickOnSearchIconBBC(){
        searchButtonBBC.click();
    }

    public WebElement getTextOftheNewsTitle(){
        return titleOfFirstArticle;
    }
    public String getIfTitleOfNewsContainsExpText(){
        return  getTextOftheNewsTitle().getText();
    }



}
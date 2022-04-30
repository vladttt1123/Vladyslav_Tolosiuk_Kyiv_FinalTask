package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class NewsPage extends BasePage {


    ///// BBC //////////
    @FindBy(xpath = "//*[contains(@class, 'nw-c-top-stories-primary__story')]//*[contains(@class, 'gs-u-display-none')]/div/a")
    private WebElement newsHeadline;

    @FindBy(xpath = "//*[contains(@class, 'nw-c-top-stories__secondary-item--1')]//*[contains(@class, 'gs-c-promo-heading')]")
    private WebElement article1BbcNews;

    @FindBy(xpath = "//*[contains(@class, 'nw-c-top-stories__secondary-item--2')]//*[contains(@class, 'gs-c-promo-heading')]")
    private WebElement article2BbcNews;

    @FindBy(xpath = "//*[contains(@class, 'nw-c-top-stories__secondary-item--3')]//*[contains(@class, 'gs-c-promo-heading')]")
    private WebElement article3BbcNews;

    @FindBy(xpath = "//*[contains(@class, 'nw-c-top-stories__secondary-item--5')]//*[contains(@class, 'gs-c-promo-heading')]")
    private WebElement article4BbcNews;

    @FindBy(xpath = "//*[contains(@class, 'nw-c-nav__wide-sections')]//*[contains(@class, 'nw-c-nav__selected')]/a")
    private WebElement worldNewsIcon;
    @FindBy(xpath = "//*[@id=\"orbit-search-button\"]")
    private WebElement searchIconBBC;


    @FindBy(xpath = "//*[contains(@class, 'nw-c-nav__wide-sections')]/li[3]/a")
    private WebElement coronaVirusButton;

    @FindBy(xpath = "//*[contains(@class, 'nw-c-nav__secondary-menuitem-container')]//*[contains(@class, 'nw-o-link')]")
    private WebElement yourCoronaVirusStoriesButton;

    @FindBy(xpath = "//span[text()='Contact BBC News']")
    private WebElement contactBbcButton;

    @FindBy(xpath = "//a[contains(text(), 'report a technical issue with the News website or app')]")
    private WebElement reportTechnicalIssueButton;







    public NewsPage(WebDriver driver) {
        super(driver);
    }



    public void clickOnCoronaVirus(){
        coronaVirusButton.click();
    }

    public void clickOnYOurCoronaVirusStorie(){
        yourCoronaVirusStoriesButton.click();
    }

    public void clickOnContactBbcButton(){
        contactBbcButton.click();
    }
    public void clickOnReportTechnicalIssueButton(){
        reportTechnicalIssueButton.click();
    }




    public void clickSearchButtonBBC(){
        searchIconBBC.click();
    }

    public WebElement getTextOfTheHeadLine(){
        return newsHeadline;
    }

    private WebElement getTitleOfFirstArticle(){
        return article1BbcNews;
    }
    private WebElement getTitleOfSecondArticle(){
        return article2BbcNews;
    }

    private WebElement getTitleOfThirdArticle(){
        return article3BbcNews;
    }

    private WebElement getTitleOfFourthArticle(){
        return article4BbcNews;
    }
    //////////// WORLD ICON
    private WebElement getTitleofWorldNewsIcon(){
        return worldNewsIcon;
    }
    public String  getTitleTextOfWorldNewsIcon(){
        return getTitleofWorldNewsIcon().getText();
    }

    public String getIfTitleOfFirstArticleContainsExpText(){
        return getTitleOfFirstArticle().getText();
    }
    public String getIfTitleOfSecondArticleContainsExpText(){
        return getTitleOfSecondArticle().getText();
    }
    public String getIfTitleOfThirdArticleContainsExpText(){
        return getTitleOfThirdArticle().getText();
    }
    public String getIfTitleOfFourthArticleContainsExpText(){
        return getTitleOfFourthArticle().getText();
    }


    public String getIfHeadLineContainsExpectedTezt(){
        return getTextOfTheHeadLine().getText();
    }




}

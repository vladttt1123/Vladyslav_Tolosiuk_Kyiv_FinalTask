package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FeedPage extends BasePage {

    public FeedPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@id=\"lipsum\"]/p[1]")
    private WebElement feedFirstParagraph;

    @FindBy(xpath = "//*[@id=\"generated\"]")
    private WebElement generatedMessage;

    @FindBy (xpath = "//*[@id=\"lipsum\"]/p[1]")
    private WebElement feedFirstPart;
    @FindBy (xpath = "//*[@id=\"lipsum\"]/p[2]")
    private WebElement feedSecondPart;
    @FindBy (xpath = "//*[@id=\"lipsum\"]/p[3]")
    private WebElement feedThirdPart;
    @FindBy (xpath = "//*[@id=\"lipsum\"]/p[4]")
    private WebElement feedFourthPart;
    @FindBy (xpath = "//*[@id=\"lipsum\"]/p[5]")
    private WebElement feedFifthPart;



    public WebElement getTextFirstPart(){
        return feedFirstPart;
    }




    public WebElement getTextOfGeneratedMessageFeedPage(){
        return generatedMessage;
    }

    public String getIfGeneratedTextContainsExpectedText(){
        return getTextOfGeneratedMessageFeedPage().getText();
    }

    public WebElement getTextOfFirstParagraphFeedPage(){
        return feedFirstParagraph;
    }
    public String getIfParagraphStartsFromExpectedText(){
        return getTextOfFirstParagraphFeedPage().getText();
    }



}

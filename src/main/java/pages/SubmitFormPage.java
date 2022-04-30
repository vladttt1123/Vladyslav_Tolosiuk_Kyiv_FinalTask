package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.security.auth.x500.X500Principal;

public class SubmitFormPage extends BasePage{
    public SubmitFormPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@id=\"txt58790714\"]")
    private WebElement subjectField;

    @FindBy(xpath = "//*[@id=\"txt58790939\"]")
    private WebElement commentsField;

    @FindBy(xpath = "//*[@id='txt58790774']")
    private WebElement nameField;

    @FindBy(xpath = "//*[@id=\"txt58790799\"]")
    private WebElement emailField;


    @FindBy(xpath = "//*[contains(@class, 'ugc-button')]")
    private WebElement sendButton;

    @FindBy(xpath = "//*[contains(@class, 'ugc-form__error-message')]")
    private WebElement errorSubjectMissingMessage;

    @FindBy(xpath = "//*[contains(@class, 'ugc-form__error-message')]")
    private WebElement errorNameMissingPage;

    @FindBy(xpath = "//*[contains(@class, 'ugc-form__error-message')]")
    private WebElement errorEmailWrongFormatPage;


    public void enterTextToSubjectField(final String searchText){
        subjectField.sendKeys(searchText);

    }
    public void enterTextToCommentsField(final String searchText){
        commentsField.sendKeys(searchText);

    }
    public void enterTextToNameField(final String searchText){
        nameField.sendKeys(searchText);

    }
    public void enterTextToEmailField(final String searchText){
        emailField.sendKeys(searchText);

    }

    public void clickOnSendButton(){
        sendButton.click();
    }

    public boolean isSubjectErrorMessageVisible(){
        return errorSubjectMissingMessage.isDisplayed();
    }

    public boolean isNameErrorMessageVisible(){
        return errorNameMissingPage.isDisplayed();
    }

    public boolean isEmailWrongFormatErrorVisible(){
        return errorEmailWrongFormatPage.isDisplayed();
    }








}

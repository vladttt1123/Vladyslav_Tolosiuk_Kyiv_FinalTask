package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.security.auth.x500.X500Principal;

public class HomePage extends BasePage {



    /////////////////////////////////////////// LOREM IPSUM ///////////////
    @FindBy(xpath = "//a[text()='Pyccкий']")
    private WebElement russianLangButton;

    @FindBy(xpath = "//p[contains(text(), '- это текст-\"рыба\", часто используемый в печати и вэб-дизайне. Lorem Ipsum является стандартной \"рыбой\" для текстов на латинице с начала XVI века. В то время некий безымянный печатник создал большую коллекцию размеров и форм шрифтов, используя Lorem Ipsum для распечатки образцов. Lorem Ipsum не только успешно пережил без заметных изменений пять веков, но и перешагнул в электронный дизайн. Его популяризации в новое время послужили публикация листов Letraset с образцами Lorem Ipsum в 60-х годах и, в более недавнее время, программы электронной вёрстки типа Aldus PageMaker, в шаблонах которых используется Lorem Ipsum.')]")
    private WebElement firstParahraphInrusLang;

    @FindBy(xpath = "//*[@id='generate']")
    private WebElement generateLoremIpsum;

    @FindBy(xpath = "//*[@id=\"words\"]")
    private WebElement wordsOption;

    @FindBy(xpath = "//*[@id=\"amount\"]")
    private WebElement numberField;

    @FindBy(xpath = "//*[@id=\"bytes\"]")
    private WebElement bytesOption;

    @FindBy(xpath = "//*[@id=\"start\"]")
    private WebElement 	startwithLoremCheckBox;


    //////////////// BBC WEBSITE ///////////////
    @FindBy(xpath = "//*[contains(@class, 'orb-nav-pri-container')]//*[contains(@class, 'orb-nav-newsdotcom')]/a/span")
    private WebElement newsButton;


    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void openHomePage(String url) {
        driver.get(url);
    }




    /////////////////////////////////////////////////////////////////
    public void selectrusLanguage(){
        russianLangButton.click();
    }

    public WebElement getTextOfTheFirstParagraphInrusLang(){
        return firstParahraphInrusLang;
    }
    public String getIfWordFishAppears(){
        return getTextOfTheFirstParagraphInrusLang().getText();
    }

    public void clickGenerateLoremIpsum(){
        generateLoremIpsum.click();
    }

    public void clickOnWordsOPtion(){
        wordsOption.click();
    }
    public void clickBytesOption(){
        bytesOption.click();
    }

    public void clickOnStartWithLoreCheckBox(){
        startwithLoremCheckBox.click();
    }

    public void enterTextInNumberField(final String searchText){
        numberField.clear();
        numberField.sendKeys(searchText);
    }

    ///////////BBC ////////////
    public void clickOnNews (){
        newsButton.click();
    }



}

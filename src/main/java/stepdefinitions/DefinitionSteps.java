package stepdefinitions;


import com.sun.source.tree.AssertTree;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.github.bonigarcia.wdm.WebDriverManager;
import manager.PageFactoryManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.page.Page;
import pages.HomePage;
import pages.FeedPage;
import pages.NewsPage;
import pages.SearchPageBBC;
import pages.SubmitFormPage;

import static java.lang.Thread.sleep;
import static org.junit.Assert.*;

public class DefinitionSteps {
    private static final long DEFAULT_TIMEOUT = 10;


    WebDriver driver;
    HomePage homePage;
    NewsPage newsPage;
    FeedPage feedPage;
    SearchPageBBC bbcPage;
    SubmitFormPage submitFormPage;
    PageFactoryManager pageFactoryManager;



    @Before
    public void testsSetUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        pageFactoryManager = new PageFactoryManager(driver);
    }


    @After
    public void tearDown(){
        driver.close();
    }



    @Given("User opens {string} page")
    public void userOpensHomePagePage(final String url) {
        homePage = pageFactoryManager.getHomePage();
        homePage.openHomePage(url);

    }

//////////////////////////////////////////////////////////////////////////////////////////
    //////////////////////////////////////////////////////////////////////////////////////////
    //////////////////////////////////////////////////////////////////////////////////////////

    @And("User selects russian language")
    public void userSelectsRussianLanguage() {
        homePage = pageFactoryManager.getHomePage();
        homePage.selectrusLanguage();

    }

    @And("User checks that the text of the first paragraph contains word {string}")
    public void userChecksThatTheTextOfTheFirstParagraphContainsWordExpectedText(final String expectedText) {
       // homePage = pageFactoryManager.getHomePage();
       // String actualString = driver.findElement(By.xpath("//*[@id=\"Panes\"]/div[1]/p")).getText();
        String actualString = homePage.getIfWordFishAppears();
        assertTrue(actualString.contains(expectedText));


    }

    @And("User clicks on the button Generate Lorem Ipsum")
    public void userClicksOnTheButtonGenerateLoremIpsum() {
        homePage.clickGenerateLoremIpsum();
    }


    @And("User checks if the first paragraph starts with {string}")
    public void userChecksIfTheFirstParagraphStartsWithExpectedText(final String expectedText) {
        feedPage = pageFactoryManager.getFeedPage();
        String actualString = feedPage.getIfParagraphStartsFromExpectedText();
        assertTrue(actualString.startsWith(expectedText));

    }

    @And("User clicks on words")
    public void userClicksOnWords() {
        homePage.clickOnWordsOPtion();
    }

    @And("User enters number of words {string}")
    public void userEntersNumberOfWordsNumberOfWords(final String numberOfWords) {
        homePage.enterTextInNumberField(numberOfWords);

    }

    @And("User checks if actual number of characters generated is the same as it was specified {string}")
    public void userChecksIfActualNumberOfWordsGeneratedIsTheSameAsItWasSpecifiedExpectedText(final String expectedText) {
        feedPage = pageFactoryManager.getFeedPage();
        String actualString = feedPage.getIfGeneratedTextContainsExpectedText();
        assertTrue(actualString.contains(expectedText));
    }

    @And("User clicks on bytes")
    public void userClicksOnBytes() {
        homePage.clickBytesOption();
    }

    @And("User unchecks start with Lorem Ipsum checkbox")
    public void userUnchecksStartWithLoremIpsumCheckbox() {
        homePage.clickOnStartWithLoreCheckBox();
    }

    @And("User checks if the first paragraph does not start with {string}")
    public void userChecksIfTheFirstParagraphDoesNotStartWithExpectedText(final String expectedText) {

        feedPage = pageFactoryManager.getFeedPage();
        String actualString = feedPage.getIfParagraphStartsFromExpectedText();
        assertFalse(actualString.startsWith(expectedText));

    }

    @And("User clicks on News Button")
    public void userClicksOnNewsButton() {
        homePage = pageFactoryManager.getHomePage();
        homePage.clickOnNews();
    }

    @And("User checks if the name of the main article contains {string}")
    public void userChecksIfTheNameOfTheMainArticleContainsExpectedText(final String expectedText) {
        newsPage = pageFactoryManager.getNewsPage();
        String actualString = newsPage.getIfHeadLineContainsExpectedTezt();
        assertTrue(actualString.contains(expectedText));


    }

    @And("User checks first article title {string}")
    public void userChecksFirstArticleTitleArticleFirst(final String articleFirst) {
        newsPage = pageFactoryManager.getNewsPage();
        String actualString = newsPage.getIfTitleOfFirstArticleContainsExpText();
        assertTrue(actualString.contains(articleFirst));
    }

    @And("User checks for the secondNumber title {string}")
    public void userChecksForTheSecondNumberTitleArticleSecond(final String articleSecond) {
        newsPage = pageFactoryManager.getNewsPage();
        String actualString = newsPage.getIfTitleOfSecondArticleContainsExpText();
        assertTrue(actualString.contains(articleSecond));

    }

    @And("User checks third article title {string}")
    public void userChecksThirdArticleTitleArticleThird(final String articleThird) {
        newsPage = pageFactoryManager.getNewsPage();
        String actualString = newsPage.getIfTitleOfThirdArticleContainsExpText();
        assertTrue(actualString.contains(articleThird));
    }

    @And("User checks fourth article title {string}")
    public void userChecksFourthArticleTitleArticleFourth(final String articleFourth) {
        newsPage = pageFactoryManager.getNewsPage();
        String actualString = newsPage.getIfTitleOfFourthArticleContainsExpText();
        assertTrue(actualString.contains(articleFourth));
    }


    @And("User clicks on Search Icon")
    public void userClicksOnSearchIcon() {
        newsPage = pageFactoryManager.getNewsPage();
        newsPage.clickSearchButtonBBC();
    }


    @And("User enters  data {string}")
    public void userEntersDataTextToEnter(final String textToEnter) {
        bbcPage = pageFactoryManager.getSearchPageBBC();
        bbcPage.enterTextInSearch(textToEnter);

    }

    @And("User submits search request")
    public void userSubmitsSearchRequest() {
        bbcPage = pageFactoryManager.getSearchPageBBC();
        bbcPage.clickOnSearchIconBBC();


    }

    @And("User checks if the name of the first article contains stored data {string}")
    public void userChecksIfTheNameOfTheFirstArticleContainsStoredDataExpectedText(final String expectedText) {
        bbcPage = pageFactoryManager.getSearchPageBBC();
        String actualString = bbcPage.getIfTitleOfNewsContainsExpText();
        assertTrue(actualString.contains(expectedText));


    }

    @And("User clicks on CoronaVirus section")
    public void userClicksOnCoronaVirusSection() {
        newsPage = pageFactoryManager.getNewsPage();
        newsPage.clickOnCoronaVirus();

    }

    @And("User selects Your Coronavirus Stories")
    public void userSelectsYourCoronavirusStories() {
        newsPage = pageFactoryManager.getNewsPage();
        newsPage.clickOnYOurCoronaVirusStorie();
    }

    @And("User clicks on Contact BBC News")
    public void userClicksOnContactBBCNews() {
        newsPage = pageFactoryManager.getNewsPage();
        newsPage.clickOnContactBbcButton();
    }


    @And("User clicks  on Report Technical Issue")
    public void userClicksOnReportTechnicalIssue() {
        newsPage.clickOnReportTechnicalIssueButton();
    }

    @And("User enters Comments {string}")
    public void userEntersCommentsComments(final String comments) {
        submitFormPage = pageFactoryManager.getSubmitFormPage();
        submitFormPage.enterTextToCommentsField(comments);
    }


    @And("User enters name {string}")
    public void userEntersNameName(final String name) {
        submitFormPage = pageFactoryManager.getSubmitFormPage();
        submitFormPage.enterTextToNameField(name);
    }


    @And("User enters email {string}")
    public void userEntersEmailEmail(final String email) {
        submitFormPage.enterTextToEmailField(email);
    }

    @And("User clicks on Send")
    public void userClicksOnSend() {
        submitFormPage.clickOnSendButton();
    }

    @And("User checks if error message about missing information is displayed")
    public void userChecksIfErrorMessageAboutMissingInformationIsDisplayed() {
        assertTrue((submitFormPage.isSubjectErrorMessageVisible()));

    }

    @And("User enters Subject {string}")
    public void userEntersSubjectSubject(final String subject) {
        submitFormPage = pageFactoryManager.getSubmitFormPage();
        submitFormPage.enterTextToSubjectField(subject);
    }

    @And("User checks if error message about missing information name is displayed")
    public void userChecksIfErrorMessageAboutMissingInformationNameIsDisplayed() {
        assertTrue((submitFormPage.isNameErrorMessageVisible()));
    }

    @And("User checks if error message about invalid format email appears")
    public void userChecksIfErrorMessageAboutInvalidFormatEmailAppears() {
        assertTrue(submitFormPage.isEmailWrongFormatErrorVisible());
    }
}





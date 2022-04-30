package manager;

import org.openqa.selenium.WebDriver;
import pages.*;

public class PageFactoryManager {

    WebDriver driver;

    public PageFactoryManager(WebDriver driver) {
        this.driver = driver;
    }

    public HomePage getHomePage() {
        return new HomePage(driver);
    }


    public NewsPage getNewsPage() {
        return new NewsPage(driver);
    }


    public FeedPage getFeedPage() {
        return new FeedPage(driver);
    }



    public SearchPageBBC getSearchPageBBC(){ return new SearchPageBBC(driver);}

    public SubmitFormPage getSubmitFormPage(){return new SubmitFormPage(driver);}
}

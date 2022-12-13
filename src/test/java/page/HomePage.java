package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage extends AbstractPage {

    public static final String HOMEPAGE_URL = "https://www.alphaindustries.com/";

    static final By closeMessageButtonLocator = By.xpath("//div[@id='geCloseBtn']");

    static final By searchButtonLocator = By.xpath("//button[@class='mc_list_top mc_search']");
    static final By menPageButtonLocator = By.xpath("//a[@href='https://www.alphaindustries.com/collections/mens-shop-all']");

    public HomePage(WebDriver driver){
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

    public HomePage openPage(){
        driver.get(HOMEPAGE_URL);
        return this;
    }

    public HomePage CloseMessage() {
        WebElement closeMessage = new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIME_IN_SECONDS))
                .until(ExpectedConditions.elementToBeClickable(searchButtonLocator));
        closeMessage.click();
        logger.info("Close message about relocate");
        return this;
    }

    public SearchPage openSearch() {
        WebElement searchButton = new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIME_IN_SECONDS))
                .until(ExpectedConditions.elementToBeClickable(searchButtonLocator));
        searchButton.click();
        logger.info("Open search");
        return new SearchPage(driver);
    }
    
    public MenPage openMenPage() {
        WebElement menPageButton = new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIME_IN_SECONDS))
                .until(ExpectedConditions.elementToBeClickable(menPageButtonLocator));
        menPageButton.click();
        logger.info("Open men page");
        return new MenPage(driver);
    }
}

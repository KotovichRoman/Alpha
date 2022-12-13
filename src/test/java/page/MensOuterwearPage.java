package page;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MensOuterwearPage extends AbstractPage {

    static final By colorMenuButtonLocator = By.xpath("//div[@class='facets__wrapper']/details[1]/summary");
    static final By whiteColorElementLocator = By.xpath("//ul[@class=' facets__list list-unstyled no-js-hidden sd']/li[1]");

    static final By productTypeMenuButtonLocator = By.xpath("//summary[@class='facets__summary caption-large focus-offset'][3]");
    static final By outerwearProductTypeLocator = By.xpath("//li[@class='list-menu__item facets__item']");

    static final By sortByDropdownMenuLocator = By.xpath("//summary[@class='facets__summary caption-large focus-offset']");
    static final By priceLowToHeghElementLocator = By.xpath("//details[@id='Details-1-template--14449141219383__product-grid']");

    public MensOuterwearPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

    public MensOuterwearPage clickToColorFilter() {
        WebElement ColorMenuButton = new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIME_IN_SECONDS))
                .until(ExpectedConditions.elementToBeClickable(colorMenuButtonLocator));
        ColorMenuButton.click();
        logger.info("Open color filter");
        return this;
    }

    public MensOuterwearPage selectWhiteColor() {
        WebElement whiteColorElement = new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIME_IN_SECONDS))
                .until(ExpectedConditions.elementToBeClickable(whiteColorElementLocator));
        whiteColorElement.click();
        logger.info("Select white color");
        return this;
    }

    public MensOuterwearPage clickToProductTypeFilter() {
        WebElement productTypeMenuButton = new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIME_IN_SECONDS))
                .until(ExpectedConditions.elementToBeClickable(productTypeMenuButtonLocator));
        productTypeMenuButton.click();
        logger.info("Open product type filter");
        return this;
    }

    public MensOuterwearPage selectOuterwearProductType() {
        WebElement outerwearProductType = new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIME_IN_SECONDS))
                .until(ExpectedConditions.elementToBeClickable(outerwearProductTypeLocator));
        outerwearProductType.click();
        logger.info("Select outerwear product type");
        return this;
    }

    public MensOuterwearPage clickToSortByDropdownMenu() {
        WebElement sortByDropdownMenu = new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIME_IN_SECONDS))
                .until(ExpectedConditions.elementToBeClickable(sortByDropdownMenuLocator));
        sortByDropdownMenu.click();
        logger.info("Open sort dropdown menu");
        return this;
    }

    public MensOuterwearPage selectPriceLowToHighElement() {
        WebElement priceLowToHeghElement = new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIME_IN_SECONDS))
                .until(ExpectedConditions.elementToBeClickable(priceLowToHeghElementLocator));
        priceLowToHeghElement.click();
        logger.info("Select price, low to high element in dropdown menu");
        return this;
    }
}

package page;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MenPage extends AbstractPage {
    
    static final By selectOuterwearButtonLocator = By.xpath("//a[@href='https://www.alphaindustries.com/collections/mens-shop-all-outerwear']");

    public MenPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

    public MensOuterwearPage openMensOuterwearPage() {
        WebElement selectOuterwearButton = new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIME_IN_SECONDS))
                .until(ExpectedConditions.elementToBeClickable(selectOuterwearButtonLocator));
        selectOuterwearButton.click();
        logger.info("Open men's outerwear");
        return new MensOuterwearPage(driver);
    }
}

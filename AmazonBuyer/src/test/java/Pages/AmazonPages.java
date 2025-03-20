package Pages;

import Util.ElementHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazonPages {
    static WebDriver driver;
    static ElementHelper elementHelper;
    WebDriverWait wait;

    static By accept = By.id("sp-cc-accept");
    static By search = By.id("twotabsearchtextbox");
    static By searchButton = By.id("nav-search-submit-button");
    static By amazonFilter = By.cssSelector("span[class='s-navigation-icon-text aok-relative'] span[class='a-size-base a-color-base']");
    static By appleFilter = By.xpath("//span[@class='a-size-base a-color-base'][normalize-space()='Apple']");
    static By firstProduct = By.cssSelector("img[alt='Apple AirPods 4.Nesil ANC Kablosuz Kulaklık, Bluetooth Kulaklık, Aktif Gürültü Engelleme, Adaptif Ses, Şeffaf Mod, Kişisel...']");
    static By addCart = By.xpath("//input[@id='add-to-cart-button']");
    static By checkCart = By.xpath("//a[@href='/cart?ref_=sw_gtc']");
    static By checker = By.cssSelector("div[id='sc-active-09fb79c3-878d-4635-a6b5-566e98551e30'] span[class='a-truncate-cut']");
    public AmazonPages(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver,10);
        this.elementHelper = new ElementHelper(driver);
    }

    public static void HomePage() {
    }

    public static void acceptCookie() {
        elementHelper.click(accept);
    }

    public static void clickSearch() {
        elementHelper.click(search);
    }

    public static void writeProduct() {
        elementHelper.sendKey(search,"airpods");
        // elementHelper.findElement(search).sendKeys("airpods");

    }

    public static void searchButton() {
        elementHelper.click(searchButton);
    }

    public static void filterAmazon() {
        elementHelper.click(amazonFilter);

    }
    public static void filterApple() {
        elementHelper.click(appleFilter);

    }
    public static void firstProduct() {
        elementHelper.click(firstProduct);
    }
    public static void addCart() {
        elementHelper.click(addCart);
    }
    public static void checkCart() {
        elementHelper.click(checkCart);
    }
}


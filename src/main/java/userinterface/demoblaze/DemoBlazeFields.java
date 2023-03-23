package userinterface.demoblaze;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class DemoBlazeFields extends PageObject {

    public static final Target SIGN = Target.the("Sign in process").located(By.id("signin2"));
    public static final Target USER_NAME = Target.the("Username field").located(By.id("sign-username"));
    public static final Target PASSWORD = Target.the("Username field").located(By.id("sign-password"));
    public static final Target SIGN_IN = Target.the("Sign in button").located(By.xpath("//*[@id='signInModal']/div/div/div[3]/button[2]"));

    public static final Target USERNAME = Target.the("Username").located(By.id("loginusername"));
    public static final Target PASSWORD_PROFILE = Target.the("Password").located(By.id("loginpassword"));
    public static final Target LOG_IN = Target.the("Log In button").located(By.xpath("//*[@id='logInModal']/div/div/div[3]/button[2]"));
    public static final Target LOG = Target.the("Log In process").located(By.id("login2"));
    public static final Target LOG_OUT = Target.the("Log out button").located(By.id("logout2"));

    public static final Target CONFIRMATION = Target.the("Confirmation message").located(By.xpath("//button[contains(text(), 'OK')]"));
    public static final Target PHONES_MENU = Target.the("Phones Menu").located(By.xpath("//*[@id='itemc'][1]"));
    public static final Target PHONE_TO_SELECT = Target.the("Iphone selected").located(By.xpath("//*[@id='tbodyid']/div[5]/div/div/h4/a"));
    public static final Target PC_TO_SELECT = Target.the("Mackbook to select").located(By.xpath("//*[@id='tbodyid']/div[6]/div/div/h4/a"));
    public static final Target LAPTOPS = Target.the("Laptops menu").located(By.xpath("//*[@id='itemc'][2]"));
    public static final Target GO_TO_CART = Target.the("Go to cart button").located(By.id("cartur"));
    public static final Target PLACE_ORDER = Target.the("Place order button").located(By.xpath("//button[contains(text(), 'Place Order')]"));
    public static final Target NAME_FIELD = Target.the("Name field").located(By.id("name"));
    public static final Target COUNTRY_FIELD = Target.the("Country field").located(By.id("country"));
    public static final Target CITY_FIELD = Target.the("City field").located(By.id("city"));
    public static final Target CARD_FIELD = Target.the("Card number field").located(By.id("card"));
    public static final Target MONTH_FIELD = Target.the("Month field").located(By.id("month"));
    public static final Target YEAR_FIELD = Target.the("Year field").located(By.id("year"));
    public static final Target FINISH_ORDER = Target.the("Place order").located(By.xpath("//*[@id='orderModal']/div/div/div[3]/button[2]"));
    public static final Target ADD_ITEM = Target.the("Add item button").located(By.xpath("//*[@id='tbodyid']/div[2]/div/a"));

    public static final Target CONTACT = Target.the("Contact button").located(By.xpath("//a[contains(text(), 'Contact')]"));
    public static final Target EMAIL_FIELD= Target.the("Email field").located(By.id("recipient-email"));
    public static final Target NAME = Target.the("Name field").located(By.id("recipient-name"));
    public static final Target MESSAGE = Target.the("Message field").located(By.id("message-text"));
    public static final Target SEND = Target.the("Send button").located(By.xpath("//button[contains(text(), 'Send message')]"));

}

package userinterface.opencart;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class OpenCartFields extends PageObject {

    public static final Target FIRSTNAME = Target.the("First name field").located(By.id("input-firstname"));
    public static final Target LASTNAME = Target.the("Last name field").located(By.id("input-lastname"));
    public static final Target EMAIL = Target.the("E-mail field").located(By.id("input-email"));
    public static final Target PHONE = Target.the("Phone field").located(By.id("input-telephone"));
    public static final Target PASSWORD = Target.the("Password field").located(By.id("input-password"));
    public static final Target CONFIRM_PASSWORD = Target.the("Confirm password field").located(By.id("input-confirm"));
    public static final Target PRIVACY_POLICY = Target.the("Privacy policy checkbox").located(By.xpath("//*[@id='content']/form/div/div/input[1]"));
    public static final Target CONFIRM_REGISTER = Target.the("Message of successful registry").located(By.xpath("//*[@id='content']/form/div/div/input[2]"));
    public static final Target CONFIRM_MESSAGE_REGISTER = Target.the("Message of successful registry").located(By.xpath("//*[@id='content']/h1"));
    public static final Target ERROR_REGISTER = Target.the("Message of unsuccessful registry").located(By.xpath("//*[@id='account']/legend"));
    public static final Target MY_ACCOUNT = Target.the("My account button").located(By.xpath("//*[@id='top-links']/ul/li[2]/a"));
    public static final Target REGISTER = Target.the("Register button").located(By.xpath("//*[@id='top-links']/ul/li[2]/ul/li[1]/a"));

    public static final Target LOOKFOR_FIELD = Target.the("Search field").located(By.xpath("//*[@id='search']/input"));
    public static final Target ADD_ITEM = Target.the("Add to the cart").located(By.xpath("//*[@id='content']/div[3]/div/div/div[2]/div[2]/button[1]/i"));
    public static final Target CHECKOUT1 = Target.the("Checkout button").located(By.xpath("//div[@id=\"cart\"]"));
    public static final Target CHECKOUT = Target.the("Checkout button").located(By.xpath("//*[@id=\"cart\"]/ul/li[2]/div/p/a[2]/strong/i"));
    public static final Target CHECKOUT2 = Target.the("Checkout button").located(By.xpath("//*[@id='cart']/ul/li[2]/div/p/a[2]"));
    public static final Target CONTINUE = Target.the("Register account button").located(By.xpath("//*[@id='button-account']"));
    public static final Target FIRSTNAME_PURCHSE = Target.the("Firstname of the purchase").located(By.id("input-payment-firstname"));
    public static final Target LASTNAME_PURCHSE = Target.the("Lastname of the purchase").located(By.id("input-payment-lastname"));
    public static final Target EMAIL_PURCHASE = Target.the("Email of the purchase").located(By.id("input-payment-email"));
    public static final Target DELIVERY_ADDRESS = Target.the("").located(By.id("input-payment-address-1"));
    public static final Target PHONE_NUMBER= Target.the("Phone number").located(By.id("input-payment-telephone"));
    public static final Target CITY= Target.the("City").located(By.id("input-payment-city"));
    public static final Target POST_CODE= Target.the("Postcode").located(By.id("input-payment-postcode"));
    public static final Target PASSWORD_PAYMENT= Target.the("Password").located(By.id("input-payment-password"));
    public static final Target COUNTRY = Target.the("Country").located(By.id("input-payment-country"));
    public static final Target CONFIRM_PASSWORD_PAYMENT= Target.the("Confirm password").located(By.id("input-payment-confirm"));
    public static final Target REGION= Target.the("Region or State").located(By.id("input-payment-zone"));
    public static final Target PRIVACYANDPOLICIES = Target.the("Accepted").located(By.xpath("//*[@id='collapse-payment-address']/div/div[4]/div/input[1]"));
    public static final Target CONTINUE3= Target.the("Button of delivery details").located(By.id("button-shipping-address"));
    public static final Target CONTINUE2 = Target.the("Continue button").located(By.id("button-register"));
    public static final Target CONTINUE5 = Target.the("Continue place the order").located(By.id("button-payment-method"));
    public static final Target TEXAREA_COMMENT = Target.the("Continue of delivery Method").located(By.xpath("//*[@id='collapse-shipping-method']/div/p[4]/textarea"));
    public static final Target CONTINUE4 = Target.the("Continue of payment Method").located(By.id("button-shipping-method"));
    public static final Target PSYSICAL_PAYMENT= Target.the("Select pshysical paymrnt").located(By.xpath("//*[@id=\"collapse-payment-method\"]/div/div[2]/label"));
    public static final Target CONDITIONS = Target.the("Terms and coditions of payment Method").located(By.xpath("//*[@id='collapse-payment-method']/div/div[3]/div/input[1]"));
    public static final Target FINISH = Target.the("Finish the process").located(By.id("button-confirm"));
    public static final Target COMPLETED = Target.the("Confirmation of the order").located(By.xpath("//*[@id='content']/h1"));
    public static final Target CONTINUE6 = Target.the("Continue to delivery details").located(By.id("button-payment-address"));
    public static final Target LOG_IN = Target.the("Login button").located(By.id("button-login"));
    public static final Target CART = Target.the("Cart button").located(By.id("cart-total"));


    public static final Target START = Target.the("See more button").located(By.id("details-button"));
    public static final Target PROCEED = Target.the("").located(By.id("proceed-link"));

}

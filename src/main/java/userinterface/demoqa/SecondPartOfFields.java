package userinterface.demoqa;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;

public class SecondPartOfFields extends PageObject {

    public static final Target SELECT_VALUE_DIV = Target.the("").located(By.id("withOptGroup"));
    public static final Target SELECT_VALUE_INPUT = Target.the("").located(By.xpath("//*[@id='withOptGroup']/div/div/div/div/input"));
    public static final Target SELECT_ONE_DIV = Target.the("").located(By.id("selectOne"));
    public static final Target SELECT_ONE_INPUT = Target.the("").located(By.xpath("//*[@id='selectOne']/div/div/div/div/input"));
    public static final Target HOVER_5 = Target.the("").located(By.xpath("//a[contains(text(), 'Main Item 2')]"));
    public static final Target HOVER_6 = Target.the("").located(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/ul/li[2]/ul/li[3]/a"));
    public static final Target HOVER_7 = Target.the("").located(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/ul/li[2]/ul/li[3]/ul/li[2]/a"));
    public static final Target FRAME_1 = Target.the("").located(By.id("frame1"));
    public static final Target FRAME_2 = Target.the("").located(By.id("frame2"));


    public static final Target TEXT_BOX = Target.the("").located(By.xpath("//*[@id='item-0']/span[contains(text(), 'Text Box')]"));
    public static final Target CHECK_BOX = Target.the("").located(By.xpath("//*[@id='item-1']/span[contains(text(), 'Check Box')]"));
    public static final Target RADIO_BUTTON = Target.the("").located(By.xpath("//*[@id='item-2']/span[contains(text(), 'Radio Button')]"));
    public static final Target WEB_TABLES = Target.the("").located(By.xpath("//*[@id='item-3']/span[contains(text(), 'Web Tables')]"));
    public static final Target BUTTONS = Target.the("").located(By.xpath("//*[@id='item-4']/span[contains(text(), 'Buttons')]"));
    public static final Target LINKS = Target.the("").located(By.xpath("//*[@id='item-5']/span[contains(text(), 'Links')]"));
    public static final Target BROKEN_LINKS = Target.the("").located(By.xpath("//*[@id='item-6']/span[contains(text(), 'Broken Links - Images')]"));
    public static final Target UPLOAD_AND_DOWNLOAD = Target.the("").located(By.xpath("//*[@id='item-7']/span[contains(text(), 'Upload and Download')]"));
    public static final Target DYNAMIC_PROPERTIES = Target.the("").located(By.xpath("//*[@id='item-8']/span[contains(text(), 'Dynamic Properties')]"));

    public static final Target FULL_NAME = Target.the("").located(By.id("userName"));
    public static final Target PERMANENT_ADDRESS = Target.the("").located(By.id("permanentAddress"));
    public static final Target SUBMIT = Target.the("").located(By.id("submit"));

    public static final Target COLOR_CHANGE = Target.the("").located(By.id("colorChange"));
    public static final Target UPLOAD_FILE = Target.the("").located(By.xpath("//*[@id='uploadFile']"));
    public static final Target DOWNLOAD_BUTTON = Target.the("").located(By.id("downloadButton"));

    public static final Target DOUBLE_CLICK = Target.the("").located(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[1]/button"));
    public static final Target RIGHT_CLICK = Target.the("").located(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/button"));
    public static final Target CLICK_ME = Target.the("").located(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[3]/button"));

    public static final Target YES = Target.the("").located(By.xpath("//*[contains(text(), 'Yes')]"));
    public static final Target IMPRESSIVE = Target.the("").located(By.xpath("//*[contains(text(), 'Impressive')]"));

    public static final Target CREATED = Target.the("").located(By.xpath("//*[contains(text(), 'Created')]"));
    public static final Target NO_CONTENT = Target.the("").located(By.xpath("//*[contains(text(), 'No Content')]"));
    public static final Target MOVED = Target.the("").located(By.xpath("//*[contains(text(), 'Moved')]"));
    public static final Target BAD_REQUEST = Target.the("").located(By.xpath("//*[contains(text(), 'Bad Request')]"));
    public static final Target UNAUTHORIZED = Target.the("").located(By.xpath("//*[contains(text(), 'Unauthorized')]"));
    public static final Target FORBIDDEN = Target.the("").located(By.xpath("//*[contains(text(), 'Forbidden')]"));
    public static final Target NOT_FOUND = Target.the("").located(By.xpath("//*[contains(text(), 'Not Found')]"));
    public static final Target BROKEN = Target.the("").located(By.xpath("//*[contains(text(), 'Click Here for Broken Link')]"));
    public static final Target ADD_BUTTON = Target.the("").located(By.id("addNewRecordButton"));
    public static final Target AGE = Target.the("").located(By.id("age"));
    public static final Target SALARY = Target.the("").located(By.id("salary"));
    public static final Target DEPARTMENT = Target.the("").located(By.id("department"));
    public static final Target SEARCH_FIELD = Target.the("").located(By.id("searchBox"));
    public static final Target SAVE_BUTTON = Target.the("").located(By.id("submit"));

    public static final Target SEE_MORE = Target.the("").located(By.xpath("//*[@id='tree-node']/div/button[1]"));
    public static final Target LAST_MESSAGE = Target.the("").located(By.id("visibleAfter"));
    public static final Target PASSWORD = Target.the("").located(By.id("password"));
    public static final Target LOG_IN = Target.the("").located(By.id("login"));
    public static final Target NEW_USER = Target.the("").located(By.id("newUser"));

    public static final Target LOG_IN_MENU = Target.the("").located(By.xpath("//*[@id='item-0']/span[contains(text(), 'Login')]"));
    public static final Target REGISTER = Target.the("").located(By.id("register"));
    public static final Target BOOK_STORE = Target.the("").located(By.xpath("//*[@id='item-1']/span[contains(text(), 'Book Store')]"));
    public static final Target PROFILE = Target.the("").located(By.xpath("//*[@id='item-3']/span[contains(text(), 'Profile')]"));
    public static final Target BOOK_STORE_API = Target.the("").located(By.xpath("//*[@id='item-4']/span[contains(text(), 'Book Store API')]"));

    public static final Target FIRST_NAME = Target.the("").located(By.id("firstname"));
    public static final Target LAST_NAME = Target.the("").located(By.id("lastname"));
    public static final Target CAPTCHA = Target.the("").located(By.xpath("//*[@id=\"g-recaptcha\"]/div/div/iframe"));

    public static Target GO_STORE = Target.the("").located(By.id("gotoStore"));
    public static Target DELETE_ACCOUNT = Target.the("").located(By.xpath("//*[@id='submit' and contains(text(), 'Delete Account')]"));
    public static Target DELETE_ALL_BOOKS = Target.the("").located(By.xpath("//*[@id='submit' and contains(text(), 'Delete All Books')]"));
    public static Target LOG_OUT = Target.the("").located(By.xpath("//*[@id='submit' and contains(text(), 'Log out')]"));
    public static Target ADD_BOOKS = Target.the("").located(By.xpath("//*[contains(text(), 'Add To Your Collection')]"));
    public static Target BACK = Target.the("").located(By.xpath("//*[contains(text(), 'Back To Book Store')]"));
    public static Target DELETE_ALL = Target.the("").located(By.id("closeSmallModal-ok"));
    public static Target MICRO = Target.the("").located(By.xpath("//*[@id='tw-mic']/span[4]"));

}

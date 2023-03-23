package userinterface.demoqa;

import model.demoqa.DemoQAModel;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;

public class DemoQAFields extends PageObject {

    public static final Target START_BUTTON_1 = Target.the("Alerts, Frame & Windows").located(By.xpath("//div[@class='card-body']/h5[contains(text(), 'Alerts, Frame & Windows')]"));
    public static final Target FORMS_START = Target.the("Forms button").located(By.xpath("//div[@class='card-body']/h5[contains(text(), 'Forms')]"));
    public static final Target WIDGETS_START = Target.the("Forms button").located(By.xpath("//div[@class='card-body']/h5[contains(text(), 'Widgets')]"));
    public static final Target INTERACTIONS_START = Target.the("Forms button").located(By.xpath("//div[@class='card-body']/h5[contains(text(), 'Interactions')]"));
    public static final Target ELEMENTS_START = Target.the("Forms button").located(By.xpath("//div[@class='card-body']/h5[contains(text(), 'Elements')]"));
    public static final Target BOOK_START = Target.the("Forms button").located(By.xpath("//div[@class='card-body']/h5[contains(text(), 'Book Store Application')]"));

    public static final Target FORMS_START_2 = Target.the("Forms menu").located(By.xpath("//*[@id='item-0']/span[contains(text(), 'Practice Form')]"));
    public static final Target LAST_NAME = Target.the("").located(By.id("lastName"));
    public static final Target PHONE_NUMBER = Target.the("").located(By.id("userNumber"));
    public static final Target EMAIL = Target.the("").located(By.id("userEmail"));
    public static final Target DATE_OF_BIRTH = Target.the("").located(By.id("dateOfBirthInput"));
    public static final Target SUBJECTS= Target.the("").located(By.id("subjectsInput"));
    public static final Target FIRST_NAME = Target.the("").located(By.id("firstName"));
    public static final Target ADDRESS = Target.the("").located(By.id("currentAddress"));
    public static final Target SUBMIT = Target.the("").located(By.id("submit"));
    public static final Target HOBBIES_1 = Target.the("").located(By.xpath("//*[@id='hobbiesWrapper']/div[2]/div[1]/label"));
    public static final Target HOBBIES_2 = Target.the("").located(By.xpath("//*[@id='hobbiesWrapper']/div[2]/div[2]/label"));
    public static final Target HOBBIES_3 = Target.the("").located(By.xpath("//*[@id='hobbiesWrapper']/div[2]/div[3]/label"));
    public static final Target STATE_DIV = Target.the("").located(By.xpath("//*[@id='state']/div/div[1]"));
    public static final Target INPUT_STATE= Target.the("").located(By.id("react-select-3-input"));
    public static final Target CITY_DIV = Target.the("").located(By.xpath("//*[@id='stateCity-wrapper']/div[3]"));
    public static final Target INPUT_CITY= Target.the("").located(By.id("react-select-4-input"));
    public static final Target GENDER_FIELD = Target.the("").located(By.xpath("//*[@id='genterWrapper']/div[2]/div[1]/label"));
    public static final Target YEAR_DATAPICKER = Target.the("").located(By.xpath("//*[@id='dateOfBirth']/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[2]/select"));
    public static final Target MONTH_DATAPICKER = Target.the("").located(By.xpath("//*[@id='dateOfBirth']/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/select"));
    public static final Target DAY_DATAPICKER = Target.the("").located(By.xpath("//*[@id='dateOfBirth']/div[2]/div[2]/div/div/div[2]/div[2]/div[4]/div[5]"));



    public static final Target BROWSER_BUTTON= Target.the("Browser windows button").located(By.xpath("//*[@id='item-0']/span[contains(text(), 'Browser Windows')]"));
    public static final Target ALERTS_BUTTON= Target.the("Alerts button").located(By.xpath("//*[@id='item-1']/span[contains(text(), 'Alerts')]"));
    public static final Target FRAMES_BUTTON = Target.the("Frames button").located(By.xpath("//*[@id='item-2']/span[contains(text(), 'Frames')]"));
    public static final Target NESTED_FRAMES_BUTTON= Target.the("Nested frames button").located(By.xpath("//*[@id='item-3']/span[contains(text(), 'Nested Frames')]"));
    public static final Target MODAL_DIALOGS_BUTTON= Target.the("Modal Dialogs Button").located(By.xpath("//*[@id='item-4']/span[contains(text(), 'Modal Dialogs')]"));

    public static final Target NEW_MESSAGE = Target.the("New Window Message button").located(By.id("messageWindowButton"));
    public static final Target NEW_WINDOW= Target.the("New Window button").located(By.id("windowButton"));
    public static final Target NEW_TAB = Target.the("New Tab button").located(By.id("tabButton"));

    public static final Target ALERT_BUTTON= Target.the("Alert button").located(By.id("alertButton"));
    public static final Target TIME_ALERT= Target.the("Time alert button").located(By.id("timerAlertButton"));
    public static final Target CONFIRM_BUTTON= Target.the("Confirm button").located(By.id("confirmButton"));
    public static final Target PROMPT = Target.the("Prompt button").located(By.id("promtButton"));
    public static final Target SMALL_MODAL = Target.the("").located(By.id("showSmallModal"));
    public static final Target CLOSE_SMALL_MODAL = Target.the("").located(By.id("closeSmallModal"));
    public static final Target LARGE_MODAL = Target.the("").located(By.id("showLargeModal"));
    public static final Target CLOSE_LARGE_MODAL = Target.the("").located(By.id("closeLargeModal"));

    public static final Target ACCORDIAN = Target.the("").located(By.xpath("//*[@id='item-0']/span[contains(text(), 'Accordian')]"));
    public static final Target AUTO_COMPLETE = Target.the("").located(By.xpath("//*[@id='item-1']/span[contains(text(), 'Auto Complete')]"));
    public static final Target DATE_PICKER = Target.the("").located(By.xpath("//*[@id='item-2']/span[contains(text(), 'Date Picker')]"));
    public static final Target DATE_PICKER_INPUT = Target.the("").located(By.id("datePickerMonthYearInput"));
    public static final Target SLIDER = Target.the("").located(By.xpath("//*[@id='item-3']/span[contains(text(), 'Slider')]"));
    public static final Target PROGRESS_BAR = Target.the("").located(By.xpath("//*[@id='item-4']/span[contains(text(), 'Progress Bar')]"));
    public static final Target TABS = Target.the("").located(By.xpath("//*[@id='item-5']/span[contains(text(), 'Tabs')]"));
    public static final Target TOOL_TIPS = Target.the("").located(By.xpath("//*[@id='item-6']/span[contains(text(), 'Tool Tips')]"));
    public static final Target MENU = Target.the("").located(By.xpath("//*[@id='item-7']/span[contains(text(), 'Menu')]"));
    public static final Target SELECT_MENU = Target.the("").located(By.xpath("//*[@id='item-8']/span[contains(text(), 'Select Menu')]"));
    public static final Target ACCORDIAN_ONE = Target.the("").located(By.id("section1Heading"));
    public static final Target ACCORDIAN_TWO = Target.the("").located(By.id("section2Heading"));
    public static final Target ACCORDIAN_THREE = Target.the("").located(By.id("section3Heading"));
    public static final Target AUTO_COMPLETE_INPUT = Target.the("").located(By.id("autoCompleteMultipleInput"));
    public static final Target SINGLE_COLOR = Target.the("").located(By.id("autoCompleteSingleInput"));
    public static final Target MONTH_DATAPICKER_2 = Target.the("").located(By.xpath("//div/select[contains(text(), '')]"));
    public static final Target YEAR_DATAPICKER_2 = Target.the("").located(By.xpath("//div/select[@class='react-datepicker__year-select']"));
    public static final Target SLIDER_PICKER = Target.the("").located(By.xpath("//input[@type='range']"));
    public static final Target DATAPICKER_2= Target.the("").located(By.id("dateAndTimePickerInput"));
    public static final Target START = Target.the("").located(By.id("startStopButton"));
    public static final Target USE = Target.the("").located(By.xpath("//*[@id='tabsContainer']/nav/a[contains(text(), 'Use')]"));
    public static final Target WHAT = Target.the("").located(By.xpath("//*[@id='tabsContainer']/nav/a[contains(text(), 'What')]"));
    public static final Target ORIGIN = Target.the("").located(By.xpath("//*[@id='tabsContainer']/nav/a[contains(text(), 'Origin')]"));
    public static final Target HOVER_3 = Target.the("").located(By.xpath("//*[@id='texToolTopContainer']/a[1]"));
    public static final Target HOVER_4 = Target.the("").located(By.xpath("//*[@id='texToolTopContainer']/a[2]"));
    public static final Target HOVER_2 = Target.the("").located(By.id("toolTipTextField"));
    public static final Target HOVER_1= Target.the("").located(By.id("toolTipButton"));

    public static final Target OLD_SELECT = Target.the("").located(By.id("oldSelectMenu"));
    public static final Target MULTISELECT_DIV = Target.the("").located(By.xpath("//*[@id='selectMenuContainer']/div[7]/div/div/div"));
    public static final Target MULTISELECT_INPUT = Target.the("").located(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[7]/div/div/div/div[1]/div[2]/div/input"));
    public static final Target SELECT_CARS = Target.the("").located(By.id("cars"));
    public static final Target CONFIRMATION_MESSAGE = Target.the("").located(By.id("example-modal-sizes-title-lg"));

    public static final Target SORTABLE = Target.the("").located(By.xpath("//*[@id='item-0']/span[contains(text(), 'Sortable')]"));
    public static final Target SELECTABLE = Target.the("").located(By.xpath("//*[@id='item-1']/span[contains(text(), 'Selectable')]"));
    public static final Target RESIZABLE = Target.the("").located(By.xpath("//*[@id='item-2']/span[contains(text(), 'Resizable')]"));
    public static final Target DROPPABLE = Target.the("").located(By.xpath("//*[@id='item-3']/span[contains(text(), 'Droppable')]"));
    public static final Target DRAGGABLE = Target.the("").located(By.xpath("//*[@id='item-4']/span[contains(text(), 'Dragabble')]"));
    public static final Target DROPPAPLE_ITEM  = Target.the("").located(By.id("droppable"));

    public static final Target SIMPLE = Target.the("").located(By.id("draggableExample-tab-simple"));
    public static final Target AXIS_RESTRICTION = Target.the("").located(By.id("draggableExample-tab-axisRestriction"));
    public static final Target CONTAINER_RESTRICTION = Target.the("").located(By.id("draggableExample-tab-containerRestriction"));
    public static final Target CURSOR_STYLE = Target.the("").located(By.id("draggableExample-tab-cursorStyle"));


    public static final Target SIMPLE_DROPPABLE = Target.the("").located(By.id("droppableExample-tab-simple"));
    public static final Target ACCEPT = Target.the("").located(By.id("droppableExample-tab-accept"));
    public static final Target PREVENT_PROPOGATION = Target.the("").located(By.id("droppableExample-tab-preventPropogation"));
    public static final Target REVERTABLE = Target.the("").located(By.id("droppableExample-tab-revertable"));

    public static final Target LIST = Target.the("").located(By.id("demo-tab-list"));
    public static final Target GRID = Target.the("").located(By.id("demo-tab-grid"));
    public static final Target FINISHED= Target.the("").located(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[1]/span/div/div[1]/span"));

}

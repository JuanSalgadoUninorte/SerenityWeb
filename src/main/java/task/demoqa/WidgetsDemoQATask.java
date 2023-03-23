package task.demoqa;

import model.demoqa.DemoQAModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import userinterface.demoqa.DemoQAFields;
import userinterface.demoqa.SecondPartOfFields;

import java.awt.*;
import java.awt.event.KeyEvent;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class WidgetsDemoQATask implements Task {

    private DemoQAModel demoQAModel;

    public WidgetsDemoQATask(DemoQAModel demoQAModel) {
        this.demoQAModel = demoQAModel;
    }

    public static WidgetsDemoQATask fillOut(DemoQAModel demoQAModel) {
        return Tasks.instrumented(WidgetsDemoQATask.class, demoQAModel);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            for (int i = 0; i < 3; i++) {
                Robot robot = new Robot();
                robot.keyPress(KeyEvent.VK_CONTROL);
                robot.keyPress(KeyEvent.VK_SUBTRACT);
                robot.keyRelease(KeyEvent.VK_SUBTRACT);
                robot.keyRelease(KeyEvent.VK_CONTROL);
            }
        } catch (AWTException e) {
            e.printStackTrace();
        }
        WebDriver driver = getDriver();
        Actions action = new Actions(driver);
        actor.attemptsTo(
                WaitUntil.the(DemoQAFields.WIDGETS_START, isVisible()).forNoMoreThan(30).seconds(),
                Scroll.to(DemoQAFields.WIDGETS_START).then(Click.on(DemoQAFields.WIDGETS_START)),
                Scroll.to(DemoQAFields.ACCORDIAN),
                Click.on(DemoQAFields.ACCORDIAN),
                Click.on(DemoQAFields.ACCORDIAN_ONE),
                Click.on(DemoQAFields.ACCORDIAN_TWO),
                Click.on(DemoQAFields.ACCORDIAN_ONE),
                Scroll.to(DemoQAFields.ACCORDIAN_THREE),
                Click.on(DemoQAFields.ACCORDIAN_THREE),
                Scroll.to(DemoQAFields.AUTO_COMPLETE),
                Click.on(DemoQAFields.AUTO_COMPLETE),
                Enter.theValue(demoQAModel.getColorOne()).into(DemoQAFields.AUTO_COMPLETE_INPUT).thenHit(Keys.ENTER),
                Enter.theValue(demoQAModel.getColorTwo()).into(DemoQAFields.AUTO_COMPLETE_INPUT).thenHit(Keys.ENTER),
                Enter.theValue(demoQAModel.getSingleColor()).into(DemoQAFields.SINGLE_COLOR).thenHit(Keys.ENTER),
                Scroll.to(DemoQAFields.SLIDER),
                Click.on(DemoQAFields.DATE_PICKER),
                Click.on(DemoQAFields.DATE_PICKER_INPUT),
                SelectFromOptions.byVisibleText(demoQAModel.getMonth()).from(DemoQAFields.MONTH_DATAPICKER_2),
                SelectFromOptions.byVisibleText(demoQAModel.getYear()).from(DemoQAFields.YEAR_DATAPICKER_2),
                Click.on("//*[@class='react-datepicker__week']/div[contains(text(), '" + demoQAModel.getDay() + "')]"),
                Click.on(DemoQAFields.DATAPICKER_2),
                Scroll.to("//div/ul/li[@class='react-datepicker__time-list-item ' and contains(text(), '" + demoQAModel.getHour() + "')]").then(Click.on("//div/ul/li[@class='react-datepicker__time-list-item ' and contains(text(), '" + demoQAModel.getHour() + "')]")),
                Scroll.to(DemoQAFields.SLIDER).then(Click.on(DemoQAFields.SLIDER)));
        WebElement slider = driver.findElement(By.xpath("//*[@id=\"sliderContainer\"]/div[1]/span/input"));
        action.dragAndDropBy(slider, 260, 40).release().build().perform();
        actor.attemptsTo(
                Scroll.to(DemoQAFields.PROGRESS_BAR).then(Click.on(DemoQAFields.PROGRESS_BAR)),
                Click.on(DemoQAFields.START).afterWaitingUntilEnabled(),
                Scroll.to(DemoQAFields.TABS).then(Click.on(DemoQAFields.TABS)),
                Click.on(DemoQAFields.USE),
                Click.on(DemoQAFields.ORIGIN),
                Click.on(DemoQAFields.WHAT),
                Scroll.to(DemoQAFields.TOOL_TIPS).then(Click.on(DemoQAFields.TOOL_TIPS)),
                HoverOverBy.over(DemoQAFields.HOVER_1),
                HoverOverBy.over(DemoQAFields.HOVER_2),
                Scroll.to(DemoQAFields.HOVER_3).then(HoverOverBy.over(DemoQAFields.HOVER_3)),
                HoverOverBy.over(DemoQAFields.HOVER_4),
                Scroll.to(DemoQAFields.MENU).then(Click.on(DemoQAFields.MENU)),
                HoverOverBy.over(SecondPartOfFields.HOVER_5),
                HoverOverBy.over(SecondPartOfFields.HOVER_6),
                HoverOverBy.over(SecondPartOfFields.HOVER_7),
                Scroll.to(DemoQAFields.SELECT_MENU).then(Click.on(DemoQAFields.SELECT_MENU)),
                Click.on(SecondPartOfFields.SELECT_VALUE_DIV),
                Enter.theValue(demoQAModel.getSelectValue()).into(SecondPartOfFields.SELECT_VALUE_INPUT).thenHit(Keys.ENTER),
                Scroll.to(SecondPartOfFields.SELECT_ONE_DIV).then(Click.on(SecondPartOfFields.SELECT_ONE_DIV)),
                Enter.theValue(demoQAModel.getSelectOne()).into(SecondPartOfFields.SELECT_ONE_INPUT).thenHit(Keys.ENTER),
                Scroll.to(DemoQAFields.OLD_SELECT),
                SelectFromOptions.byVisibleText(demoQAModel.getOldMenu()).from(DemoQAFields.OLD_SELECT),
                Click.on(DemoQAFields.MULTISELECT_DIV),
                Enter.theValue(demoQAModel.getMultiColorOne()).into(DemoQAFields.MULTISELECT_INPUT).thenHit(Keys.ENTER),
                Enter.theValue(demoQAModel.getMultiColorTwo()).into(DemoQAFields.MULTISELECT_INPUT).thenHit(Keys.ENTER),
                Scroll.to(DemoQAFields.SELECT_CARS),
                SelectFromOptions.byVisibleText(demoQAModel.getStandard()).from(DemoQAFields.SELECT_CARS));

    }
}

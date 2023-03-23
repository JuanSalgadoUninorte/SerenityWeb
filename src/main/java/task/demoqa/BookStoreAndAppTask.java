package task.demoqa;

import model.demoqa.DemoQAModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.Switch;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.WebDriver;
import userinterface.demoqa.DemoQAFields;
import userinterface.demoqa.SecondPartOfFields;
import java.awt.*;
import java.awt.event.KeyEvent;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class BookStoreAndAppTask implements Task {

    private DemoQAModel demoQAModel;

    public BookStoreAndAppTask(DemoQAModel demoQAModel) {
        this.demoQAModel = demoQAModel;
    }

    public static BookStoreAndAppTask fillOut(DemoQAModel demoQAModel) {
        return Tasks.instrumented(BookStoreAndAppTask.class, demoQAModel);
    }

    public void waitFor() {
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        WebDriver driver = getDriver();
        try {
            for (int i = 0; i < 6; i++) {
                Robot robot = new Robot();
                robot.keyPress(KeyEvent.VK_CONTROL);
                robot.keyPress(KeyEvent.VK_SUBTRACT);
                robot.keyRelease(KeyEvent.VK_SUBTRACT);
                robot.keyRelease(KeyEvent.VK_CONTROL);
            }
        } catch (AWTException e) {
            e.printStackTrace();
        }
        actor.attemptsTo(
                Scroll.to(DemoQAFields.BOOK_START).then(Click.on(DemoQAFields.BOOK_START)),
                Scroll.to(SecondPartOfFields.LOG_IN_MENU).then(Click.on(SecondPartOfFields.LOG_IN_MENU)),
                Enter.theValue(demoQAModel.getUserName()).into(SecondPartOfFields.FULL_NAME),
                Scroll.to(SecondPartOfFields.PASSWORD).then(Enter.theValue(demoQAModel.getPassword()).into(SecondPartOfFields.PASSWORD)),
                Click.on(SecondPartOfFields.LOG_IN),
                Scroll.to(SecondPartOfFields.GO_STORE).then(Click.on(SecondPartOfFields.GO_STORE)),
                Enter.theValue(demoQAModel.getBookOne()).into(SecondPartOfFields.SEARCH_FIELD),
                Enter.theValue(demoQAModel.getBookTwo()).into(SecondPartOfFields.SEARCH_FIELD),
                Click.on("//*[contains(text(), '" + demoQAModel.getBookTwo() + "')]"),
                WaitUntil.the(SecondPartOfFields.ADD_BOOKS, isVisible()).forNoMoreThan(30).seconds().then(Click.on(SecondPartOfFields.ADD_BOOKS)));
        actor.attemptsTo(
                WaitUntil.the(SecondPartOfFields.BACK, isVisible()).forNoMoreThan(30).seconds().then(Click.on(SecondPartOfFields.BACK)));
        actor.attemptsTo(
                Scroll.to(SecondPartOfFields.PROFILE).then(Click.on(SecondPartOfFields.PROFILE)),
                Enter.theValue(demoQAModel.getBookOne()).into(SecondPartOfFields.SEARCH_FIELD));
        driver.navigate().refresh();
        actor.attemptsTo(
                Click.on(SecondPartOfFields.DELETE_ALL_BOOKS),
                Click.on(SecondPartOfFields.DELETE_ALL));
        waitFor();
        actor.attemptsTo(
                Switch.toAlert().andAccept(),
                Click.on(SecondPartOfFields.LOG_OUT),
                Scroll.to(SecondPartOfFields.LOG_IN_MENU).then(Click.on(SecondPartOfFields.LOG_IN_MENU)),
                Enter.theValue(demoQAModel.getUserName()).into(SecondPartOfFields.FULL_NAME),
                Scroll.to(SecondPartOfFields.PASSWORD).then(Enter.theValue(demoQAModel.getPassword()).into(SecondPartOfFields.PASSWORD)),
                Click.on(SecondPartOfFields.LOG_IN),
                Click.on(SecondPartOfFields.DELETE_ACCOUNT),
                Click.on(SecondPartOfFields.DELETE_ALL)
        );
        waitFor();
        actor.attemptsTo(
                Switch.toAlert().andAccept()
        );
        actor.attemptsTo(
                Scroll.to(SecondPartOfFields.BOOK_STORE_API).then(Click.on(SecondPartOfFields.BOOK_STORE_API))
        );
        waitFor();
        driver.navigate().back();
    }
}

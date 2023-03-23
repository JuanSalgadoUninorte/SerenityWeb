package task.demoqa;

import model.demoqa.DemoQAModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import userinterface.demoqa.DemoQAFields;
import userinterface.demoqa.SecondPartOfFields;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;


public class AlertsFramesAndWindowsTask implements Task {

    private DemoQAModel demoQAModel;

    public AlertsFramesAndWindowsTask(DemoQAModel demoQAModel) {
        this.demoQAModel = demoQAModel;
    }

    public static AlertsFramesAndWindowsTask enterInto(DemoQAModel demoQAModel) {
        return Tasks.instrumented(AlertsFramesAndWindowsTask.class, demoQAModel);
    }

    public void waitFor() {
        try {
            Thread.sleep(6500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(DemoQAFields.START_BUTTON_1, isVisible()).forNoMoreThan(10).seconds(),
                Scroll.to(DemoQAFields.START_BUTTON_1),
                Click.on(DemoQAFields.START_BUTTON_1),
                Scroll.to(DemoQAFields.BROWSER_BUTTON),
                Click.on(DemoQAFields.BROWSER_BUTTON),
                Scroll.to(DemoQAFields.NEW_TAB),
                Click.on(DemoQAFields.NEW_TAB),
                Switch.toNewWindow(),
                Switch.toTheOtherWindow(),
                Click.on(DemoQAFields.NEW_MESSAGE),
                Switch.toTheOtherWindow(),
                Switch.toTheOtherWindow(),
                Click.on(DemoQAFields.NEW_WINDOW),
                WaitUntil.the(DemoQAFields.NEW_WINDOW, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(DemoQAFields.ALERTS_BUTTON),
                Click.on(DemoQAFields.ALERT_BUTTON),
                Switch.toAlert().andAccept(),
                Scroll.to(DemoQAFields.PROMPT),
                Click.on(DemoQAFields.CONFIRM_BUTTON),
                Switch.toAlert().andAccept(),
                Click.on(DemoQAFields.CONFIRM_BUTTON),
                Switch.toAlert().andDismiss(),
                Scroll.to(DemoQAFields.PROMPT),
                Click.on(DemoQAFields.PROMPT)
        );
        WebDriver driver = getDriver();
        driver.switchTo().alert().sendKeys(demoQAModel.getPromptMessage());
        driver.switchTo().alert().accept();
        actor.attemptsTo(
                Click.on(DemoQAFields.TIME_ALERT)
        );
        waitFor();
        driver.switchTo().alert().accept();
        actor.attemptsTo(
                Click.on(DemoQAFields.FRAMES_BUTTON),
                Scroll.to(SecondPartOfFields.FRAME_1));
        driver.switchTo().frame("frame1");
        driver.switchTo().parentFrame();
        actor.attemptsTo(
                Scroll.to(SecondPartOfFields.FRAME_2)
        );
        driver.switchTo().frame("frame2");
        driver.switchTo().parentFrame();
        actor.attemptsTo(
                WaitUntil.the(DemoQAFields.NESTED_FRAMES_BUTTON, isVisible()).forNoMoreThan(20).seconds(),
                Scroll.to(DemoQAFields.NESTED_FRAMES_BUTTON),
                Click.on(DemoQAFields.NESTED_FRAMES_BUTTON)
        );
        WebElement frame1 = driver.findElement(By.id("frame1"));
        driver.switchTo().frame(frame1);
        WebElement frame1Element = driver.findElement(By.tagName("body"));
        String frame1Text = frame1Element.getText();
        driver.switchTo().frame(0);
        WebElement frame2Element = driver.findElement(By.tagName("p"));
        String frame2Text = frame2Element.getText();
        driver.switchTo().defaultContent();
        actor.attemptsTo(
                Scroll.to(DemoQAFields.MODAL_DIALOGS_BUTTON).then(Click.on(DemoQAFields.MODAL_DIALOGS_BUTTON)),
                Click.on(DemoQAFields.SMALL_MODAL),
                Click.on(DemoQAFields.CLOSE_SMALL_MODAL),
                Click.on(DemoQAFields.LARGE_MODAL),
                Click.on(DemoQAFields.CLOSE_LARGE_MODAL)
        );
    }
}

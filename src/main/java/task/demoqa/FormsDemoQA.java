package task.demoqa;

import model.demoqa.DemoQAModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.*;
import userinterface.demoqa.DemoQAFields;

import java.awt.*;
import java.awt.event.KeyEvent;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class FormsDemoQA implements Task {

    private DemoQAModel demoQAModel;

    public FormsDemoQA(DemoQAModel demoQAModel) {
        this.demoQAModel = demoQAModel;
    }

    public static FormsDemoQA fillOut(DemoQAModel demoQAFields) {
        return Tasks.instrumented(FormsDemoQA.class, demoQAFields);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(DemoQAFields.FORMS_START, isVisible()).forNoMoreThan(10).seconds());
        WebDriver driver = getDriver();
        actor.attemptsTo(
                WaitUntil.the(DemoQAFields.FORMS_START, isVisible()).forNoMoreThan(10).seconds(),
                Scroll.to(DemoQAFields.FORMS_START),
                Click.on(DemoQAFields.FORMS_START),
                Click.on(DemoQAFields.FORMS_START_2),
                Enter.theValue(demoQAModel.getFirstName()).into(DemoQAFields.FIRST_NAME),
                Enter.theValue(demoQAModel.getLastName()).into(DemoQAFields.LAST_NAME),
                Enter.theValue(demoQAModel.getEmail()).into(DemoQAFields.EMAIL),
                Scroll.to(DemoQAFields.HOBBIES_3),
                Click.on(DemoQAFields.GENDER_FIELD),
                Enter.theValue(demoQAModel.getSubject()).into(DemoQAFields.SUBJECTS).thenHit(Keys.ENTER),
                Scroll.to(DemoQAFields.HOBBIES_3),
                Click.on(DemoQAFields.HOBBIES_1),
                Click.on(DemoQAFields.HOBBIES_2),
                Click.on(DemoQAFields.HOBBIES_3),
                Clear.field(DemoQAFields.DATE_OF_BIRTH),
                SelectFromOptions.byVisibleText(demoQAModel.getMonth()).from(DemoQAFields.MONTH_DATAPICKER),
                SelectFromOptions.byVisibleText(demoQAModel.getYear()).from(DemoQAFields.YEAR_DATAPICKER));
        WebElement upload = driver.findElement(By.id("uploadPicture"));
        upload.sendKeys("C:\\Users\\jsalgadoa\\IdeaProjects\\SerenityWeb\\src\\test\\resources\\driver\\chromedriver.exe");
        actor.attemptsTo(
                Click.on(DemoQAFields.DAY_DATAPICKER),
                Enter.theValue(demoQAModel.getPhone()).into(DemoQAFields.PHONE_NUMBER),
                Scroll.to(DemoQAFields.CITY_DIV),
                Enter.theValue(demoQAModel.getAddress()).into(DemoQAFields.ADDRESS));
        try {
            Robot robot = new Robot();
            for(int i = 0; i < 5;i++){
                robot.keyPress(KeyEvent.VK_CONTROL);
                robot.keyPress(KeyEvent.VK_SUBTRACT);
                robot.keyRelease(KeyEvent.VK_SUBTRACT);
                robot.keyRelease(KeyEvent.VK_CONTROL);
            }
        } catch (AWTException e) {
            e.printStackTrace();
        }
        actor.attemptsTo(
                DoubleClick.on(DemoQAFields.STATE_DIV),
                Enter.theValue(demoQAModel.getState()).into(DemoQAFields.INPUT_STATE).thenHit(Keys.ENTER),
                Click.on(DemoQAFields.CITY_DIV),
                Enter.theValue(demoQAModel.getCity()).into(DemoQAFields.INPUT_CITY).thenHit(Keys.ENTER),
                Click.on(DemoQAFields.SUBMIT)
        );
    }
}

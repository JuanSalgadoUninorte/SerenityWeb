package task.demoqa;

import model.demoqa.DemoQAModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;

import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.*;
import userinterface.demoqa.DemoQAFields;
import userinterface.demoqa.SecondPartOfFields;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.List;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class ElementsDemoQA implements Task {

    private DemoQAModel demoQAModel;

    public ElementsDemoQA(DemoQAModel demoQAModel) {
        this.demoQAModel = demoQAModel;
    }

    public static ElementsDemoQA fillOut(DemoQAModel demoQAModel) {
        return Tasks.instrumented(ElementsDemoQA.class, demoQAModel);
    }

    public void waitFor() {
        try {
            Thread.sleep(2000);
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
                Scroll.to(DemoQAFields.ELEMENTS_START).then(Click.on(DemoQAFields.ELEMENTS_START)),
                Click.on(SecondPartOfFields.TEXT_BOX),
                Enter.theValue(demoQAModel.getFullName()).into(SecondPartOfFields.FULL_NAME),
                Enter.theValue(demoQAModel.getEmail()).into(DemoQAFields.EMAIL),
                Enter.theValue(demoQAModel.getAddress()).into(DemoQAFields.ADDRESS),
                Enter.theValue(demoQAModel.getPermanentAddress()).into(SecondPartOfFields.PERMANENT_ADDRESS),
                Scroll.to(SecondPartOfFields.SUBMIT).then(Click.on(SecondPartOfFields.SUBMIT)),
                Scroll.to(SecondPartOfFields.TEXT_BOX).then(Click.on(SecondPartOfFields.TEXT_BOX)),
                Scroll.to(SecondPartOfFields.CHECK_BOX).then(Click.on(SecondPartOfFields.CHECK_BOX)),
                Click.on(SecondPartOfFields.SEE_MORE));
        List<WebElement> lisLists = driver.findElements(By.xpath("//*[@class='rct-node-icon']"));
        for (int j = 0; j < lisLists.size(); j++) {
            lisLists.get(j).click();
        }
        actor.attemptsTo(
                Scroll.to(SecondPartOfFields.RADIO_BUTTON).then(Click.on(SecondPartOfFields.RADIO_BUTTON)),
                Click.on(SecondPartOfFields.YES),
                Click.on(SecondPartOfFields.IMPRESSIVE),
                Click.on(SecondPartOfFields.YES),
                Scroll.to(SecondPartOfFields.WEB_TABLES).then(Click.on(SecondPartOfFields.WEB_TABLES)),
                Enter.theValue(demoQAModel.getPersonOne()).into(SecondPartOfFields.SEARCH_FIELD));
        actor.attemptsTo(
                Clear.field(SecondPartOfFields.SEARCH_FIELD),
                Enter.theValue(demoQAModel.getPersonTwo()).into(SecondPartOfFields.SEARCH_FIELD));
        actor.attemptsTo(
                Clear.field(SecondPartOfFields.SEARCH_FIELD),
                Enter.theValue(demoQAModel.getPersonThree()).into(SecondPartOfFields.SEARCH_FIELD));
        actor.attemptsTo(
                Clear.field(SecondPartOfFields.SEARCH_FIELD),
                Click.on(SecondPartOfFields.ADD_BUTTON),
                Enter.theValue(demoQAModel.getFirstName()).into(DemoQAFields.FIRST_NAME),
                Enter.theValue(demoQAModel.getLastName()).into(DemoQAFields.LAST_NAME),
                Enter.theValue(demoQAModel.getEmail()).into(DemoQAFields.EMAIL),
                Enter.theValue(demoQAModel.getAge()).into(SecondPartOfFields.AGE),
                Enter.theValue(demoQAModel.getSalary()).into(SecondPartOfFields.SALARY),
                Enter.theValue(demoQAModel.getSecondDepartment()).into(SecondPartOfFields.DEPARTMENT),
                Click.on(SecondPartOfFields.SAVE_BUTTON));
        actor.attemptsTo(
                Enter.theValue(demoQAModel.getFirstName()).into(SecondPartOfFields.SEARCH_FIELD),
                Clear.field(SecondPartOfFields.SEARCH_FIELD));
        driver.navigate().refresh();
        lisLists = driver.findElements(By.xpath("//*[contains(@id, 'delete-record')]"));
        for (int j = 0; j < lisLists.size(); j++) {
            actor.attemptsTo(Click.on("//*[@id='delete-record-" + (j + 1) + "']"));
        }
        driver.navigate().refresh();
        lisLists = driver.findElements(By.xpath("//*[contains(@id, 'edit-record')]"));
        driver.switchTo().parentFrame();
        for (int j = 0; j < lisLists.size(); j++) {
            actor.attemptsTo(
                    Click.on("//*[@id='edit-record-" + (j + 1) + "']"),
                    Enter.theValue(demoQAModel.getFirstName()).into(DemoQAFields.FIRST_NAME),
                    Enter.theValue(demoQAModel.getLastName()).into(DemoQAFields.LAST_NAME),
                    Enter.theValue(demoQAModel.getEmail()).into(DemoQAFields.EMAIL),
                    Enter.theValue(demoQAModel.getAge()).into(SecondPartOfFields.AGE),
                    Enter.theValue(demoQAModel.getSalary()).into(SecondPartOfFields.SALARY),
                    Enter.theValue(demoQAModel.getSecondDepartment()).into(SecondPartOfFields.DEPARTMENT),
                    Click.on(SecondPartOfFields.SAVE_BUTTON));
            driver.switchTo().parentFrame();
        }
        actor.attemptsTo(
                Scroll.to(SecondPartOfFields.BUTTONS).then(Click.on(SecondPartOfFields.BUTTONS)),
                Scroll.to(SecondPartOfFields.CLICK_ME).then(Click.on(SecondPartOfFields.CLICK_ME)),
                DoubleClick.on(SecondPartOfFields.DOUBLE_CLICK),
                RightClick.on(SecondPartOfFields.RIGHT_CLICK));
        actor.attemptsTo(
                Scroll.to(SecondPartOfFields.LINKS).then(Click.on(SecondPartOfFields.LINKS)));
        String mainTab = driver.getWindowHandle();
        driver.findElement(By.xpath("//*[@id=\"simpleLink\"]")).click();
        waitFor();
        driver.switchTo().window(mainTab);
        driver.findElement(By.xpath("//*[@id=\"dynamicLink\"]")).click();
        waitFor();
        driver.switchTo().window(mainTab);
        actor.attemptsTo(
                Scroll.to(SecondPartOfFields.MOVED),
                Click.on(SecondPartOfFields.CREATED),
                Click.on(SecondPartOfFields.NO_CONTENT),
                Scroll.to(SecondPartOfFields.MOVED).then(Click.on(SecondPartOfFields.MOVED)),
                Scroll.to(SecondPartOfFields.BAD_REQUEST).then(Click.on(SecondPartOfFields.BAD_REQUEST)),
                Click.on(SecondPartOfFields.UNAUTHORIZED),
                Scroll.to(SecondPartOfFields.FORBIDDEN).then(Click.on(SecondPartOfFields.FORBIDDEN)),
                Click.on(SecondPartOfFields.NOT_FOUND),
                Scroll.to(SecondPartOfFields.BROKEN_LINKS).then(Click.on(SecondPartOfFields.BROKEN_LINKS)),
                Scroll.to(SecondPartOfFields.BROKEN));
        driver.findElement(By.xpath("//*[contains(text(), 'Click Here for Valid Link')]")).click();
        waitFor();
        driver.navigate().back();
        driver.switchTo().window(mainTab);
        driver.findElement(By.xpath("//*[contains(text(), 'Click Here for Broken Link')]")).click();
        waitFor();
        driver.navigate().back();
        driver.switchTo().window(mainTab);
        actor.attemptsTo(
                Scroll.to(SecondPartOfFields.UPLOAD_AND_DOWNLOAD).then(Click.on(SecondPartOfFields.UPLOAD_AND_DOWNLOAD)),
                Click.on(SecondPartOfFields.DOWNLOAD_BUTTON),
                Scroll.to(SecondPartOfFields.UPLOAD_FILE));
        WebElement upload = driver.findElement(By.xpath("//*[@id='uploadFile']"));
        upload.sendKeys("C:\\Users\\jsalgadoa\\IdeaProjects\\SerenityWeb\\src\\test\\resources\\driver\\chromedriver.exe");
        actor.attemptsTo(
                Scroll.to(SecondPartOfFields.DYNAMIC_PROPERTIES).then(Click.on(SecondPartOfFields.DYNAMIC_PROPERTIES)),
                Scroll.to(SecondPartOfFields.COLOR_CHANGE).then(Click.on(SecondPartOfFields.COLOR_CHANGE)),
                WaitUntil.the(SecondPartOfFields.LAST_MESSAGE, isVisible()).forNoMoreThan(30).seconds()
        );
    }
}

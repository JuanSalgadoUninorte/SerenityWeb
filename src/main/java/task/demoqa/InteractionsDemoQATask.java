package task.demoqa;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import userinterface.demoqa.DemoQAFields;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.List;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class InteractionsDemoQATask implements Task {

    public static InteractionsDemoQATask fillOut() {
        return Tasks.instrumented(InteractionsDemoQATask.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
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
        WebDriver driver = getDriver();
        Actions action = new Actions(driver);
        actor.attemptsTo(
                Scroll.to(DemoQAFields.INTERACTIONS_START),
                Scroll.to(DemoQAFields.INTERACTIONS_START).then(Click.on(DemoQAFields.INTERACTIONS_START)));
        actor.attemptsTo(
                Scroll.to(DemoQAFields.SORTABLE).then(Click.on(DemoQAFields.SORTABLE)),
                Click.on(DemoQAFields.LIST));
        List<WebElement> firstLisLists = driver.findElements(By.xpath("//*[@id='demo-tabpane-list']/div/div"));
        for (int l = 0; l < firstLisLists.size(); l++) {
            WebElement origin = firstLisLists.get(0);
            WebElement destiny = firstLisLists.get(5);
            action.clickAndHold(origin);
            action.moveToElement(destiny).release();
            action.build().perform();
        }
        actor.attemptsTo(
                WaitUntil.the(DemoQAFields.GRID, isVisible()).forNoMoreThan(30).seconds(),
                Click.on(DemoQAFields.GRID));
        List<WebElement> rowLists = driver.findElements(By.xpath("//*[@id=\"demo-tabpane-grid\"]/div/div/div"));
        for (int i = 0; i < rowLists.size(); i++) {
            WebElement origin = rowLists.get(0);
            WebElement destiny = rowLists.get(8);
            action.clickAndHold(origin);
            action.moveToElement(destiny).release();
            action.build().perform();
        }
        actor.attemptsTo(
                WaitUntil.the(DemoQAFields.SELECTABLE, isVisible()).forNoMoreThan(30).seconds(),
                Scroll.to(DemoQAFields.SELECTABLE).then(Click.on(DemoQAFields.SELECTABLE)),
                Click.on(DemoQAFields.LIST));
        List<WebElement> lisLists = driver.findElements(By.xpath("//*[@id='verticalListContainer']/li"));
        for (int j = 0; j < lisLists.size(); j++) {
            lisLists.get(j).click();
        }
        driver.switchTo().parentFrame();
        actor.attemptsTo(
                WaitUntil.the(DemoQAFields.GRID, isVisible()).forNoMoreThan(30).seconds(),
                Click.on(DemoQAFields.GRID));
        rowLists = driver.findElements(By.xpath("//div[@id='gridContainer']/div/li"));
        for (int i = 0; i < rowLists.size(); i++) {
            rowLists.get(i).click();
        }
        actor.attemptsTo(
                Scroll.to(DemoQAFields.RESIZABLE).then(Click.on(DemoQAFields.RESIZABLE)));
        WebElement resizable = driver.findElement(By.xpath("//div[@id='resizableBoxWithRestriction']/span[contains(@class, 'react-resizable-handle react-resizable-handle-se')]"));
        WebElement resizable2 = driver.findElement(By.xpath("//div[@id='resizable']/span[contains(@class, 'react-resizable-handle react-resizable-handle-se')]"));
        action.dragAndDropBy(resizable, 270, 36).build().perform();
        action.dragAndDropBy(resizable2, 270, 36).build().perform();
        actor.attemptsTo(
                WaitUntil.the(DemoQAFields.DROPPABLE, isVisible()).forNoMoreThan(20).seconds(),
                Scroll.to(DemoQAFields.DROPPABLE).then(Click.on(DemoQAFields.DROPPABLE)));
        WebElement from = driver.findElement(By.id("draggable"));
        WebElement to = driver.findElement(By.id("droppable"));
        action.dragAndDrop(from, to).build().perform();
        actor.attemptsTo(
                Scroll.to(DemoQAFields.DROPPAPLE_ITEM),
                Click.on(DemoQAFields.SIMPLE_DROPPABLE),
                Click.on(DemoQAFields.ACCEPT));
        WebElement to2 = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div/div[2]/div/div[2]"));
        WebElement acceptableButton = driver.findElement(By.xpath("//*[@id='acceptable']"));
        WebElement notAcceptableButton = driver.findElement(By.xpath("//*[@id='notAcceptable']"));
        action.dragAndDrop(notAcceptableButton, to2).build().perform();
        action.dragAndDrop(acceptableButton, to2).build().perform();
        actor.attemptsTo(
                WaitUntil.the(DemoQAFields.PREVENT_PROPOGATION, isVisible()).forNoMoreThan(30).seconds(),
                Click.on(DemoQAFields.PREVENT_PROPOGATION)
        );
        WebElement from2 = driver.findElement(By.id("dragBox"));
        WebElement one = driver.findElement(By.id("notGreedyDropBox"));
        WebElement innerOne = driver.findElement(By.id("notGreedyInnerDropBox"));
        WebElement two = driver.findElement(By.id("greedyDropBox"));
        WebElement innerTwo = driver.findElement(By.id("greedyDropBoxInner"));
        action.dragAndDrop(from2, one).build().perform();
        action.dragAndDrop(from2, innerOne).build().perform();
        action.dragAndDrop(from2, two).build().perform();
        action.dragAndDrop(from2, innerTwo).build().perform();
        actor.attemptsTo(
                WaitUntil.the(DemoQAFields.REVERTABLE, isVisible()).forNoMoreThan(30).seconds(),
                Click.on(DemoQAFields.REVERTABLE));
        WebElement revertable = driver.findElement(By.id("revertable"));
        WebElement nonRevertable = driver.findElement(By.id("notRevertable"));
        action.dragAndDropBy(revertable, 270, 20).build().perform();
        action.dragAndDropBy(nonRevertable, 270, 36).build().perform();
        actor.attemptsTo(
                Scroll.to(DemoQAFields.DRAGGABLE).then(Click.on(DemoQAFields.DRAGGABLE)),
                Click.on(DemoQAFields.SIMPLE));
        WebElement from3 = driver.findElement(By.id("dragBox"));
        action.dragAndDropBy(from3, 270, 20).build().perform();
        actor.attemptsTo(
                Click.on(DemoQAFields.AXIS_RESTRICTION));
        WebElement x = driver.findElement(By.id("restrictedX"));
        WebElement y = driver.findElement(By.id("restrictedY"));
        action.dragAndDropBy(x, 270, 0).build().perform();
        action.dragAndDropBy(y, 0, 60).build().perform();
        actor.attemptsTo(
                Click.on(DemoQAFields.CONTAINER_RESTRICTION));
        WebElement containedBox = driver.findElement(By.xpath("//*[@id='containmentWrapper']/div"));
        WebElement containedText = driver.findElement(By.xpath("//*[@id='draggableExample-tabpane-containerRestriction']/div[2]/span"));
        action.dragAndDropBy(containedBox, 190, 10).build().perform();
        actor.attemptsTo(Scroll.to("//*[@id='draggableExample-tabpane-containerRestriction']/div[2]/span"));
        action.dragAndDropBy(containedText, 0, 15).build().perform();
        actor.attemptsTo(
                Click.on(DemoQAFields.CURSOR_STYLE)
        );
        WebElement center = driver.findElement(By.id("cursorCenter"));
        WebElement botton = driver.findElement(By.id("cursorBottom"));
        WebElement left = driver.findElement(By.id("cursorTopLeft"));
        action.dragAndDropBy(center, 240, 10).build().perform();
        action.dragAndDropBy(botton, 200, 20).build().perform();
        action.dragAndDropBy(left, 180, 30).build().perform();
    }
}

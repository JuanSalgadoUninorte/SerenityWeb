package task.opencart;


import model.opencart.OpenCartModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;
import userinterface.opencart.OpenCartFields;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class PurchaseLoggedIn implements Task {

    private OpenCartModel openCartModel;

    public PurchaseLoggedIn(OpenCartModel openCartModel) {
        this.openCartModel = openCartModel;
    }

    public static PurchaseLoggedIn fillOutTheForm(OpenCartModel openCartModel) {
        return Tasks.instrumented(PurchaseLoggedIn.class, openCartModel);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(OpenCartFields.LOOKFOR_FIELD, isVisible()).forNoMoreThan(10).seconds(),
                Enter.theValue(openCartModel.getDeviceName1()).into(OpenCartFields.LOOKFOR_FIELD),
                Hit.the(Keys.ENTER).into(OpenCartFields.LOOKFOR_FIELD),
                Click.on(OpenCartFields.ADD_ITEM),
                Enter.theValue(openCartModel.getDeviceName2()).into(OpenCartFields.LOOKFOR_FIELD),
                Hit.the(Keys.ENTER).into(OpenCartFields.LOOKFOR_FIELD),
                Click.on(OpenCartFields.ADD_ITEM),
                WaitUntil.the(OpenCartFields.CHECKOUT1, isVisible()).forNoMoreThan(30).seconds(),
                Scroll.to(OpenCartFields.CHECKOUT1),
                WaitUntil.the(OpenCartFields.CHECKOUT1, isVisible()).forNoMoreThan(30).seconds(),
                Click.on(OpenCartFields.CHECKOUT1),
                WaitUntil.the(OpenCartFields.CHECKOUT, isVisible()).forNoMoreThan(30).seconds(),
                Click.on(OpenCartFields.CHECKOUT),
                Scroll.to(OpenCartFields.START).then(Click.on(OpenCartFields.START)),
                Scroll.to(OpenCartFields.PROCEED).then(Click.on(OpenCartFields.PROCEED)),
                Enter.theValue(openCartModel.getEmail()).into(OpenCartFields.EMAIL),
                Enter.theValue(openCartModel.getPassword()).into(OpenCartFields.PASSWORD),
                Click.on(OpenCartFields.LOG_IN),
                Scroll.to(OpenCartFields.CONTINUE6),
                Click.on(OpenCartFields.CONTINUE6),
                Click.on(OpenCartFields.CONTINUE3),
                Enter.theValue(openCartModel.getComment()).into(OpenCartFields.TEXAREA_COMMENT),
                Click.on(OpenCartFields.CONTINUE4),
                Click.on(OpenCartFields.PSYSICAL_PAYMENT),
                SetCheckbox.of(OpenCartFields.CONDITIONS).toTrue(),
                Scroll.to(OpenCartFields.CONTINUE5),
                Click.on(OpenCartFields.CONTINUE5),
                Click.on(OpenCartFields.FINISH),
                WaitUntil.the(OpenCartFields.COMPLETED, isVisible()).forNoMoreThan(30).seconds()
        );

    }
}

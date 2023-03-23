package task.opencart;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import userinterface.opencart.OpenCartFields;

public class AccessToRegister implements Task {

    public static AccessToRegister access(){
        return Tasks.instrumented(AccessToRegister.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(OpenCartFields.MY_ACCOUNT, WebElementStateMatchers.isVisible()).forNoMoreThan(10).seconds(),
                Click.on(OpenCartFields.MY_ACCOUNT),
                Click.on(OpenCartFields.REGISTER),
                Scroll.to(OpenCartFields.START).then(Click.on(OpenCartFields.START)),
                Scroll.to(OpenCartFields.PROCEED).then(Click.on(OpenCartFields.PROCEED))
        );

    }
}

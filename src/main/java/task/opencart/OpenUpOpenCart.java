package task.opencart;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import userinterface.opencart.OpenCartPage;

public class OpenUpOpenCart implements Task {

    private OpenCartPage openCartPage;

    public static OpenUpOpenCart thePage() {
        return Tasks.instrumented(OpenUpOpenCart.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(openCartPage));
    }
}

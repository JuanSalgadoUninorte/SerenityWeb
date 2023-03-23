package task.demoblaze;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import userinterface.demoblaze.DemoBlazePage;

public class OpenUpDemoBlaze implements Task {

    private DemoBlazePage demoBlazePage;

    public static OpenUpDemoBlaze thePage() {
        return Tasks.instrumented(OpenUpDemoBlaze.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(demoBlazePage));
    }
}

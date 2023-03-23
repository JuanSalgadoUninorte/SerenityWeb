package task.demoqa;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import userinterface.demoqa.DemoQAPage;

public class OpenUpDemoQA implements Task {

    private DemoQAPage demoQAPage;

    public static OpenUpDemoQA thePage() {
        return Tasks.instrumented(OpenUpDemoQA.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(demoQAPage));
    }
}

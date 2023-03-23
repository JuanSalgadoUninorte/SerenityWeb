package task.demoblaze;

import model.demoblaze.DemoBlazeModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import userinterface.demoblaze.DemoBlazeFields;



public class LogOut implements Task {

    private DemoBlazeModel demoBlazeModel;

    public LogOut(DemoBlazeModel demoBlazeModel) {
        this.demoBlazeModel = demoBlazeModel;
    }

    public static LogOut getOut(DemoBlazeModel demoBlazeModel) {
        return Tasks.instrumented(LogOut.class, demoBlazeModel);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(DemoBlazeFields.LOG_OUT, WebElementStateMatchers.isVisible()).forNoMoreThan(10).seconds(),
                Click.on(DemoBlazeFields.LOG_OUT)
        );
    }
}

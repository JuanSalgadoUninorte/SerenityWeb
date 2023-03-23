package task.demoblaze;

import model.demoblaze.DemoBlazeModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterface.demoblaze.DemoBlazeFields;

public class LogIn implements Task {

    private DemoBlazeModel demoBlazeModel;

    public LogIn(DemoBlazeModel demoBlazeModel) {
        this.demoBlazeModel = demoBlazeModel;
    }

    public static LogIn fillOut(DemoBlazeModel demoBlazeModel) {
        return Tasks.instrumented(LogIn.class, demoBlazeModel);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(DemoBlazeFields.LOG),
                Enter.theValue(demoBlazeModel.getUserName()).into(DemoBlazeFields.USERNAME),
                Enter.theValue(demoBlazeModel.getPassword()).into(DemoBlazeFields.PASSWORD_PROFILE),
                Click.on(DemoBlazeFields.LOG_IN)
        );
    }
}

package task.demoblaze;

import model.demoblaze.DemoBlazeModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterface.demoblaze.DemoBlazeFields;

public class CreateUser implements Task {

    private DemoBlazeModel demoBlazeModel;

    public CreateUser(DemoBlazeModel demoBlazeModel) {
        this.demoBlazeModel = demoBlazeModel;
    }

    public static CreateUser fillOut(DemoBlazeModel demoBlazeModel) {
        return Tasks.instrumented(CreateUser.class, demoBlazeModel);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(DemoBlazeFields.SIGN),
                Enter.theValue(demoBlazeModel.getUserName()).into(DemoBlazeFields.USER_NAME),
                Enter.theValue(demoBlazeModel.getPassword()).into(DemoBlazeFields.PASSWORD),
                Click.on(DemoBlazeFields.SIGN_IN)
        );
    }
}

package task.demoblaze;

import model.demoblaze.DemoBlazeModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import userinterface.demoblaze.DemoBlazeFields;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ContactUs implements Task {

    private DemoBlazeModel demoBlazeModel;

    public ContactUs(DemoBlazeModel demoBlazeModel) {
        this.demoBlazeModel = demoBlazeModel;
    }

    public static ContactUs fillOut(DemoBlazeModel demoBlazeModel) {
        return new ContactUs(demoBlazeModel);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(DemoBlazeFields.CONTACT, isVisible()).forNoMoreThan(30).seconds(),
                Click.on(DemoBlazeFields.CONTACT),
                Enter.theValue(demoBlazeModel.getContactEmail()).into(DemoBlazeFields.EMAIL_FIELD),
                Enter.theValue(demoBlazeModel.getContactName()).into(DemoBlazeFields.NAME),
                Enter.theValue(demoBlazeModel.getMessage2()).into(DemoBlazeFields.MESSAGE),
                Click.on(DemoBlazeFields.SEND)
        );

    }
}

package task.opencart;

import model.opencart.OpenCartModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.DoubleClick;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SetCheckbox;
import userinterface.opencart.OpenCartFields;

public class CreateUserOpenCart implements Task {

    private OpenCartModel openCartModel;

    public CreateUserOpenCart(OpenCartModel openCartModel) {
        this.openCartModel = openCartModel;
    }

    public static CreateUserOpenCart fillOut(OpenCartModel openCartModel) {
        return Tasks.instrumented(CreateUserOpenCart.class, openCartModel);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(openCartModel.getFirstName()).into(OpenCartFields.FIRSTNAME),
                Enter.theValue(openCartModel.getLastName()).into(OpenCartFields.LASTNAME),
                Enter.theValue(openCartModel.getEmail()).into(OpenCartFields.EMAIL),
                Enter.theValue(openCartModel.getPhone()).into(OpenCartFields.PHONE),
                Enter.theValue(openCartModel.getPassword()).into(OpenCartFields.PASSWORD),
                Enter.theValue(openCartModel.getPassword()).into(OpenCartFields.CONFIRM_PASSWORD),
                SetCheckbox.of(OpenCartFields.PRIVACY_POLICY).toTrue(),
                DoubleClick.on(OpenCartFields.CONFIRM_REGISTER)
        );
    }
}

package question.opencart;

import model.opencart.OpenCartModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;
import userinterface.opencart.OpenCartFields;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class AnswerCreateAccountWithErrors implements Question<Boolean> {

    private OpenCartModel openCartModel;

    public AnswerCreateAccountWithErrors(OpenCartModel openCartModel) {
        this.openCartModel = openCartModel;
    }

    public static AnswerCreateAccountWithErrors unsuccessful(OpenCartModel openCartModel) {
        return new AnswerCreateAccountWithErrors(openCartModel);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        actor.attemptsTo(WaitUntil.the(OpenCartFields.ERROR_REGISTER, isVisible()).forNoMoreThan(20).seconds());

        String messageMeeting = Text.of(OpenCartFields.ERROR_REGISTER).answeredBy(actor);
        String message = "Your Personal Details";
        return message.equals(messageMeeting);
    }

    @Override
    public String getSubject() {
        return Question.super.getSubject();
    }
}

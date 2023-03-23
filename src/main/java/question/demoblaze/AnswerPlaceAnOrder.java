package question.demoblaze;

import model.demoblaze.DemoBlazeModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;
import userinterface.demoblaze.DemoBlazeFields;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class AnswerPlaceAnOrder implements Question<Boolean> {

    private DemoBlazeModel demoBlazeModel;

    public AnswerPlaceAnOrder(DemoBlazeModel demoBlazeModel) {
        this.demoBlazeModel = demoBlazeModel;
    }

    public static AnswerPlaceAnOrder accomplished(DemoBlazeModel demoBlazeModel) {
        return new AnswerPlaceAnOrder(demoBlazeModel);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        actor.attemptsTo(
                WaitUntil.the(DemoBlazeFields.CONFIRMATION, isVisible()).forNoMoreThan(10).seconds()

        );
        String messageMeeting = Text.of(DemoBlazeFields.CONFIRMATION).answeredBy(actor);
        return demoBlazeModel.getConfirmation().equals(messageMeeting);
    }

    @Override
    public String getSubject() {
        return Question.super.getSubject();
    }
}

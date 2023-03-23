package question.demoblaze;

import model.demoblaze.DemoBlazeModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.HtmlAlert;
import net.serenitybdd.screenplay.actions.Switch;

public class AnswerContactUsDemoBlaze implements Question<Boolean> {

    private DemoBlazeModel demoBlazeModel;

    public AnswerContactUsDemoBlaze(DemoBlazeModel demoBlazeModel) {
        this.demoBlazeModel = demoBlazeModel;
    }

    public static AnswerContactUsDemoBlaze finished(DemoBlazeModel demoBlazeModel) {
        return new AnswerContactUsDemoBlaze(demoBlazeModel);
    }

    @Override
    public String getSubject() {
        return Question.super.getSubject();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        actor.attemptsTo(Switch.toAlert());
        String message = actor.asksFor(HtmlAlert.text().asString());
        return message.equals(demoBlazeModel.getConfirmation2());
    }
}

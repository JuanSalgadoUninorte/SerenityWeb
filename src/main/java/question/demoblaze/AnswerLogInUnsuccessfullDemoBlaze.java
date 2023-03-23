package question.demoblaze;

import model.demoblaze.DemoBlazeModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.HtmlAlert;
import net.serenitybdd.screenplay.actions.Switch;

public class AnswerLogInUnsuccessfullDemoBlaze implements Question<Boolean> {

    private DemoBlazeModel demoBlazeModel;

    public AnswerLogInUnsuccessfullDemoBlaze(DemoBlazeModel demoBlazeModel) {
        this.demoBlazeModel = demoBlazeModel;
    }

    public static AnswerLogInUnsuccessfullDemoBlaze unsuccessful(DemoBlazeModel demoBlazeModel) {
        return new AnswerLogInUnsuccessfullDemoBlaze(demoBlazeModel);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        actor.attemptsTo(Switch.toAlert());
        String message = actor.asksFor(HtmlAlert.text().asString());
        System.out.println(message);
        return message.equals("User does not exist.");
    }

    @Override
    public String getSubject() {
        return Question.super.getSubject();
    }
}

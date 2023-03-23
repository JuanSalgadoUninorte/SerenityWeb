package question.demoblaze;

import model.demoblaze.DemoBlazeModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.HtmlAlert;
import net.serenitybdd.screenplay.actions.Switch;

public class AnswerCreateAccountDemoBlaze implements Question<Boolean> {

    private DemoBlazeModel demoBlazeModel;

    public AnswerCreateAccountDemoBlaze(DemoBlazeModel demoBlazeModel) {
        this.demoBlazeModel = demoBlazeModel;
    }

    public static AnswerCreateAccountDemoBlaze successful(DemoBlazeModel demoBlazeModel) {
        return new AnswerCreateAccountDemoBlaze(demoBlazeModel);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        actor.attemptsTo(Switch.toAlert());
        String message = actor.asksFor(HtmlAlert.text().asString());
        System.out.println(message);
        return message.equals("Sign up successful.");
    }

    @Override
    public String getSubject() {
        return Question.super.getSubject();
    }
}

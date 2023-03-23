package question.demoblaze;

import model.demoblaze.DemoBlazeModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.HtmlAlert;
import net.serenitybdd.screenplay.actions.Switch;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;
import userinterface.demoblaze.DemoBlazeFields;
import userinterface.opencart.OpenCartFields;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class AnswerLogInLogOutDemoBlaze implements Question<Boolean> {

    private DemoBlazeModel demoBlazeModel;

    public AnswerLogInLogOutDemoBlaze(DemoBlazeModel demoBlazeModel) {
        this.demoBlazeModel = demoBlazeModel;
    }

    public static AnswerLogInLogOutDemoBlaze successful(DemoBlazeModel demoBlazeModel) {
        return new AnswerLogInLogOutDemoBlaze(demoBlazeModel);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        actor.attemptsTo(WaitUntil.the(DemoBlazeFields.LOG, isVisible()).forNoMoreThan(10).seconds());
        String welcomeMessage = Text.of(DemoBlazeFields.LOG).answeredBy(actor);
        System.out.println(welcomeMessage);
        return "Log in".equals(welcomeMessage);
    }

    @Override
    public String getSubject() {
        return Question.super.getSubject();
    }
}

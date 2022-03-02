package tasks;

import net.serenitybdd.screenplay.Actor;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import java.util.Set;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;
import static userinterfaces.BancolombiaPage.*;

public class LookFor implements Task {

    public static LookFor theReport() {
        return Tasks.instrumented(LookFor.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {


        actor.attemptsTo(Click.on(COMPANIES_LINK),
                Click.on(SMART_CAPITAL_LINK),
                SwitchToNewWindow.switchToNewTab(1),
                Click.on(ECONOMIC_NEWS_LINK),
                Click.on(VIEW_MORE_BUTTON),
                Click.on(VIEW_MORE_BUTTON),
                Click.on(VIEW_MORE_BUTTON),
                Click.on(REPORT_LINK),
                Click.on(PDF_LINK),
                SwitchToNewWindow.switchToNewTab(2)

        );
    }
}

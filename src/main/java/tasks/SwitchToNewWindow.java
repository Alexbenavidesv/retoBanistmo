package tasks;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.thucydides.core.annotations.Step;

import java.util.Set;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;
public class SwitchToNewWindow implements Task {
    private int indice;

    public SwitchToNewWindow(int indice) {
        this.indice = indice;
    }

    public static SwitchToNewWindow switchToNewTab(int indice){
        return Tasks.instrumented(SwitchToNewWindow.class,indice);
    }

    @Step("{0} Switching to new Window")
    public <T extends Actor> void performAs(T actor) {
        String currentWindow = getDriver().getWindowHandle();
        Set<String> allWindows = getDriver().getWindowHandles();
        int i=0;
        for(String window : allWindows){
            if(!window.contentEquals(currentWindow) && indice==i){
                getDriver().switchTo().window(window);
                break;
            }
            i++;
        }
    }
}

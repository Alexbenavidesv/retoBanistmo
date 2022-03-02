package stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import questions.PdfReport;
import tasks.LookFor;
import tasks.OpenUp;
import tasks.SwitchToNewWindow;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class StepDefinitionsBancolombiaReport {

   @Given("^that (.*) download the report called \"([^\"]*)\"$")
    public void thatAlexDownloadTheReportCalled(String actor,String report) {
        theActorCalled(actor).wasAbleTo(OpenUp.thePage());
    }

    @When("^he looks for the report on the page$")
    public void heLooksForTheReportOnThePage() {
        theActorInTheSpotlight().attemptsTo(LookFor.theReport());
    }

    @Then("^he finds and downloads the PDF report called (.*)")
    public void heFindsAndDownloadsThePDFReportCalledInformeSectorialPetroleoJunioPdf(String report) {
       theActorInTheSpotlight().should(GivenWhenThen.seeThat(PdfReport.called(report)));
    }
}

package questions;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import java.util.Arrays;

public class PdfReport implements Question<Boolean> {

    private String report;

    public PdfReport(String report) {
        this.report = report;
    }

    public static PdfReport called(String report) {
        return new PdfReport(report);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
       String url= Serenity.getWebdriverManager().getCurrentDriver().getCurrentUrl();
       String[] urlArray=url.split("/");
       String[] pdfName=urlArray[7].split("\\?(?!\\?)");

       return pdfName[0].equals(report);
    }
}


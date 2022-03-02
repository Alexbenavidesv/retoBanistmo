package userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://www.bancolombia.com/")
public class BancolombiaPage extends PageObject {
    public static final Target COMPANIES_LINK=Target.the("companies link")
            .located(By.id("header-empresas"));
    public static final Target SMART_CAPITAL_LINK=Target.the("smart capital link")
            .located(By.xpath("//a[contains(text(),'Capital Inteligente')]"));
    public static final Target ECONOMIC_NEWS_LINK=Target.the("economic news link")
            .located(By.xpath("//div[@id='bs-example-navbar-collapse-1']/ul/li[2]/a"));
    public static final Target VIEW_MORE_BUTTON=Target.the("View more button")
            .located(By.id("verMas"));
    public static final Target REPORT_LINK=Target.the("report link")
            .located(By.xpath("//div[@id='capital_inteligente']/div[1]/div[29]/div[2]/h2/a"));
    public static final Target PDF_LINK=Target.the("PDF link")
            .located(By.xpath("//a//img[@class='hidden-xs img-responsive']"));
    ////div//h2//a[contains(text(),'OPEP+ aumentará la oferta de petróleo en julio de 2021')]



}

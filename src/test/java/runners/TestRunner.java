package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty",
                "html:target/cucumber-reports.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml"
        },
        features = "src/test/resources/features",


        glue = "stepDefinitons",


        tags = "@ikisi",      //<=== Conflict olusmamasi icin her kullanimdan sonra tags kismi bos birakilmalidir

        dryRun = false
)
public class TestRunner {
     /*
    Bir framework 'de bir tek Runner class 'i yeterli olabilir
    Runner classindan class body'sinde hic bir sey olmaz
    Runner class' imizi onemli yapan 2 ader annotation vardir

    @RunWith(Cucumber.class) notasyonu Runner class ina calisma ozelligi katar
    Bu notasyon oldugu icin Cucumber framework'umuzda Junit kullanmayi tercih ediyoruz

    features : Runner dosyasinin feature dosyalarini nereden bulacafgini tarif eder
    glue : step definitions dosyalarini nerede bulacagmizi gosterir
    tag : o an hangi tag'i calistirmak istiyorsak onu belli eder

    dryRun : iki secenek var
    dryRun=true; yazdigimizda testimiz calistirmadan sadece eksik adimlari bize verir
    dryRun = false yazdigimizda testlerimizi calistirir
     */

}

package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SGridPage {
    public SGridPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

}

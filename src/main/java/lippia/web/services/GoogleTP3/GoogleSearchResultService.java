package lippia.web.services.GoogleTP3;

import com.crowdar.core.actions.ActionManager;

import lippia.web.constants.GoogleTP3.GoogleConstants;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class GoogleSearchResultService extends ActionManager {

    private static WebElement stats() {
        return getElement(GoogleConstants.STATS_ID);
    }

    public static String getStats() {
        return stats().getText();
    }

    public static void verifyResults(){
        Assert.assertFalse(getStats().isEmpty());
    }
}

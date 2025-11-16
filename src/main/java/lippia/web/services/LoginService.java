package lippia.web.services;

import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.ActionManager;
import lippia.web.constants.GoogleTP3.GoogleConstants;
import lippia.web.constants.Loginconstants;
import org.testng.Assert;

import static com.crowdar.core.actions.WebActionManager.navigateTo;

public class LoginService extends ActionManager {
    public static void navegarWeb(){
        navigateTo(PropertyManager.getProperty("web.base.url"));
    }
    public static void enterSearchCriteria(String text) {
        setInput(GoogleConstants.INPUT_SEARCH_XPATH, text);
    }

    public static void clickSearchButton() {
        click(GoogleConstants.SEARCH_BUTTON_NAME);
    }
    public static void completarUsuarioyContraseñainc(String usuario, String password) {
        setInput(Loginconstants.INPUT_USER_XPATH, usuario);
        setInput(Loginconstants.INPUT_PASSWORD_XPATH, password);
    }
    public static void completarUsuarioyContraseñaconparametros(String usuario, String password) {
        setInput(Loginconstants.INPUT_USER_XPATH, usuario);
        setInput(Loginconstants.INPUT_PASSWORD_XPATH, password);
    }

    public static void clickBotonLogin(){
        click(Loginconstants.BUTTON_LOGIN_XPATH);
    }

    public static void verificarMensajeerror() {
        Assert.assertTrue(getText(Loginconstants.BUTTON_ERROR_XPATH).contains("Epic sadface: Sorry, this user has been locked out."),"No se visualiza mensaje de error");
    }
}

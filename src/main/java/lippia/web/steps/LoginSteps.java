package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.LoginService;

public class LoginSteps extends PageSteps {
    @Given("^ingreso con el usuario (.*) y la password (.*)$")
    public void Login(String usuario, String password) {
        LoginService.navegarWeb();
        LoginService.completarUsuarioyContraseñaconparametros(usuario,password);
    }
    @When("^presiono boton login$")
    public void click() {
        LoginService.clickBotonLogin();
    }
    @Given("^ingreso el usuario incorrecto (.*) y la password (.*)$")
    public void ingresoConElUsuarioIncorrectoYLaPassword(String usuario, String password) {
        LoginService.navegarWeb();
        LoginService.completarUsuarioyContraseñainc(usuario, password);
    }
    @Then("visualizo mensaje de ingreso incorrecto")
    public void Mensajeerror() {
        LoginService.verificarMensajeerror();
    }


}

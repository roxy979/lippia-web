package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.InventoryService;


public class InventorySteps extends PageSteps {


    @And("^realizo click en el boton add to cart del producto (.*)$")
    public void realizoClicEnElBotonAddToCartDelProducto(String producto) {
        InventoryService.agregoproductoalcarrito(producto);
    }

    @And("^verifico que estoy en la homepage$")
    public void verificoQueEstoyEnLaHomepage() {

    }

    @And("^verifico que el contador del carrito tiene valor (.*)$")
    public void verificoQueElContadorDelCarritoTieneValor(String numero) {
        InventoryService.verificoContadorDelCarrito(numero);
    }

    @When("^realizo click en el boton remove del producto (.*)$")
    public void realizoClickEnElBotonRemoveDelProducto(String producto) {
        InventoryService.eliminoProductoDelCarrito(producto);
    }

    @Then("^verifico que carrito esta vacio$")
    public void verificoQueElContadorDelCarritoNoTieneProductos() {
        InventoryService.verificoCarritoVacio();
    }
}

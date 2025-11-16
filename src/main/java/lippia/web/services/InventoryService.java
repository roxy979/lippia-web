package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import lippia.web.constants.Inventoryconstants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class InventoryService extends ActionManager {
    public static void verificarHomePage() {
        waitPresence(Inventoryconstants.TITLE_PAGE_XPATH);
        Assert.assertTrue(getText(Inventoryconstants.TITLE_PAGE_XPATH).contains("Products"),"No se encontro el producto en la home page");
    }

    public static void agregoproductoalcarrito(String nombreProducto){
        String producto = nombreProducto.toLowerCase().replace(" ","-");
        waitPresence(Inventoryconstants.ADD_PRODUCT_XPATH.replace("%s",producto));
        click(Inventoryconstants.ADD_PRODUCT_XPATH.replace("%s",producto));
    }

    public static void verificoContadorDelCarrito(String numeroCantidad) {
        waitPresence(Inventoryconstants.CART_BADGE_PATH);
        Assert.assertEquals(getText(Inventoryconstants.CART_BADGE_PATH), numeroCantidad,"No se agrego el producto al carrito");
    }
    public static void eliminoProductoDelCarrito(String nombreProducto){
        String producto = nombreProducto.toLowerCase().replace(" ","-");
        waitPresence(Inventoryconstants.REMOVE_PRODUCT_XPATH.replace("%s",producto));
        click(Inventoryconstants.REMOVE_PRODUCT_XPATH.replace("%s",producto));
    }

    public static void verificoCarritoVacio() {
       Assert.assertFalse(isPresent(Inventoryconstants.CART_ITEMS_PATH),"El carrito tiene productos agregados");
    }

}

package definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageobjects.menuPage;


public class HistoriaCarritoCompraDefinition {
    menuPage menu;

    public HistoriaCarritoCompraDefinition() {
        menu = new menuPage(Hooks.driver);
    }

    @Given("validar que la web este disponible")
    public void validarQueLaWebEsteDisponible() {
        Hooks.driver.get("http://demo.guru99.com/payment-gateway/index.php");
    }

    @When("generar tarjeta valida")
    public void generarTarjetaValida() {
       menu.clickGenerarTarjeta();
    }

}

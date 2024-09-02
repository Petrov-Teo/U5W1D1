package Petrov.Todor.U4W5D1.pizze;

import Petrov.Todor.U4W5D1.pizze.enums.BasePizza;
import Petrov.Todor.U4W5D1.pizze.enums.DimensionePizza;
import Petrov.Todor.U4W5D1.pizze.enums.TipoImpasto;
import Petrov.Todor.U4W5D1.pizze.toppings.Toppings;

import java.util.List;

public class PizzaCrostino extends Pizza {
    public PizzaCrostino(String nome, DimensionePizza dimensionePizza, double prezzo, BasePizza base, List<String> ingredienti, List<Toppings> toppings, TipoImpasto tipoImpasto, boolean vegetariana) {
        super(nome, dimensionePizza, prezzo, base, ingredienti, toppings, tipoImpasto, vegetariana);
    }

    @Override
    public String getToppingName() {
        return "";
    }

    @Override
    public double getPrezzoAggiuntivo() {
        return 0;
    }
}

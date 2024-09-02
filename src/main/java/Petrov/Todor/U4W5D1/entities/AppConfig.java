package Petrov.Todor.U4W5D1.entities;

import Petrov.Todor.U4W5D1.pizze.PizzaCapricciosa;
import Petrov.Todor.U4W5D1.pizze.PizzaMargherita;
import Petrov.Todor.U4W5D1.pizze.PizzaPatate;
import Petrov.Todor.U4W5D1.pizze.PizzaQuattroFormaggi;
import Petrov.Todor.U4W5D1.pizze.enums.BasePizza;
import Petrov.Todor.U4W5D1.pizze.enums.DimensionePizza;
import Petrov.Todor.U4W5D1.pizze.enums.TipoImpasto;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class AppConfig {

    @Bean
    public PizzaMargherita margherita() {
        PizzaMargherita margherita =
                new PizzaMargherita(
                        "Margherita",
                        TipoImpasto.NORMALE,
                        BasePizza.ROSSA,
                        DimensionePizza.MEDIA,
                        List.of("Pomodoro", "Mozzarella", "Basilico"),
                        7.50,
                        false);
        return margherita;
    }

    @Bean
    PizzaCapricciosa capricciosa() {
        PizzaCapricciosa capricciosa =
                new PizzaCapricciosa(
                        "Capricciosa",
                        TipoImpasto.NORMALE,
                        BasePizza.ROSSA,
                        DimensionePizza.MEDIA,
                        List.of("mozzarella", "carciofi", "uova", "olive", "prosciutto crudo", "parmigiano"), 12.50, false);
        return capricciosa;
    }

    @Bean
    PizzaPatate patate() {
        PizzaPatate patate =
                new PizzaPatate(
                        List.of("patate", "mozzarella", "rosmarino"));
        return patate;
    }

    @Bean
    PizzaQuattroFormaggi quattroFormaggi() {
        PizzaQuattroFormaggi quattroFormaggi =
                new PizzaQuattroFormaggi(
                        "Quattro Formaggi",
                        TipoImpasto.NORMALE,
                        List.of("parmigiano", "gorgonzola", "mozzarella", "ricotta"));
        return quattroFormaggi;
    }

}

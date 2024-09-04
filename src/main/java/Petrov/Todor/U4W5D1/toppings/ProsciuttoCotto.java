package Petrov.Todor.U4W5D1.toppings;

import Petrov.Todor.U4W5D1.entities.Calorie;
import org.springframework.stereotype.Component;

@Component
public class ProsciuttoCotto implements Topping, Calorie {
    final private double prezzoAggiuntivo;
    double calorie;

    public ProsciuttoCotto() {
        this.prezzoAggiuntivo = 5;
        this.calorie = 200;
    }

    @Override
    public String toString() {
        return "ProsciuttoCotto{" +
                "prezzoAggiuntivo=" + prezzoAggiuntivo +
                ", calorie=" + calorie +
                '}';
    }

    @Override
    public String getNome() {
        return "Prosciutto Cotto";
    }

    @Override
    public double getPrezzoAggiuntivo() {
        return prezzoAggiuntivo;
    }


    @Override
    public double getCalorie() {
        return calorie;
    }
}

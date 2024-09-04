package Petrov.Todor.U4W5D1.toppings;

import Petrov.Todor.U4W5D1.entities.Calorie;
import org.springframework.stereotype.Component;

@Component
public class Formaggio implements Topping, Calorie {
    private final double prezzoAggiuntivo;
    private final double calorie;


    public Formaggio() {
        this.prezzoAggiuntivo = 2.50;
        this.calorie = 282;
    }

    @Override
    public String toString() {
        return "Formaggio{" +
                "prezzoAggiuntivo=" + prezzoAggiuntivo +
                ", calorie=" + calorie +
                '}';
    }

    @Override
    public String getNome() {
        return "Formaggio";
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

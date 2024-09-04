package Petrov.Todor.U4W5D1.toppings;

import Petrov.Todor.U4W5D1.entities.Calorie;
import org.springframework.stereotype.Component;

@Component
public class Mozzarella implements Topping, Calorie {
    private final double prezzoAggiuntivo;
    private final double calorie;

    public Mozzarella() {
        this.prezzoAggiuntivo = 3;
        this.calorie = 220;
    }

    @Override
    public String toString() {
        return "Mozzarella{" +
                "prezzoAggiuntivo=" + prezzoAggiuntivo +
                '}';
    }

    @Override
    public String getNome() {
        return "Mozzarella";
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

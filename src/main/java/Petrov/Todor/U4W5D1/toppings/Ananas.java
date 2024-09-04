package Petrov.Todor.U4W5D1.toppings;

import Petrov.Todor.U4W5D1.entities.Calorie;
import org.springframework.stereotype.Component;

@Component
public class Ananas implements Topping, Calorie {
    private final double prezzoAggiuntivo;
    private final double calorie;

    public Ananas() {
        this.prezzoAggiuntivo = 2.00;
        this.calorie = 80;
    }

    @Override
    public String toString() {
        return "Ananas{" +
                "prezzoAggiuntivo=" + prezzoAggiuntivo +
                ", calorie=" + calorie +
                '}';
    }

    @Override
    public String getNome() {
        return "Ananas";
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
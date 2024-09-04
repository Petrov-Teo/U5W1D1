package Petrov.Todor.U4W5D1.entities;

import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private List<Pizza> pizza;
    @Setter
    private List<Bevande> bevande;
    private double totale;
    @Setter
    private double totCalorie;

    public Menu(List<Pizza> pizza, List<Bevande> bevande) {
        this.pizza = pizza != null ? new ArrayList<>(pizza) : new ArrayList<>();
        this.bevande = bevande != null ? new ArrayList<>(bevande) : new ArrayList<>();
        this.totale = calcoloTotaleMenu();
        this.totCalorie = calcoloTotaleCalorie();
    }

    public List<Pizza> getPizza() {
        return pizza;
    }

    public void setPizza(List<Pizza> pizza) {
        this.pizza = pizza != null ? new ArrayList<>(pizza) : new ArrayList<>();
        this.totale = calcoloTotaleMenu();
        this.totCalorie = calcoloTotaleCalorie();
    }

    public List<Bevande> getBevande() {
        return bevande;
    }

    public double getTotale() {
        return totale;
    }

    public double getTotCalorie() {
        return totCalorie;
    }

    public void addPizza(Pizza pizza) {
        this.pizza.add(pizza);
        this.totale = calcoloTotaleMenu();
        this.totCalorie = calcoloTotaleCalorie();
    }

    public void removePizza(Pizza pizza) {
        if (pizza != null && this.pizza.contains(pizza)) {
            this.pizza.remove(pizza);
            this.totale = calcoloTotaleMenu();
            this.totCalorie = calcoloTotaleCalorie();
        }
    }

    public void addBevanda(Bevande bevanda) {
        this.bevande.add(bevanda);
        this.totale = calcoloTotaleMenu();
        this.totCalorie = calcoloTotaleCalorie();
    }

    public void removeBevanda(Bevande bevanda) {
        if (bevanda != null && this.bevande.contains(bevanda)) {
            this.bevande.remove(bevanda);
            this.totale = calcoloTotaleMenu();
            this.totCalorie = calcoloTotaleCalorie();
        }
    }

    private double calcoloTotaleMenu() {
        double totBevande = 0;
        double totPizze = 0;
        for (Bevande bevanda : bevande) {
            totBevande += bevanda.getPrezzo();
        }
        for (Pizza pizze : pizza) {
            totPizze += pizze.calcolaPrezzoTotale();
        }
        double totaleMenu = totPizze + totBevande;
        return totaleMenu;
    }

    private double calcoloTotaleCalorie() {
        double totCalorieBevande = 0;
        double totCaloriePizze = 0;
        for (Bevande bevanda : bevande) {
            totCalorieBevande += bevanda.getCalorie();
        }
        for (Pizza pizze : pizza) {
            totCaloriePizze += pizze.getCalorie();
        }
        return totCalorieBevande + totCaloriePizze;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "pizza=" + pizza +
                ", bevande=" + bevande +
                ", totale=" + "€" + " " + totale +
                ", totCalorie=" + totCalorie +
                '}';
    }
}
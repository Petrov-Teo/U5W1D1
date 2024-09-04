package Petrov.Todor.U4W5D1.entities;

import Petrov.Todor.U4W5D1.entities.enums.BasePizza;
import Petrov.Todor.U4W5D1.entities.enums.DimensionePizza;
import Petrov.Todor.U4W5D1.entities.enums.TipoImpasto;
import Petrov.Todor.U4W5D1.toppings.Topping;

import java.util.ArrayList;
import java.util.List;

public class Pizza {

    private String nome;
    private TipoImpasto tipoImpasto;
    private BasePizza base;
    private DimensionePizza dimensionePizza;
    private List<String> ingredienti;
    private List<Topping> toppings;
    private double prezzo;
    private double calorie;
    private boolean vegetariana;

    public Pizza(String nome, TipoImpasto tipoImpasto, BasePizza base, DimensionePizza dimensionePizza, List<String> ingredienti, List<Topping> toppings, double prezzo, boolean vegetariana, double calorie) {
        this.nome = nome;
        this.tipoImpasto = tipoImpasto;
        this.base = base;
        this.dimensionePizza = dimensionePizza;
        this.ingredienti = ingredienti != null ? ingredienti : new ArrayList<>();
        this.toppings = toppings != null ? new ArrayList<>(toppings) : new ArrayList<>();
        this.prezzo = prezzo;
        this.vegetariana = vegetariana;
        this.calorie = calorie;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "nome='" + nome + '\'' +
                ", tipoImpasto=" + tipoImpasto +
                ", base=" + base +
                ", dimensionePizza=" + dimensionePizza +
                ", ingredienti=" + ingredienti +
                ", toppings=" + toppings +
                ", prezzo=" + prezzo +
                ", calorie=" + calorie +
                ", vegetariana=" + vegetariana +
                '}';
    }

    public double getCalorie() {
        return calorie;
    }

    public void setCalorie(double calorie) {
        this.calorie = calorie;
    }

    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoImpasto getTipoImpasto() {
        return tipoImpasto;
    }

    public void setTipoImpasto(TipoImpasto tipoImpasto) {
        this.tipoImpasto = tipoImpasto;
    }

    public BasePizza getBase() {
        return base;
    }

    public void setBase(BasePizza base) {
        this.base = base;
    }

    public DimensionePizza getDimensionePizza() {
        return dimensionePizza;
    }

    public void setDimensionePizza(DimensionePizza dimensionePizza) {
        this.dimensionePizza = dimensionePizza;
    }

    public List<String> getIngredienti() {
        return ingredienti;
    }

    public void setIngredienti(List<String> ingredienti) {
        this.ingredienti = ingredienti;
    }

    public List<Topping> getToppings() {
        return toppings;
    }

    public void setToppings(List<Topping> toppings) {
        this.toppings = toppings;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public boolean isVegetariana() {
        return vegetariana;
    }

    public void setVegetariana(boolean vegetariana) {
        this.vegetariana = vegetariana;
    }

    public void addTopping(Topping topping) {
        toppings.add(topping);
    }


    public double calcolaPrezzoTotale() {
        double prezzoTotale = prezzo;
        for (Topping topping : toppings) {
            prezzoTotale += topping.getPrezzoAggiuntivo();
        }
        return prezzoTotale;
    }


}



package Petrov.Todor.U4W5D1.pizze;

import Petrov.Todor.U4W5D1.pizze.enums.BasePizza;
import Petrov.Todor.U4W5D1.pizze.enums.DimensionePizza;
import Petrov.Todor.U4W5D1.pizze.enums.TipoImpasto;
import Petrov.Todor.U4W5D1.pizze.toppings.Toppings;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza implements Toppings {
    private String nome;
    private TipoImpasto tipoImpasto;
    private BasePizza base;
    private DimensionePizza dimensionePizza;
    private List<String> ingredienti;
    private List<Toppings> toppings;
    private double prezzo;
    private boolean vegetariana;

    public Pizza(String nome, DimensionePizza dimensionePizza, double prezzo, BasePizza base, List<String> ingredienti, List<Toppings> toppings, TipoImpasto tipoImpasto, boolean vegetariana) {
        this.nome = nome;
        this.dimensionePizza = dimensionePizza;
        this.prezzo = prezzo;
        this.base = base;
        this.ingredienti = ingredienti;
        this.toppings = toppings != null ? toppings : new ArrayList<>();
        this.tipoImpasto = tipoImpasto;
        this.vegetariana = vegetariana;
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

    public List<Toppings> getToppings() {
        return toppings;
    }

    public void setToppings(List<Toppings> toppings) {
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

    @Override
    public String toString() {
        return "Pizza{" +
                "nome='" + nome + '\'' +
                ", tipoImpasto=" + tipoImpasto +
                ", base=" + base +
                ", dimensionePizza=" + dimensionePizza +
                ", ingredienti=" + ingredienti +
                ", prezzo=" + prezzo +
                ", vegetariana=" + vegetariana +
                '}';
    }

    public double calcolaPrezzoTotale() {
        double prezzoTotale = prezzo;
        for (Toppings topping : toppings) {
            prezzoTotale += topping.getPrezzoAggiuntivo();
        }
        return prezzoTotale;
    }
}



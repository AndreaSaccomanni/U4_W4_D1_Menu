package com.example.U4_W4_D1;

import java.util.List;

public class Menu {
    List<Pizza> pizze;
    List<Topping> toppings;
    List<Bibita> bibite;

    public Menu(List<Pizza> pizze, List<Topping> toppings, List<Bibita> bibite) {
        this.pizze = pizze;
        this.toppings = toppings;
        this.bibite = bibite;
    }

    public Menu() {
    }

    public List<Pizza> getPizze() {
        return pizze;
    }

    public void setPizze(List<Pizza> pizze) {
        this.pizze = pizze;
    }

    public List<Topping> getToppings() {
        return toppings;
    }

    public void setToppings(List<Topping> toppings) {
        this.toppings = toppings;
    }

    public List<Bibita> getBibite() {
        return bibite;
    }

    public void setBibite(List<Bibita> bibite) {
        this.bibite = bibite;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "pizze=" + pizze +
                ", toppings=" + toppings +
                ", bibite=" + bibite +
                '}';
    }
}

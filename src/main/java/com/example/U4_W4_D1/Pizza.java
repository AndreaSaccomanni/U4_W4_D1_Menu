package com.example.U4_W4_D1;


import java.util.List;

public class Pizza {

    private String nome;
    private double prezzo;
    private int calorie;
    private List<Topping> toppings;

    public Pizza() {
    }

    public Pizza(String nome, double prezzo, int calorie, List<Topping> toppings) {
        this.nome = nome;
        this.prezzo = prezzo;
        this.calorie = calorie;
        this.toppings = toppings;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public int getCalorie() {
        return calorie;
    }

    public void setCalorie(int calorie) {
        this.calorie = calorie;
    }


    public List<Topping> getToppings() {
        return toppings;
    }

    public void setToppings(List<Topping> toppings) {
        this.toppings = toppings;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "nome='" + nome + '\'' +
                ", prezzo=" + prezzo +
                ", calorie=" + calorie +
                ", toppings=" + toppings +
                '}';
    }
}

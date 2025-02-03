package com.example.U4_W4_D1;

public class Topping {

    private String nome;
    private double prezzo;
    private int calorie;

    public Topping(String nome, double prezzo, int calorie) {
        this.nome = nome;
        this.prezzo = prezzo;
        this.calorie = calorie;
    }

    public Topping() {
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

    @Override
    public String toString() {
        return "Topping{" +
                "nome='" + nome + '\'' +
                ", prezzo=" + prezzo +
                ", calorie=" + calorie +
                '}';
    }
}

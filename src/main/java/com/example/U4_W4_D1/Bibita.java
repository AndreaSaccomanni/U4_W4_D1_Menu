package com.example.U4_W4_D1;

public class Bibita {

    private String nome;
    private double prezzo;
    private int calorie;
    private double grandezza;


    public Bibita() {
    }

    public Bibita(String nome, double prezzo, int calorie, double grandezza) {
        this.nome = nome;
        this.prezzo = prezzo;
        this.calorie = calorie;
        this.grandezza = grandezza;
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

    public double getGrandezza() {
        return grandezza;
    }

    public void setGrandezza(double grandezza) {
        this.grandezza = grandezza;
    }

    @Override
    public String toString() {
        return "Bibita{" +
                "nome='" + nome + '\'' +
                ", prezzo=" + prezzo +
                ", calorie=" + calorie +
                ", grandezza=" + grandezza +
                '}';
    }
}

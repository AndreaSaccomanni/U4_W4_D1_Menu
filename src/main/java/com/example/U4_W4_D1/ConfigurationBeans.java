package com.example.U4_W4_D1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class ConfigurationBeans {


    //TOPPINGS

    @Bean
    @Scope("prototype")
    public Topping pomodoro() {
        return new Topping("pomodoro", 0, 50);
    }

    @Bean
    @Scope("prototype")
    public Topping mozzarella() {
        return new Topping("mozzarella", 0, 100);
    }

    @Bean
    @Scope("prototype")
    public Topping salsiccia() {
        return new Topping("salsiccia", 1, 100);
    }

    @Bean
    @Scope("prototype")
    public Topping prosciutto() {
        return new Topping("prosciutto", 2, 200);
    }

    @Bean
    @Scope("prototype")
    public Topping ananas() {
        return new Topping("ananas", 2, 100);
    }

    //TOPPING SPECIFICI PER PIZZE

    @Bean
    @Scope("prototype")
    public List<Topping> margheritaToppings(){
        List<Topping> toppings = new ArrayList<>();
        toppings.add(pomodoro());
        toppings.add(mozzarella());
        return toppings;
    }


    @Bean
    @Scope("prototype")
    public List<Topping> salsicciaToppings(){
        List<Topping> toppings = new ArrayList<>();
        toppings.add(pomodoro());
        toppings.add(mozzarella());
        toppings.add(salsiccia());

        return toppings;
    }


    @Bean
    @Scope("prototype")
    public List<Topping> hawaiiToppings(){
        List<Topping> toppings = new ArrayList<>();
        toppings.add(pomodoro());
        toppings.add(mozzarella());
        toppings.add(prosciutto());
        toppings.add(ananas());
        return toppings;
    }
    //PIZZE
    @Bean
    @Scope("prototype")
    public Pizza margherita (){
        return new Pizza("margherita", 7, 1000, margheritaToppings());
    }
    @Bean
    @Scope("prototype")
    public Pizza pizzaSalsiccia(){
        return new Pizza("salsiccia", 8, 1200, salsicciaToppings() );
    }

    @Bean
    @Scope("prototype")
    public Pizza pizzaHawaii(){
        return new Pizza("Hawaii", 12, 1400, hawaiiToppings() );
    }

    //BEVANDE

    @Bean
    @Scope("prototype")
    public Bibita acqua() {
        return new Bibita("Acqua", 1.00, 0, 0.5);
    }

    @Bean
    @Scope("prototype")
    public Bibita vino() {
        return new Bibita("Vino", 5.00, 150, 0.75);
    }

    @Bean
    @Scope("prototype")
    public Bibita birra() {
        return new Bibita("Birra", 4.50, 200, 0.5);
    }




}

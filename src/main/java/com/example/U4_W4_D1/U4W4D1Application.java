package com.example.U4_W4_D1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import java.util.ArrayList;
import java.util.List;

public class U4W4D1Application {

    public static void main(String[] args) {
        creaMenu();
    }

    private static void creaMenu() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigurationBeans.class);

        // Creazione lista pizze per comporre menu
        List<Pizza> pizze = new ArrayList<>();
        pizze.add(context.getBean("margherita", Pizza.class));
        pizze.add(context.getBean("pizzaSalsiccia", Pizza.class));
        pizze.add(context.getBean("pizzaHawaii", Pizza.class));

        // Creazione lista toppings per comporre menu
        List<Topping> toppings = new ArrayList<>();
        toppings.add(context.getBean("pomodoro", Topping.class));
        toppings.add(context.getBean("mozzarella", Topping.class));
        toppings.add(context.getBean("salsiccia", Topping.class));
        toppings.add(context.getBean("prosciutto", Topping.class));
        toppings.add(context.getBean("ananas", Topping.class));

        // Creazione lista bibite per comporre menu
        List<Bibita> bibite = new ArrayList<>();
        bibite.add(context.getBean("acqua", Bibita.class));
        bibite.add(context.getBean("vino", Bibita.class));
        bibite.add(context.getBean("birra", Bibita.class));

        // Creazione e stampa del menu
        Menu menu = new Menu(pizze, toppings, bibite);

        System.out.println("---- MENU ----");
        System.out.println("Pizze:");
        menu.getPizze().forEach(System.out::println);

        System.out.println("\nToppings:");
        menu.getToppings().forEach(System.out::println);

        System.out.println("\nBibite:");
        menu.getBibite().forEach(System.out::println);

        context.close();
    }
}

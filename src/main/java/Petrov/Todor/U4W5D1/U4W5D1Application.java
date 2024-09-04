package Petrov.Todor.U4W5D1;

import Petrov.Todor.U4W5D1.entities.*;
import Petrov.Todor.U4W5D1.toppings.Ananas;
import Petrov.Todor.U4W5D1.toppings.Formaggio;
import Petrov.Todor.U4W5D1.toppings.Mozzarella;
import Petrov.Todor.U4W5D1.toppings.ProsciuttoCotto;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

@SpringBootApplication
public class U4W5D1Application {


    public static void main(String[] args) {

        //___________________________// IMPORTANTISSIMO PER IL @COMPONENT SENZA CAUSA ERR \\__________________________\\
        SpringApplication.run(U4W5D1Application.class, args);


        //________// RICONRDARSI DI INSERIRE LA CLASSE CON ANNOTAZIONE @COMPONENT E/O @CONFIGURATION \\_______________\\

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                AppConfigPizze.class,
                AppConfigBevande.class,
                Ananas.class,
                Formaggio.class,
                Mozzarella.class,
                ProsciuttoCotto.class
        );

        //_______________________________________________// PIZZE \\__________________________________________________\\

        // ATTRAVERSO @CONFIGURATION \\
        Pizza margherita = (Pizza) context.getBean("margherita");
        Pizza capricciosa = (Pizza) context.getBean("capricciosa");

        //_____________________________________________ // BEVANDE \\ ________________________________________________\\

        // ATTRAVERSO @CONFIGURATION \\
        Bevande acqua = context.getBean("acquaLiscia", Bevande.class);
        Bevande cocaCola = context.getBean("cocaCola", Bevande.class);

        //____________________________________________ // TOPPINGS \\ ________________________________________________\\

        // ATTRAVERSO @COMPONENT \\
        Ananas ananas = context.getBean(Ananas.class);
        Formaggio formaggio = context.getBean(Formaggio.class);
        margherita.addTopping(formaggio);

        //_____________________________________________ // MENU \\ ___________________________________________________\\

        Menu menu = new Menu(List.of(margherita, capricciosa), List.of(cocaCola));
        System.out.println(menu);

        //__________________________________________ // TAVOLI \\ ____________________________________________________\\


        //______________________________________________ // ORDINI \\ ________________________________________________\\


    }
}


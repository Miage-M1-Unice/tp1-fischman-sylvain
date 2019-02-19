package miage.tp1.fileClass;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        File f = new File(".");
        Exercice1 ex1 = new Exercice1(f);

        System.out.println("------------1-------------\n");

        ex1.afficheListe1();
        ex1.afficheListe2();
        ex1.afficheListeFiltre();

        System.out.println("Parcours en profondeur");
        ex1.afficheParcoursProfondeur(".");


        System.out.println("\n------------2-------------\n");

        Path path = Paths.get(".");
        Exercice2 ex2 = new Exercice2(path);

    }
}

package miage.tp2;


/**
 * @version 1.00 23 Mars 2001
 * @author Michel Buffa
 * Inspiré par la classe Reflectiontest.java de
 * Cay S. Horstmann & Gary Cornell, publiée dans le livre Core Java, Sun Press
 */

import java.lang.reflect.*;
import java.io.*;

public class AnalyseurDeClasse {

    public static void analyseClasse(String nomClasse) throws ClassNotFoundException {
        // Récupération d'un objet de type Class correspondant au nom passé en paramètres
        Class cl =  Class.forName(nomClasse);

        afficheEnTeteClasse(cl);

        System.out.println();
        afficheAttributs(cl);

        System.out.println();
        afficheConstructeurs(cl);

        System.out.println();
        afficheMethodes(cl);

        // L'accolade fermante de fin de classe !
        System.out.println("}");
    }


    /** Retourne la classe dont le nom est passé en paramètre */
    public static Class getClasse(String nomClasse) throws ClassNotFoundException {
        return nomClasse.getClass();
    }

    /** Cette méthode affiche par ex "public class Toto extends Tata implements Titi, Tutu {" */
    public static void afficheEnTeteClasse(Class cl) {
        //  Affichage du modifier et du nom de la classe
        int n = cl.getModifiers();
        System.out.print(Modifier.toString(n) + " ");
        System.out.print(cl.getSimpleName());

        // Récupération de la superclasse si elle existe (null si cl est le type Object)
        Class supercl = cl.getSuperclass();

        // On ecrit le "extends " que si la superclasse est non nulle et
        // différente de Object
        if (supercl != null && Object.class != supercl) {
            System.out.print(" extends ");
            System.out.print(supercl.getSimpleName());



        }

        // Affichage des interfaces que la classe implemente
        Class[] interfaces = supercl.getInterfaces();
        if (interfaces != null){
            System.out.print(" implements ");

            for (int i = 0; i < interfaces.length; i++) {
                System.out.print(interfaces[i].getSimpleName());
                if (i != interfaces.length && interfaces.length != 1){
                    System.out.print(", ");
                }
            }

        }
        // Enfin, l'accolade ouvrante !
        System.out.print(" {\n");
    }

    public static void afficheAttributs(Class cl) {
        System.out.println("// Champs");
        Field[] attributs = cl.getFields();
        for (int i = 0; i < attributs.length; i++) {
            int n = attributs[i].getModifiers();
            System.out.print(Modifier.toString(n) + " ");
            System.out.print(attributs[i].getType() + " ");
            System.out.print(attributs[i].getName());
            if (i != attributs.length && attributs.length != 1){
                System.out.print(";\n");
            }
        }

    }

    public static void afficheConstructeurs(Class cl) {
        // CODE A ECRIRE
        System.out.println("{}");

    }


    public static void afficheMethodes(Class cl) {
        // CODE A ECRIRE
        System.out.println("{}");
    }


public static String litChaineAuClavier() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        return br.readLine();
        }

public static void main(String[] args) {
        boolean ok = false;

        while(!ok) {
        try {
        System.out.print("Entrez le nom d'une classe (ex : java.util.Date): ");
        String nomClasse = litChaineAuClavier();

        analyseClasse(nomClasse);

        ok = true;
        } catch(ClassNotFoundException e) {
        System.out.println("Classe non trouvée.");
        }catch(IOException e) {
        System.out.println("Erreur d'E/S!");
        }
        }
        }
        }



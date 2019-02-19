package miage.tp2;

public class Main {
    public static void main(String[] args) {

        Class cl = Main.class;
        // public, protected, private, final, static, abstract and interface
        System.out.println("Type = " + cl.getModifiers() );
        System.out.println("NOM = " + cl.getSimpleName() );
    }
}

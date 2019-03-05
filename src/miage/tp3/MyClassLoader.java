package miage.tp3;

import java.io.File;
import java.security.SecureClassLoader;
import java.util.ArrayList;

public class MyClassLoader extends SecureClassLoader {
    private ArrayList<File> path = null;
    public MyClassLoader(ArrayList<File> p) {
        this.path = p;
    }
    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        byte[] b = loadClassData(name);
        System.out.println("name = [ "+ name + " ]");
        return super.defineClass(name, b, 0, b.length);

    }

    private byte[] loadClassData(String name) throws ClassNotFoundException {
        // TODO  A COMPLETER
        // transformer le name en chemin .class
        //ouvrir le fichier et le lire
        //retourner le contenu
        name = name.replace(".","/"); // chercher pathseparator
        System.out.println(name);
        return null;
    }

    public static void main(String[] args) {
        ArrayList<File> al = new ArrayList<File>();
        al.add(new File("/home/sylvain/Documents/cours/M1/prog-avancee/tp/out/production/tp/"));
        MyClassLoader myCL = new MyClassLoader(al);
        try {
            myCL.loadClass("miage.tp1.Main");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
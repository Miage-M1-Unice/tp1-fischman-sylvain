package miage.tp3;


import java.net.URL;
import java.net.URLClassLoader;
import java.util.zip.ZipFile;

public class Main {
    public static void main(String[] args) throws Exception {

        // Getting the jar URL which contains target class
        URL[] classLoaderUrls = new URL[]{new URL("file:///home/sylvain/Documents/cours/M1/prog-avancee/tp/out/production/tp/")};
        URLClassLoader classLoader = new URLClassLoader(classLoaderUrls);
        classLoader.loadClass("miage.tp1.Main");

     //   ZipFile monzipFile = new File("file:///home/sylvain/Documents/cours/M1/prog-avancee/tp/out/production/tp/miage/tp1/Main.zip");


    }
}


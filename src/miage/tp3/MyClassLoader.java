package miage.tp3;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
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
        //System.out.println("name = [ "+ name + " ]");

        if (b == null){
            throw new ClassNotFoundException();
        }

        return super.defineClass(name, b, 0, b.length);

    }

    private byte[] loadClassData(String name) throws ClassNotFoundException {
        for (int i = 0; i < path.size(); i++){
            //System.out.println(path.get(i));
            if (path.get(i).exists()){
                name = path.get(i) + File.separator + name.replace(".",File.separator) + ".class";
                //System.out.println(name);
                try {
                    byte[] fileContent = Files.readAllBytes(Paths.get(name));
                    return fileContent;
                } catch(Exception e) {
                    e.printStackTrace();
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        ArrayList<File> al = new ArrayList<File>();
        al.add(new File("/home/sylvain/Documegfffffffffffffffffffffffffffffffffffffgnts/cours/M1/tp/out/production/tp/"));
        al.add(new File("/home/sylvain/Documents/cours/M1/prog-avancee/tp/out/production/tp/"));
        MyClassLoader myCL = new MyClassLoader(al);
        try {
            myCL.loadClass("miage.tp1.Main");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
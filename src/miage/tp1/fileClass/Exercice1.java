package miage.tp1.fileClass;
import java.io.File;
import java.io.FileFilter;

public class Exercice1 {
    private File f;

    public Exercice1(File f) {
        this.f = f;
    }

    public File getF() {
        return f;
    }

    public void setF(File f) {
        this.f = f;
    }

    public void afficheListe1(){
        String[] liste = f.list();

        System.out.println("En utilisant list :");

        for(String path:liste) {
            // prints filename and directory name
            System.out.println(path);
        }
    }

    public void afficheListe2(){
        File[] liste = f.listFiles();

        System.out.println("En utilisant listfile");

        for(File path:liste) {
            // prints filename and directory name
            System.out.println(path);
        }
    }

    public void afficheParcoursProfondeur(String str){
        File f = new File(str);
        File[] liste = f.listFiles();
        for(File path:liste) {
            if (path.isFile()){
                System.out.println(path);
            }
            else {
                afficheParcoursProfondeur(path.toString());
            }

        }
    }

    public void afficheListeFiltre(){
        FileFilter filter1 = new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.isFile();
            }
        };

        FileFilter filter2 = new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.isDirectory();
            }
        };

        File[] liste = f.listFiles(filter1);

        System.out.println("Uniquement les fichiers:");
        for(File path:liste) {

            // prints file and directory paths
            System.out.println(path);
        }

        liste = f.listFiles(filter2);

        System.out.println("Uniquement les dossiers:");
        for(File path:liste) {

            // prints file and directory paths
            System.out.println(path);
        }
    }

}

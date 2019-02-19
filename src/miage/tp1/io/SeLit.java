package miage.tp1.io;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SeLit {
    String lecture(Scanner source) {
        String res = "LU: \n";
        while(source.hasNextLine()) {
            String s = source.nextLine();
            if(s.trim().startsWith("//")) continue;
            else if(s.trim().startsWith("*")) continue;
            else if(s.trim().startsWith("/*")) continue;
            else if(s.trim().startsWith("*/")) continue;
            else if(s.contains("//")){
                s= s.split("//")[0];
            }

            res+=s+"\n";
        }
        return res;
    }

}
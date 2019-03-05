package miage.tp2;

import java.awt.*;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class GenericToString {

    private String toString(Object o) {
        Class cl = o.getClass();
        Field[] attributs = cl.getFields();
        String att = "";
        for (int i = 0; i < attributs.length; i++) {
            att += attributs[i].getType() + " ";
            att += attributs[i].getName();
            if (i != attributs.length && attributs.length != 1) {
                att += "; ";
            }
        }
        return cl.getName() + " [" + att + "]";
    }

    static public void main(String[] args) {

        System.out.println(new GenericToString().toString(new Point(12,24)));

        Polygon pol = new Polygon(new int[]{10, 20, 30}, new int[]{20,30, 40}, 3);
        pol.getBounds();
      //  System.out.println(new GenericToString().toString(pol, 2));
    }
    /*
    toString(obj o, int prof){
        if (prof == 0){
            return "";
        }
        ...
        toString(x,prof -1)
    } */


}

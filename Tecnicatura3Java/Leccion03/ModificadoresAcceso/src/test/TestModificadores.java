package test;

import paquete1.Clase1;
import paquete2.Clase3;

public class TestModificadores {
    public static void main(String[] args) {
        Clase1 clase1 = new Clase1();
        System.out.println("clase1 = " + clase1.atributoPublic);
        clase1.metodoPublic();
        Clase3 claseHija = new Clase3();
        System.out.println("claseHija = " + claseHija);
    }
}

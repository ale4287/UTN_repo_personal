package mundopc;

import ar.com.system2023.mundopc.*;

public class mundoPC {
    public static void main(String[] args) {
        Monitor monitorHP = new Monitor("HP", 13);//Importar la clase
        Teclado tecladoHP = new Teclado("Bluetooth", "HP");
        Raton ratonHP = new Raton("Bluetooth", "HP");
        Computadora computadoraHP = new Computadora("Computadora HP", monitorHP, tecladoHP, ratonHP);
        
        
        //Creamos otros objetos de diferente marca
        Monitor monitorGamer = new Monitor("Gamer", 32);
        Teclado tecladoGamer = new Teclado("Bluetooth", "Gamer");
        Raton ratonGamer = new Raton("Bluetooth", "Gamer");
        Computadora computadoraGamer = new Computadora("Computadora Gamer", monitorGamer, tecladoGamer, ratonGamer);
        Orden orden1 = new Orden();//Inicializamos el arreglo vacio
        Orden orden2 = new Orden();//Una nueva lista para el objeto orden2
        orden1.agregarComputadora(computadoraHP);
        orden1.agregarComputadora(computadoraGamer);
        
        Computadora computadorasVarias = new Computadora("Computadora de diferentes marcas", monitorHP, tecladoGamer, ratonHP);
        orden2.agregarComputadora(computadorasVarias);
        
        orden1.mostrarOrden();
        orden2.mostrarOrden();
        
        //Crear mas objetos de tipo computadora con todos sus elementos 
        //Completar una lista en el objeto de orden1 que llegue a los 10 elementos
        //probar de esta manera los metodos al maximo rendimiento
        Monitor monitorAcer = new Monitor("Acer", 13);//Importar la clase
        Teclado tecladoAcer = new Teclado("Bluetooth", "Acer");
        Raton ratonAcer = new Raton("Bluetooth", "Acer");
        Computadora computadoraAcer = new Computadora("Computadora Acer", monitorAcer, tecladoAcer, ratonAcer);
        
        //Perifericos Gamer
        Monitor monitorLG = new Monitor("Acer", 13);//Importar la clase
        Teclado tecladoHX = new Teclado("Bluetooth", "HX");
        Raton ratonLogitech = new Raton("Bluetooth", "logitech");
        
        Computadora computadoraJugador1 = new Computadora("Computadora jugador 1", monitorLG, tecladoHX, ratonLogitech);
        
        //jugador2
        Computadora computadoraJugador2 = new Computadora("Computadora jugador 2", monitorLG, tecladoHX, ratonLogitech);
        
        //jugador3
        Computadora computadoraJugador3 = new Computadora("Computadora jugador 3", monitorLG, tecladoHX, ratonLogitech);
        
        //jugador4
        Computadora computadoraJugador4 = new Computadora("Computadora jugador 4", monitorLG, tecladoHX, ratonLogitech);
        
        //jugador5
        Computadora computadoraJugador5 = new Computadora("Computadora jugador 5", monitorLG, tecladoHX, ratonLogitech);
        
        //jugador6
        Computadora computadoraJugador6 = new Computadora("Computadora jugador 6", monitorLG, tecladoHX, ratonLogitech);
        
        //jugador7
        Computadora computadoraJugador7 = new Computadora("Computadora jugador 7", monitorLG, tecladoHX, ratonLogitech);
        
        //jugador8
        Computadora computadoraJugador8 = new Computadora("Computadora jugador 8", monitorLG, tecladoHX, ratonLogitech);
        
        Orden orden3 = new Orden();
        orden3.agregarComputadora(computadoraAcer);
        orden3.mostrarOrden();
        
        //Agregamos mas computadoras a la orden 1 hasta superar el limite
        orden1.agregarComputadora(computadorasVarias);
        orden1.agregarComputadora(computadoraAcer);
        orden1.agregarComputadora(computadoraJugador1);
        orden1.agregarComputadora(computadoraJugador2);
        orden1.agregarComputadora(computadoraJugador3);
        orden1.agregarComputadora(computadoraJugador4);
        orden1.agregarComputadora(computadoraJugador5);
        orden1.agregarComputadora(computadoraJugador6);
        orden1.agregarComputadora(computadoraJugador7);
        orden1.agregarComputadora(computadoraJugador8);
        
        orden1.mostrarOrden();

    }
}

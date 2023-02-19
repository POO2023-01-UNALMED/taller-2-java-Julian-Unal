package test;

public class Asiento {

    String color;
    int precio;
    int registro;

    void cambiarColor(String color ) {
        if (validateColor(color)) {
            this.color = color;
        }
        System.out.println("Color not updated, invalid color");
    }

    boolean validateColor(String color) {
        if (color != "rojo" && color != "verde" && color !=  "amarillo" && color !=  "negro" && color !=  "blanco") {
            return false;
        }
        return true;
    }
}

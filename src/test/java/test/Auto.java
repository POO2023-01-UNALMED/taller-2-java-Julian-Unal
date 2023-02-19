package test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Auto {
    String modelo;
    int precio;
    Asiento[] asientos;
    String marca;
    Motor motor;
    int registro;
    int cantidadCreados;
    String verificarIntegridad() {
          if (validateRegistros()) {
                return "Auto original";
            }

            return "Las piezas no son originales";
    }

    boolean validateRegistros() {
        try {
            if (this.registro != this.motor.registro) {
                return false;
            }

            return  Arrays.stream(this.asientos).allMatch(asiento -> {
                if (asiento != null) {
                    return asiento.registro == this.registro;
                }
                return  true;
            });
            //if (numEqualRegisters == this.asientos.length) return true;
        } catch (Error err) {
            return false;
        }

    }

    int cantidadAsientos() {
        return Arrays.stream(this.asientos).filter(asiento -> asiento instanceof Asiento).collect(Collectors.toList()).size();
    }
}

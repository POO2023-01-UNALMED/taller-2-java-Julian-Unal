package test;

public class Motor {
    int numeroCilindros;
    String tipo;
    int registro;

    void  asignarTipo(String tipo) {
        if (validateTipo(tipo)) {
            this.tipo = tipo;
        }
        System.out.println("Tipo not updated, invalid tipo");
    }

    boolean validateTipo(String tipo) {
        if (tipo != "electrico" && tipo != "gasolina") {
            return false;
        }
        return true;
    }

    void cambiarRegistro(int registro) {
        this.registro = registro;
    }
}

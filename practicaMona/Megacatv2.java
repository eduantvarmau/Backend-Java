package practicaMona;

public class Megacatv2 extends MonaBase {
    String arma;
    boolean poderesEspeciales;

    public Megacatv2(boolean ropa, boolean cabello, String nombre, String actividad, int numero, String arma, boolean poderesEspeciales) {
        super(ropa, cabello, nombre, actividad, numero);
        this.arma = arma;
        this.poderesEspeciales = poderesEspeciales;
    }
    public void getInformacion() {
        System.out.println(this.getInfo() + "Arma: " + arma + " Poderes Especiales: " + poderesEspeciales);
    }
}

package practicaMona;

public class OctobiWanCatnobi  extends MonaBase{
    boolean poderesEspeciales;
    String bando;

    public OctobiWanCatnobi(boolean ropa, boolean cabello, String nombre, String actividad, int numero, boolean poderesEspeciales, String bando) {
        super(ropa, cabello, nombre, actividad, numero);
        this.poderesEspeciales = poderesEspeciales;
        this.bando = bando;
    }
    public void getInformacion() {
        System.out.println(this.getInfo() + "Poderes Especiales: " + poderesEspeciales + " Bando: " + bando);
    }
}

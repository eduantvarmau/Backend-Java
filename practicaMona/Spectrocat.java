package practicaMona;

public class Spectrocat extends MonaBase{
    String planoAstral;
    boolean cuerpo;
    String estado;

    public Spectrocat(boolean ropa, boolean cabello, String nombre, String actividad, int numero, String planoAstral, boolean cuerpo, String estado) {
        super(ropa, cabello, nombre, actividad, numero);
        this.planoAstral = planoAstral;
        this.cuerpo = cuerpo;
        this.estado = estado;
    }
    public void getInformacion() {
        System.out.println(this.getInfo() + "Plano astral: " + planoAstral + " ¿Tiene cuerpo?: " + cuerpo + " Estado: " + estado);
    }
}

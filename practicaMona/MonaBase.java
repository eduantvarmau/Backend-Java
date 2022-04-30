package practicaMona;

public class MonaBase {
  boolean ropa, cabello;
  String nombre, actividad;
  int numero;

    public MonaBase(boolean ropa, boolean cabello, String nombre, String actividad, int numero) {
        this.ropa = ropa;
        this.cabello = cabello;
        this.nombre = nombre;
        this.actividad = actividad;
        this.numero = numero;
    }
    public String getInfo(){
        return "Nombre: "+nombre+" Actividad: "+actividad+" Número: "+numero
                +" Cabello: "+cabello+" Ropa: "+ropa+" ";
    }

}//class

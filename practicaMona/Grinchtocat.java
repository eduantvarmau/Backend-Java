package practicaMona;

public class Grinchtocat extends MonaBase{
    String color;
    String item;
    String accesorio;

    public Grinchtocat(boolean ropa, boolean cabello, String nombre, String actividad, int numero, String color, String item, String accesorio) {
        super(ropa, cabello, nombre, actividad, numero);
        this.color = color;
        this.item = item;
        this.accesorio = accesorio;
    }

    public void getInformacion() {
        System.out.println(this.getInfo() + "Color: " + color + " Item: " + item + " Accesorio: " + accesorio);
    }
}

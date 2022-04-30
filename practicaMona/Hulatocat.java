package practicaMona;

public class Hulatocat extends MonaBase{

    String item;

    public Hulatocat(boolean ropa, boolean cabello, String nombre, String actividad, int numero, String item) {
        super(ropa, cabello, nombre, actividad, numero);
        this.item = item;
    }
    public void getInformacion() {
        System.out.println(this.getInfo() + "Item: " + item);
    }
}

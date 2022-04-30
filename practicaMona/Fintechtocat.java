package practicaMona;


public class Fintechtocat extends MonaBase {
        String accesorio;

        public Fintechtocat(boolean ropa, boolean cabello, String nombre, String actividad, int numero, String accesorio) {
            super(ropa, cabello, nombre, actividad, numero);
            this.accesorio = accesorio;
        }

        public void getInformacion() {
            System.out.println(this.getInfo() + "Accesorio: " + accesorio);
        }
}


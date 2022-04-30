package practicaHarry;

public class TestPersonaje {
    public static void main(String[] args) {
        Personaje one = new Personaje("Harry Potter", "Gryffindor","Masculino", "Lord Voldemort","Ciervo");
        one.getInfo();
        Personaje two = new Personaje("Albus Dumbledore", "Gryffindor","Masculino", "Ariana","Fénix");
        two .getInfo();
        Personaje three = new Personaje("Severus Snape", "Slytherin","Masculino", "Lord Voldemort","Cierva");
        three.getInfo();
        Personaje four = new Personaje("Sirius Black", "Gryffindor","Masculino", "Desconocido","Perro");
        four.getInfo();
        Personaje five = new Personaje("Alastor Moody", "Desconocida","Masculino", "Desconocido","Ave Rapaz");
        five.getInfo();


    }//main

}//class

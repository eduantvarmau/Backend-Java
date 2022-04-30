package practicaHarry;

public class Personaje {
    String name, house, gender, boggart, patronus;

    public Personaje(String name, String house, String gender, String boggart, String patronus) {
        this.name = name;
        this.house = house;
        this.gender = gender;
        this.boggart = boggart;
        this.patronus = patronus;
    }//constructor
    public void getInfo(){
        System.out.println("El nombre del personaje es: "+name+ ", pertenece a la casa: "+house+", su genero es: "+gender+
                ", su boggart es: "+boggart+", y su patronus es: "+patronus);
    }
}//class

package practicaMona;

public class TestMona {
    public static void main(String[] args) {

        Fintechtocat Fintechtocat = new Fintechtocat(true,false,"Fintechtocat","TI",144,"corbata");
        Fintechtocat.getInformacion();

        Hulatocat Hulatocat = new Hulatocat(true,false,"Hulatocat","Tocar el ukelele", 137, "ukelele");
        Hulatocat.getInformacion();

        Grinchtocat Grinchtocat = new Grinchtocat(true, true,"Grinchtocat", "Robarse la navidad", 109,"Verde","Bolsa de regalos", "Gorro de navidad");
        Grinchtocat.getInformacion();

        Megacatv2 Megacatv2 = new Megacatv2(true,false,"Megacatv2","Vencer al mal",86,"Cañon",true);
        Megacatv2.getInformacion();

        OctobiWanCatnobi OctobiWanCatnobi = new OctobiWanCatnobi(true,false,"OctobiWanCatnobi","Ser un Jedi",3,true, "La fuerza");
        OctobiWanCatnobi.getInformacion();

        Spectrocat Spectrocat = new Spectrocat (false,false,"Spectrocat","Asustar a los octogatos",44, "Fantasma", false, "Flotando");
        Spectrocat.getInformacion();

    }//main
}//class

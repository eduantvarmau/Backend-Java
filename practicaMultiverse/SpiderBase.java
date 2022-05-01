public class SpiderBase {
    String nombre, tipoDeTraje, origen, genero;

    public SpiderBase(String nombre, String tipoDeTraje, String origen, String genero) {
        this.nombre = nombre;
        this.tipoDeTraje = tipoDeTraje;
        this.origen = origen;
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }//getNombre

    public String getTipoDeTraje() {
        return tipoDeTraje;
    }//getTipoDeTraje

    public String getOrigen() {
        return origen;
    }//getOrigen

    public String getGenero() {
        return genero;
    }//getGenero

    public String getInfo(){
        return "Nombre: "+nombre+
                "\nTipo de traje: "+tipoDeTraje+
                "\nOrigen: "+origen+
                "\nGenero: "+genero+
                "\nHabilidades:";
    }
}

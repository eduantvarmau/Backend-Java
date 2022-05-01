public class MilesMorales extends SpiderBase implements MilesMoralesAbilities {
    public MilesMorales(String nombre, String tipoDeTraje, String origen, String genero) {
        super(nombre, tipoDeTraje, origen, genero);
    }
    @Override
    public void RayoVenenoso(Screen s){
        s.out("\n- Rayo Venenoso\n","Arial",22, Colors.PrestigeBlue);
        s.out("El cuerpo de Miles posee una enorme cantidad de bio-energía que ha aprendido a canalizar y descargar para paralizar temporalmente a sus enemigos con tal solo tocarlos.",
                "Arial",18, Colors.C64Ntsc);
    }
    @Override
    public void ExplosiónEnergía(Screen s){
        s.out("\n- Explosión de Energía\n","Arial",22, Colors.PrestigeBlue);
        s.out("En momentos de estrés, puede generar una fuerte explosión de energía capaz de derribar a quien este a su alrededor.",
                "Arial",18, Colors.C64Ntsc);
    }
    @Override
    public void CamuflajeAracnido(Screen s){
        s.out("\n- Camuflaje Arácnido\n","Arial",22, Colors.PrestigeBlue);
        s.out("Puede mezclarse con su entorno, lo que le permite acercarse sigilosamente a sus enemigos o, en algunos casos, huir de ellos. El efecto resultante se parece mucho al de la invisibilidad.",
                "Arial",18, Colors.C64Ntsc);
    }
}

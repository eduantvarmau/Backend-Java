public class GwendolyneStacy extends SpiderBase implements GwendolyneStacyAbilities{
    public GwendolyneStacy(String nombre, String tipoDeTraje, String origen, String genero) {
        super(nombre, tipoDeTraje, origen, genero);
    }
    public void TelarañaOrganica(Screen s){
        s.out("\n- Telaraña Orgánica\n","Arial",22, Colors.PrestigeBlue);
        s.out("Gwen puede generar telaraña de manera orgánica gracias a las glándulas secretoras que aloja en sus antebrazos, aunque esto le causa un cierto desgaste en su salud y nutrición.",
                "Arial",18, Colors.C64Ntsc);
    }
    public void FuerzaSobrehumana (Screen s){
        s.out("\n- Fuerza Sobrehumana \n","Arial",22, Colors.PrestigeBlue);
        s.out("La fuerza de Spider-Woman le permite levantar 10 toneladas de fuerza, lo suficiente para alzar autos de mediano tamaño.",
                "Arial",18, Colors.C64Ntsc);
    }
    public void SentidoAracnido (Screen s){
        s.out("\n- Sentido Arácnido \n","Arial",22, Colors.PrestigeBlue);
        s.out("Spider-Woman posee un sentido extrasensorial o sentido arácnido que le avisa de los potenciales peligros inmediatos con una sensación de hormigueo en la parte posterior de la cabeza.",
                "Arial",18, Colors.C64Ntsc);
    }
    public void TrepaMuros (Screen s){
        s.out("\n- Trepa Muros \n","Arial",22, Colors.PrestigeBlue);
        s.out(" La araña radiactiva que pico a Gwen produjo una mutación en su cerebelo, como consecuencia ella puede controlar mentalmente el flujo de atracción interatómica (electrostática) entre el límite molecular de las superficies, así supera la repulsión normal de electrones y permite su increíble potencial de adhesión.",
                "Arial",18, Colors.C64Ntsc);
    }
}

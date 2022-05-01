import java.awt.*;

public class PeterParker extends SpiderBase implements PeterParkerAbilities {


        public PeterParker(String nombre, String tipoDeTraje, String origen, String genero) {
            super(nombre, tipoDeTraje, origen, genero);
        }
        @Override
        public void MarcaKaine(Screen s){
            s.out("\n- Marca de Kaine\n","Arial",22, Colors.PrestigeBlue);
            s.out("Concentra el flujo interatómico para quemar la superficie de lo que toca",
                    "Arial",18, Colors.C64Ntsc);
        }
        @Override
        public void EquilibrioPerfecto(Screen s){
            s.out("\n- Equilibrio Perfecto\n","Arial",22, Colors.PrestigeBlue);
            s.out("tiene la asombrosa habilidad de un perfecto balance y equilibrio, desde prácticamente cualquier punto imaginable.",
                    "Arial",18, Colors.C64Ntsc);
        }
        @Override
        public void SentidosMejorados(Screen s) {
            s.out("\n- Sentidos Mejorados \n", "Arial", 22, Colors.PrestigeBlue);
            s.out("Los sentidos de Peter Parker pueden casi congelar el tiempo a su alrededor, para él, el paso de segundos son momentos congelados en el tiempo. Su Sentido Arácnido percibe el mundo como frames.",
                    "Arial",18, Colors.C64Ntsc);
        }
        @Override
        public void ConexiónAracnidaSilk(Screen s){
            s.out("\n- Conexión Aracnida con Silk \n","Arial",22, Colors.PrestigeBlue);
            s.out("Debido a que el y Cindy fueron mordidos por la misma araña, sus Sentidos Arácnidos están conectados, por lo cual puede encontrar y sentir a Silk y viceversa.",
                    "Arial",18, Colors.C64Ntsc);

        }

}

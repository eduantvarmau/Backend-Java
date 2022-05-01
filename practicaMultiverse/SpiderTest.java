import java.awt.*;

public class SpiderTest {
    public static void main(String[] args) {
        Spiderverse();

    }
    public static void Spiderverse(){
        Screen s = new Screen();
        s.setVisible(true);
        s.setBounds(200,100,1000,800);

        PeterParker peterParker = new PeterParker("Peter Parker","Traje Clásico","Tierra-616","Masculino");
        s.out(peterParker.getInfo(),"Arial",22, Colors.PrestigeBlue);
        peterParker.MarcaKaine(s);
        peterParker.EquilibrioPerfecto(s);
        peterParker.SentidosMejorados(s);
        peterParker.ConexiónAracnidaSilk(s);
        s.out("\n");
        s.showImage("src/img/peterParker.png");
        s.out("\n");


        MilesMorales milesMorales = new MilesMorales("Miles Morales","Traje negro con rojo","Tierra-1610","Masculino");
        s.out(milesMorales.getInfo(),"Arial",22, Colors.PrestigeBlue);
        milesMorales.RayoVenenoso(s);
        milesMorales.ExplosiónEnergía(s);
        milesMorales.CamuflajeAracnido(s);
        s.out("\n");
        s.showImage("src/img/milesMorales.png");
        s.out("\n");

        GwendolyneStacy gwendolyneStacy = new GwendolyneStacy("GwendolyneStacy","Traje rosa con negro","Tierra-65","Femenino");
        s.out(gwendolyneStacy.getInfo(),"Arial",22, Colors.PrestigeBlue);
        gwendolyneStacy.TelarañaOrganica(s);
        gwendolyneStacy.FuerzaSobrehumana(s);
        gwendolyneStacy.SentidoAracnido(s);
        gwendolyneStacy.TrepaMuros(s);
        s.out("\n");
        s.showImage("src/img/gwendolyneStacy.png");


    }
}

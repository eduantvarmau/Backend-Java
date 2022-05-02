public class ComicPageText implements  ComicInterface{
    String txt;

    @Override
    public void fristPage(Screen s){

        txt = "Ashe\n" +
                "Matriarca\n" +
                "Criada en  las congeladas tierras salvajes del Freljord, Ashe es una hija del hielo; " +
                "una guerrera que tiene una conexcion mágica con sus heladas tierras. Como hija de la " +
                "fanática matriarca de su tribu. Muchos suponen que a Ashe la espera un gran destino. " +
                "Sin embargo, ella se rehúsa a aceptar las despiadadas responsabilidades del liderazgo y las " +
                "rígidas tradiciones de su pueblo\n" +
                "AUTOR: Odin Austin Shafer\n" +
                "ARTE: Nina Vakueva\n" +
                "ARTISTAD E PORTADA: Yasmine Putri\n" +
                "EDICIÓN PRINCIPAL: Ellie Pyle\n" +
                "Edición: Mary Gumport\n" +
                "Agradecimiento especial a Jeanine Schaefer\n";
        s.setVisible(true);
        s.out(txt,"Arial",20,Colors.PrestigeBlue);
    }
    @Override
    public void secondPage(Screen s){
        s.cls();
        txt = "Ashe la arquera de hielo";
        s.out(txt,"Arial",20,Colors.PrestigeBlue);

    }

    @Override
    public void thirdPage(Screen s) {
        s.cls();
        txt = "Ashe la arquera de hielo dispara";
        s.out(txt,"Arial",20,Colors.PrestigeBlue);
    }

    @Override
    public void fourthPage(Screen s) {
        s.cls();
        txt = "Ashe la arquera de hielo";
        s.out(txt,"Arial",20,Colors.PrestigeBlue);
    }

    @Override
    public void fifthPage(Screen s) {
        s.cls();
        txt = "Ashe la arquera de hielo";
        s.out(txt,"Arial",20,Colors.PrestigeBlue);
    }

    @Override
    public void sixthPage(Screen s) {
        s.cls();
        txt = "Ashe la arquera de hielo";
        s.out(txt,"Arial",20,Colors.PrestigeBlue);
    }

    @Override
    public void seventhPage(Screen s) {
        s.cls();
        txt = "Ashe la arquera de hielo";
        s.out(txt,"Arial",20,Colors.PrestigeBlue);
    }

    @Override
    public void eighthPage(Screen s) {
        s.cls();
        txt = "Ashe la arquera de hielo";
        s.out(txt,"Arial",20,Colors.PrestigeBlue);
    }

    @Override
    public void ninthPage(Screen s) {
        s.cls();
        txt = "Ashe la arquera de hielo";
        s.out(txt,"Arial",20,Colors.PrestigeBlue);
    }

    @Override
    public void tenthPage(Screen s) {
        s.cls();
        txt = "Ashe la arquera de hielo";
        s.out(txt,"Arial",20,Colors.PrestigeBlue);
    }

}

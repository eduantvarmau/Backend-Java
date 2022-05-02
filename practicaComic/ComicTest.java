public class ComicTest extends Thread {
    public static void main(String[] args) {
        getComic();
    }//main
    public static void getComic(){
        Screen si = new Screen();
        si.setVisible(true);
        si.setBounds(610,0,630,743);
        Thread page = new Thread(new ComicPageImg(si));
        page.start();

        Screen st = new Screen();
        st.setVisible(true);
        st.setBounds(610,0,630,743);
        ComicPageText comicPageText = new ComicPageText();

        Runnable txt = new Runnable() {
            @Override
            public void run() {
                try{
                    comicPageText.fristPage(st);
                    Thread.sleep(9000);
                    comicPageText.secondPage(st);
                    Thread.sleep(9000);
                    comicPageText.thirdPage(st);
                    Thread.sleep(9000);
                    comicPageText.fourthPage(st);
                    Thread.sleep(9000);
                    comicPageText.fifthPage(st);
                    Thread.sleep(9000);
                    comicPageText.sixthPage(st);
                    Thread.sleep(9000);
                    comicPageText.seventhPage(st);
                    Thread.sleep(9000);
                    comicPageText.eighthPage(st);
                    Thread.sleep(9000);
                    comicPageText.ninthPage(st);
                    Thread.sleep(9000);
                    comicPageText.tenthPage(st);
                    Thread.sleep(9000);


                }catch (InterruptedException ie){
                    ie.printStackTrace();
                }
            }
        };
        Thread txtC = new Thread(txt);
        txtC.start();
    }
}//class



public class ComicPageImg implements Runnable{
    Screen s;

    public ComicPageImg(Screen s) {
        this.s = s;
    }
    @Override
    public void run(){
        for(int i =1; i <=10; i++){
            String img = "src/page"+i+".jpg";
            s.cls();
            s.showImage(img);
            try{
                Thread.sleep(9000);
            }catch (InterruptedException ie){
                ie.printStackTrace();
            }
        }
    }

}


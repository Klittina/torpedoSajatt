package torpedosajat;

import java.util.Random;

public class Hajo {
    private int [] pozicio = new int [3];

    public Hajo(int [] pozicio) {
        this.pozicio = pozicio;
    }

    public String talalat (int poz){
        for (int i = 0; i < pozicio.length; i++) {
            if (poz==pozicio[i]){
                return "talált";
            }
        }
        return "nem talált";
    }
   public int[] hajoHelyeGeneral() {
        Random rnd = new Random();
        int elsohely = rnd.nextInt(7-3);
        for (int i = 0; i < 3; i++) {
            System.out.println(elsohely);
            pozicio[i] = elsohely;
            elsohely++;
            
        }
        return pozicio;
    }
}

package torpedosajat;

import java.util.Scanner;

public class main {

    
    
    public static void main(String[] args) {
        hajoElhelyez();
    }
    
    public static void hajoElhelyez(){
        int [] hajohely;
        //Hajo h1 = new Hajo([0,0,0]);
        //hajo.hajoHelyeGeneral();
        int tipp = felhtipp();
    }
    public static int felhtipp(){
        int tipp;
        Scanner sc = new Scanner (System.in);
        System.out.print("Írd be a tippedet:");
        tipp = sc.nextInt();
        return tipp;
    }
    
}

package torpedosajat;

public class torpedoTeszt {
    public static void main(String[] args) {
        tesztLoves(1);
    }
    public static String tesztLoves(int poz){
        int [] tomb = {2,3,4};
        Hajo hajo = new Hajo(tomb);
        String t = hajo.talalat(poz);
        assert t.equals("talált"):"nem jó";
        return "";
    }
}

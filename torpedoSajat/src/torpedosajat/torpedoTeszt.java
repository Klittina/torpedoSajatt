package torpedosajat;

public class torpedoTeszt {
    public static void main(String[] args) {
        tesztLoves(4);
    }
    public static String tesztLoves(int poz){
        Hajo hajo = new Hajo();
        String t = hajo.talalat(4);
        assert t.equals("talált");
        return "";
    }
}

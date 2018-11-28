import java.util.ArrayList;

public class Hoja {
    private String nombreHoja;
   // private int id;
    private ArrayList<ArrayList<Celda>> matriz;

    public Hoja(String nombreHoja) {
        this.matriz = new ArrayList<ArrayList<Celda>>();
        this.nombreHoja = nombreHoja;
    }


}

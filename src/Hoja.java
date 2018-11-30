import java.util.ArrayList;

public class Hoja {
    private String nombreHoja;
   // private int id;
    private ArrayList<ArrayList<Celda>> matriz;

    public Hoja(String nombreHoja) {
        this.matriz = new ArrayList<ArrayList<Celda>>();
        this.nombreHoja = nombreHoja;
    }
    public Hoja crearHoja (String nombre){
        Hoja hoja = new Hoja(nombre);
        return hoja;
    }

    public String getNombreHoja() {
        return nombreHoja;
    }

}

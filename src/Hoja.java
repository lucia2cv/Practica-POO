import java.util.ArrayList;
import java.util.HashMap;

public class Hoja {
    private String nombreHoja;

    private HashMap<Coordenada,Celda> matriz;

    public Hoja(String nombreHoja) {
        this.matriz = new HashMap<>();
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

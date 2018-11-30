import java.util.HashMap;
import java.util.Map;

public class Libro {
    private Map<String,Hoja> listaHojas;
    private Hoja hojaActiva;
    public Libro(){
     this.listaHojas = new HashMap<>();
    }
    public boolean esLibroVacio (){
        return listaHojas==null;
    }

    public void setHojaActiva(Hoja hojaActiva) {
        this.hojaActiva = hojaActiva;
    }

    public Hoja getHojaActiva() {
        return hojaActiva;
    }

    public Map insertarHojaLista (String nombre, Hoja hj){
            listaHojas.put(nombre,hj);
            return listaHojas;

    }

    public Map<String, Hoja> getListaHojas() {
        return listaHojas;
    }

    public void crearLibro(){
        Hoja hoja1 = new Hoja("Hoja1");
        Hoja hoja2 = new Hoja("Hoja2");
        Hoja hoja3 = new Hoja("Hoja3");
        this.listaHojas.put("Hoja1", hoja1);
        this.listaHojas.put("Hoja2", hoja2);
        this.listaHojas.put("Hoja3", hoja3);
        setHojaActiva(hoja1);
    }

}


import java.util.Scanner;

public class Comando {
    private Libro libro;
    public void leerComando(){
        Scanner sc = new Scanner(System.in);
        String opcion = sc.nextLine();
       System.out.println(comprobar(opcion));
       if (comprobar(opcion)){
           ejecutar(opcion);

        }else{
           System.out.println("ERROR");
       }

    }
    public boolean comprobar(String op){
        switch (op){
            case "crearLibro":
                return true;
            case "crearHoja":
                return true;
            case "hojaActual":
                return true;
            case "borrarHoja":
                return true;
            case "celda":
                return true;
            case "mostrar":
                return true;
            case "cargar":
                return true;
            case "salvar":
                return true;
            default:

                return false;

        }
    }
    public void ejecutar(String comando){
        switch(comando){
            case "crearLibro":
                libro = new Libro();
                libro.crearLibro();
                System.out.println(libro.getHojaActiva().getNombreHoja());
                leerComando();
                break;
            case "crearHoja":
                try {
                    if (!libro.esLibroVacio()) {
                        System.out.println("Nombre de la hoja");
                        Scanner sc = new Scanner(System.in);
                        String nomb = sc.nextLine();
                        //comprobamos que el nombre de la hoja no tenga espacios y no este repetido
                        if ((nomb.indexOf(" ") == -1) && (!libro.getListaHojas().containsKey(nomb))) {

                            Hoja hojaNueva = new Hoja(nomb);
                            libro.insertarHojaLista(nomb, hojaNueva);
                            libro.setHojaActiva(hojaNueva);
                            System.out.println(libro.getHojaActiva().getNombreHoja());

                        }
                    }
                }catch (NullPointerException e){
                    System.out.println("Libro no creado");
                    leerComando();
                }
                break;
            case "hojaActual":
                try {

                    libro.getListaHojas(); //para que salte la excepcion
                    System.out.println("Introducir la hoja que se desea como actual");
                    Scanner sc = new Scanner(System.in);
                    String hActual = sc.nextLine();
                    //comprobar si la hoja existe
                    if (libro.getListaHojas().containsKey(hActual)) {
                        libro.setHojaActiva(libro.getListaHojas().get(hActual));
                        System.out.println("La hoja activa es " + libro.getHojaActiva().getNombreHoja());
                    }else{
                        System.out.println("Hoja no existente");
                    }



                }catch (NullPointerException e) {
                    System.out.println("No hay libro");
                    leerComando();
                }
                break;
        }




    }

    public void setLibro(Libro l) {
        this.libro = l;
    }

    public Libro getLibro() {
        return libro;
    }
}

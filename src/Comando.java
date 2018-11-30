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
    public void ejecutar(String comando) {
        switch (comando) {
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
                } catch (NullPointerException e) {
                    System.out.println("Libro no creado");
                    leerComando();
                }
                break;
            case "borrarHoja":
                try {

                } catch (NullPointerException e) {
                    System.out.println("No hay libro");
                }

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
                    } else {
                        System.out.println("Hoja no existente");
                    }


                } catch (NullPointerException e) {
                    System.out.println("No hay libro");
                    leerComando();
                }
                break;
        case "mostrar":
        try {
            libro.getListaHojas();//Salta la excepcion
            System.out.println("Insertar la fila");
            Scanner sc = new Scanner(System.in);
            int fila = 0;
            try {
                fila = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException n) {
                System.out.println("Introduce un numero valido");
                leerComando();
            }

            System.out.println("Insertar la columna");
            Scanner sca = new Scanner(System.in);
            int columna = 0;
            try {
                columna = Integer.parseInt(sca.nextLine());
            } catch (NumberFormatException n) {
                System.out.println("Introduce un numero valido");
                leerComando();
            }
           /* for (int i = fila; i < i + 8; i++) {
                System.out.print(" ele");
                System.out.print(i+ "  ");
                for (int j = columna; j < j + 8; j++) {

                    if ((i == fila) && (j == columna)) {
                        System.out.print(" ");
                        System.out.print("pene");
                    } else if (i == columna) {

                    }else if (j == fila ) {
                        System.out.println("pe");
                        System.out.println(j);
                    }

                }
            }*/
        } catch (NullPointerException e) {
            System.out.println("No hay libro");
            leerComando();
        }
    }
    }

    public void setLibro(Libro l) {
        this.libro = l;
    }

    public Libro getLibro() {
        return libro;
    }
}

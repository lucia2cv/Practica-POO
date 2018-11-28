import java.util.Scanner;

public class Comando {
    private Libro libro;
    public void leerComando(){
        Scanner sc = new Scanner(System.in);
        String opcion = sc.nextLine();
       System.out.println(comprobar(opcion));
       if (!comprobar(opcion)){
            System.out.println("ERROR");
        }else{
           ejecutar(opcion);
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
                CrearLibro cLibro = new CrearLibro();
                this.libro = cLibro.create();
                break;
            case "crearHoja":
                //si el libro no esta vacio
                if (!libro.esLibroVacio()) {
                    System.out.println("Introducir nombre de hoja");
                    Scanner sc = new Scanner(System.in);
                    String nomb = sc.nextLine();
                    CrearHoja h = new CrearHoja();
                    Hoja hoja = h.crearHoja(nomb);
                    libro.insertarHojaLista(nomb,hoja);
                }
        }




    }

    public void setLibro(Libro l) {
        this.libro = l;
    }
}

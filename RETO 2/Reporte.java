

import java.util.ArrayList;
import java.util.Scanner;

public class Reporte {

   static ArrayList<Producto> array = new ArrayList();

    public Reporte() {
    }

    public static void main(String[] args) {
        cargarInformacionMenuOpciones();
    }

    public static void cargarInformacionMenuOpciones() {
        Scanner esc = new Scanner(System.in);
        String entrada = "";
        String  []  infoSeparada = new String [6];
        do {
            entrada = esc.nextLine();
            infoSeparada = entrada.split(";");
           int opcion = Integer.parseInt( infoSeparada[0]);
                   
            switch (opcion) {
                case 1:
                    adicionarproductos(infoSeparada);
                    break;
                case 2:
                    listarProductos();
                    break;
                default:
                    break;
            }
        } while (!"3".equals(entrada));

    }

    public static void adicionarproductos( String [] infoSeparada) {
        //comparar que clase se instancia: hogar/oficina
        String opcion = infoSeparada[1];
        
        switch (opcion) {
            case "hogar":
                Producto nuevoHogar = new Hogar(infoSeparada[2], (float) Float.parseFloat(infoSeparada[3]), Boolean.parseBoolean(infoSeparada[4]), Integer.parseInt(infoSeparada[5]));
                array.add(nuevoHogar);
                break;
            case "oficina":
                Producto nuevaOficina = new Oficina(infoSeparada[2], Float.parseFloat(infoSeparada[3]), Boolean.parseBoolean(infoSeparada[4]), Boolean.parseBoolean(infoSeparada[5]));
                array.add(nuevaOficina);
                break;
            default:
                break;
        }
    }

    public static void listarProductos() {
        System.out.println("----------------------------------");
        System.out.println("***** Reporte de productos *******");
        System.out.println("----------------------------------");
        for(int i = 0; i<array.size(); i++){
            System.out.println(array.get(i).toString()); //metodo toString de cada objeto del array
        }
        System.out.println("Fin del reporte.");
    }
}

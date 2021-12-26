import java.util.Scanner;
class reto1 {
  public static void main(String[] arg) {

    Scanner scan = new Scanner(System.in);
    //categorias
    int prodHogar = 0;
    int prodPapeleria = 0;
    int prodLimpieza = 0;

    //Lectura de datos
    prodPapeleria=scan.nextInt();

    //ecuaciones y desarrollo
    prodHogar = (2*prodPapeleria) + 4;
    prodLimpieza = (prodHogar+prodPapeleria)/5;
    String clasificacion="";

    //Rangos
    if (prodLimpieza>=0 && prodLimpieza<=20){
      clasificacion = "uno";
    } else if(prodLimpieza>20 && prodLimpieza<=30){
      clasificacion = "dos";
    } else if(prodLimpieza>=31 && prodLimpieza<=50){
      clasificacion = "tres";
    }else if(prodLimpieza>50){
      clasificacion = "cuatro";
    }

    //salida
    System.out.println(prodPapeleria+" "+prodHogar+" "+prodLimpieza);
    System.out.println(clasificacion);

    scan.close();
  }
}
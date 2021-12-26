import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.List;

public class Stock {

    //consultar prodtuctos  
    public  List consultarProductos(List listaProductos) {
        List listaRetorno;
        listaRetorno = new ArrayList();
        for (int i=0; i<listaProductos.size(); i++){
            if(!(Arrays.asList(listaRetorno.toArray()).contains(listaProductos.get(i)))){
                listaRetorno.add(listaProductos.get(i));
            }
        }
        
        return listaRetorno;
    }

    //consultar Posiciones del producto 
    public  List consultaPosicionesXProducto(List listaIndices, List listaProductos, String nombreProducto) {
        List listaRetorno = new ArrayList();
        for (int i = 0; i < listaIndices.size(); i++) {
            int valor = (int) listaIndices.get(i);
            if (listaProductos.get(valor) == nombreProducto) {
                listaRetorno.add(listaIndices.get(i));
            }
        }
        return listaRetorno;
    }

    //intercambio de productos
    public List consultaProductosIntercambio(List listaSucursal, List listaPrincipal) {
        List listaRetorno = new ArrayList();
        for (int i = 0; i < listaSucursal.size(); i++) {

            if (!(Arrays.asList(listaPrincipal.toArray()).contains(listaSucursal.get(i)))) {
                listaRetorno.add(listaSucursal.get(i));
            }
        }

        return listaRetorno;
    }

    //cantidad intercambios (parejas) 
    public  Integer consultaMaxProductosIntercambio(ArrayList listaPrincipal, ArrayList listaSucursal) {
        Integer cantidad = 0;
        Integer c1 = 0, c2 = 0;
        //Cantidad para listaPrincipal
        for (int i = 0; i < listaSucursal.size(); i++) {
            if (!(Arrays.asList(listaPrincipal.toArray()).contains(listaSucursal.get(i)))) {
                c1++;
            }
        }
        //cantidad para listSucursal
        for (int i = 0; i < listaPrincipal.size(); i++) {
            if (!(Arrays.asList(listaSucursal.toArray()).contains(listaPrincipal.get(i)))) {
                c2++;
            }
        }

        //comparacion
        if (c1 < c2) {
            cantidad = c1;
        } else if (c1 > c2) {
            cantidad = c2;
        } else if (c1 == c2) {
            cantidad = c1;
        }
        return cantidad;
    }
}

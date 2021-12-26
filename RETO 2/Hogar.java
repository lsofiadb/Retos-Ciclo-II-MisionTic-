
public class Hogar extends Producto{
    
    private int cantidadStock; 
    
    public Hogar(String Nombre, float Precio, boolean Estado, int cantidadStock) {
        super(Nombre, Precio, Estado);
        this.cantidadStock = cantidadStock;
    }

    @Override
    public String toString() {
        return "Producto: Hogar \n" + "\tCantidadStock:" + cantidadStock+" unidad(es)"+"\n" + "\tNombre: \""+getNombre()+"\" \n"+"\tPrecio: $"+getPrecio()+"\n"+"\tEstado: "+esActivo()+"\n"+"\tValor x docena:"+valorPorDocena();
    }
    
    
    public int getCantidadStock() {
        return cantidadStock;
    }

    public void setCantidadStock(int cantidadStock) {
        this.cantidadStock = cantidadStock;
    }
    
}

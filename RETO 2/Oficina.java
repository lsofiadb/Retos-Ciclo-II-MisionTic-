
public class Oficina extends Producto{
    private boolean esProductoWeb;
    
    public Oficina(String Nombre, float Precio, boolean Estado, boolean esProductoWeb) {
        super(Nombre, Precio, Estado);
        this.esProductoWeb = esProductoWeb;
    }

    @Override
    public String toString() {
        return "Producto: Oficina \n"+ "\tNombre: \""+getNombre()+"\" \n"+"\tPrecio: $"+getPrecio()+" unidad(es) \n"+"\tEstado: "+esActivo()+"\n"+"\tProducto Venta Web: "+esWeb()+"\n"+"\tValor x docena:"+valorPorDocena();
    }
    
    public String esWeb(){
        String web = "";
        if(this.isEstado()){
            web="Sí";
        }else{
            web="No";
        }
        return web;
    }

    public boolean isEsProductoWeb() {
        return esProductoWeb;
    }

    public void setEsProductoWeb(boolean esProductoWeb) {
        this.esProductoWeb = esProductoWeb;
    }
    
}

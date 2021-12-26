
public class Producto {

    private String Nombre;
    private float Precio;
    private boolean Estado;

    public Producto(String Nombre, float Precio, boolean Estado) {
        this.Nombre = Nombre;
        this.Precio = Precio;
        this.Estado = Estado;
    }

    @Override
    public String toString() {
        return "Producto{" + "Nombre=" + Nombre + ", Precio=" + Precio + ", Estado=" + Estado + '}';
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public float getPrecio() {
        return Precio;
    }

    public void setPrecio(float Precio) {
        this.Precio = Precio;
    }

    public boolean isEstado() {
        return Estado;
    }

    public void setEstado(boolean Estado) {
        this.Estado = Estado;
    }

    public float valorPorDocena() {
        float valorTotal = 0.0f;
        valorTotal = this.Precio * 12;
        return valorTotal;
    }

    public String esActivo() {
        String resultado = "";
        if (this.isEstado()) {
            resultado = "activo";
        } else {
            resultado = "inactivo";
        }
        return resultado;
    }

}

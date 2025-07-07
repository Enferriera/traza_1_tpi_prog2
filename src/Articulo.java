import java.util.HashSet;
import java.util.Set;

public abstract class Articulo extends Base {
    //Atributos
    private String denominacion;
    private double precioVenta;
    private Set<Imagen> imagenes=new HashSet<>();
    private Set<Alergeno> alergenos= new HashSet<>();

    //Constructor
    public Articulo(String denominacion, double precioVenta) {
        this.denominacion = denominacion;
        this.precioVenta = precioVenta;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public Set<Imagen> getImagenes() {
        return imagenes;
    }

    public void setImagenes(Set<Imagen> imagenes) {
        this.imagenes = imagenes;
    }

    public Set<Alergeno> getAlergenos() {
        return alergenos;
    }

    public void setAlergenos(Set<Alergeno> alergenos) {
        this.alergenos = alergenos;
    }

    public void addImagen(Imagen imagen){
        if(imagen!=null){
            this.imagenes.add(imagen);
        }
    }

    public void addAlergeno(Alergeno alergeno){
        if(alergeno != null){
            this.alergenos.add(alergeno);
        }
    }

    @Override
    public String toString() {
        return '\n' +"Articulo{" +
                "denominacion='" + denominacion + '\n' +
                ", precioVenta=" + precioVenta + '\n' +
                ", imagenes=" + imagenes + '\n' +
                ", alergenos=" + alergenos + '\n' +
                '}';
    }
}

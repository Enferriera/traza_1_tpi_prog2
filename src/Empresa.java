import java.util.HashSet;
import java.util.Set;

public class Empresa extends Base {
    private String nombre;
    private String razonSocial;
    private int cuit;

    private Set<Sucursal> sucursales=new HashSet<>();

    public Empresa(String nombre, String razonSocial, int cuit) {
        this.nombre = nombre;
        this.razonSocial = razonSocial;
        this.cuit = cuit;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public int getCuit() {
        return cuit;
    }

    public void setCuit(int cuit) {
        this.cuit = cuit;
    }

    public Set<Sucursal> getSucursales() {
        return sucursales;
    }

    public void setSucursales(Set<Sucursal> sucursales) {
        this.sucursales = sucursales;
    }

    public void addSucursal(Sucursal sucursal){
        if(sucursal!=null){
            this.sucursales.add(sucursal);
        }
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "nombre='" + nombre + '\'' +
                ", razonSocial='" + razonSocial + '\'' +
                ", cuit=" + cuit + '\n'+
               ", sucursales=" + sucursales +
                '}';
    }
}

import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;

public class Sucursal extends Base {
    private String nombre;
    private LocalTime horaApertura;
    private LocalTime horaCierre;
    private Boolean esCasaMatriz;
    private Domicilio domicilio;
    private Set<Categoria> categorias= new HashSet<>();

    public Sucursal(String nombre, LocalTime horaApertura, LocalTime horaCierre, Boolean esCasaMatriz) {
        this.nombre = nombre;
        this.horaApertura = horaApertura;
        this.horaCierre = horaCierre;
        this.esCasaMatriz = esCasaMatriz;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalTime getHoraApertura() {
        return horaApertura;
    }

    public void setHoraApertura(LocalTime horaApertura) {
        this.horaApertura = horaApertura;
    }

    public LocalTime getHoraCierre() {
        return horaCierre;
    }

    public void setHoraCierre(LocalTime horaCierre) {
        this.horaCierre = horaCierre;
    }

    public Boolean getEsCasaMatriz() {
        return esCasaMatriz;
    }

    public void setEsCasaMatriz(Boolean esCasaMatriz) {
        this.esCasaMatriz = esCasaMatriz;
    }

    public Domicilio getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
    }

    public Set<Categoria> getCategorias() {
        return categorias;
    }

    public void setCategorias(Set<Categoria> categorias) {
        this.categorias = categorias;
    }

    public void addCategoria(Categoria categoria){
        if(categoria!=null){
            this.categorias.add(categoria);
        }
    }

    @Override
    public String toString() {
        return "Sucursal{" +
                "nombre='" + nombre + '\n' +
                ", horaApertura=" + horaApertura +'\n' +
                ", horaCierre=" + horaCierre +'\n' +
                ", esCasaMatriz=" + esCasaMatriz +'\n' +
                ", domicilio=" + domicilio +'\n' +
                ", categorias=" + categorias +'\n' +
                '}';
    }
}

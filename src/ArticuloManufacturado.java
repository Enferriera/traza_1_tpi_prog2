import java.util.HashSet;
import java.util.Set;

public class ArticuloManufacturado extends Articulo {
    private String descripcion;
    private Integer tiempoEstimadoMinutos;
    private String preparacion;
    private Set<DetalleArticuloManufacturado> detaleManufacturado= new HashSet<>();

    public ArticuloManufacturado(String denominacion, double precioVenta, String descripcion, Integer tiempoEstimadoMinutos, String preparacion) {
        super(denominacion, precioVenta);
        this.descripcion = descripcion;
        this.tiempoEstimadoMinutos = tiempoEstimadoMinutos;
        this.preparacion = preparacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Set<DetalleArticuloManufacturado> getDetaleManufacturado() {
        return detaleManufacturado;
    }

    public void setDetaleManufacturado(Set<DetalleArticuloManufacturado> detaleManufacturado) {
        this.detaleManufacturado = detaleManufacturado;
    }

    public String getPreparacion() {
        return preparacion;
    }

    public void setPreparacion(String preparacion) {
        this.preparacion = preparacion;
    }

    public Integer getTiempoEstimadoMinutos() {
        return tiempoEstimadoMinutos;
    }

    public void setTiempoEstimadoMinutos(Integer tiempoEstimadoMinutos) {
        this.tiempoEstimadoMinutos = tiempoEstimadoMinutos;
    }

    public void addDetalleArticuloManufacturado(Integer cantidad, ArticuloInsumo articuloInsumo){
            if(cantidad>0 && articuloInsumo!=null){
                this.detaleManufacturado.add(new DetalleArticuloManufacturado(cantidad,articuloInsumo));
            }
    }

    @Override
    public String toString() {
        return "ArticuloManufacturado{" +
                super.toString()+
                "descripcion='" + descripcion + '\'' +
                ", tiempoEstimadoMinutos=" + tiempoEstimadoMinutos +
                ", preparacion='" + preparacion + '\'' +
                ", detaleManufacturado=" + detaleManufacturado +
                '}';
    }
}

public class Alergeno extends Base {
    private String denominacion;
    private Imagen imagen;

    public Alergeno(String denominacion, Imagen imagen) {
        this.denominacion = denominacion;
        this.imagen = imagen;
    }

    @Override
    public String toString() {
        return "Alergeno{" +
                "denominacion='" + denominacion + '\'' +
                ", imagen=" + imagen +
                '}';
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public Imagen getImagen() {
        return imagen;
    }

    public void setImagen(Imagen imagen) {
        this.imagen = imagen;
    }
}

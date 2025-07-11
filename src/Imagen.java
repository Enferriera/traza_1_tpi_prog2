public class Imagen extends Base {
    private String nombre;
    private String url;

    public Imagen(String nombre, String url) {
        this.nombre = nombre;
        this.url = url;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "Imagen{" +
                "nombre='" + nombre + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}

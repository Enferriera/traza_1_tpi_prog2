import java.util.HashSet;
import java.util.Set;

public class Categoria extends Base {
    private String denominacion;
    private Categoria categoriaPadre;
    private Set<Categoria> categoriaHijas=new HashSet<>();
    private Set<Articulo> articulos=new HashSet<>();

    public Categoria(String denominacion) {
        this.denominacion = denominacion;
    }

    public void addCategoria(Categoria categoria){
        if(categoria!=null){
            this.categoriaHijas.add(categoria);
            categoria.setCategoriaPadre(this);
        }
    }

    public void addArticulo(Articulo articulo){
        if(articulo!=null){
            this.articulos.add(articulo);
        }
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public Categoria getCategoriaPadre() {
        return categoriaPadre;
    }

    public void setCategoriaPadre(Categoria categoriaPadre) {
        this.categoriaPadre = categoriaPadre;
    }

    public Set<Categoria> getCategoriaHijas() {
        return categoriaHijas;
    }

    public void setCategoriaHijas(Set<Categoria> categoriaHijas) {
        this.categoriaHijas = categoriaHijas;
    }

    public Set<Articulo> getArticulos() {
        return articulos;
    }

    public void setArticulos(Set<Articulo> articulos) {
        this.articulos = articulos;
    }

    @Override
    public String toString() {
        return "Categoria{" +
                "denominacion='" + denominacion + '\n' +
                ", categoriaPadre=" + ((categoriaPadre!=null) ? categoriaPadre.getDenominacion():null) + '\n' +
                ", categoriaHijas=" + categoriaHijas + '\n' +
                ", articulos=" + articulos +
                '}';
    }
}

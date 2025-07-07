import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {

        System.out.println("Iniciando");
        //Creamos lo necesario para un Domicilio
        Pais pais = new Pais("Argentina");
        Provincia provincia = new Provincia("Mendoza", pais);
        Localidad localidad = new Localidad("Mendoza Ciudad", provincia);

        Domicilio dom1 = new Domicilio("Gutierrez", "799", 5500, localidad);

        //Creamos las empresas
        Empresa elBuenSabor = new Empresa("El Buen Sabor", "El Buen Sabor", 20345);

        //Creamos las sucursales
        Sucursal sucursalGutierrez = new Sucursal("Buen Sabor Gutierrez", LocalTime.of(9, 0), LocalTime.of(23, 59), true);
        //Asociamos el domicilio a la sucursal
        sucursalGutierrez.setDomicilio(dom1);

        //Asociamos las sucursales a la empresa
        elBuenSabor.addSucursal(sucursalGutierrez);

        //Creamos las categorias
        Categoria menu = new Categoria("Menu");
        Categoria pizzas = new Categoria("Pizzas");
        Categoria lomos = new Categoria("Lomos");
        Categoria hamurguesas = new Categoria("Hamburguesas");
        Categoria empanadas = new Categoria("Empanadas");
        //Asociamos categoria menu con las hijas
        menu.addCategoria(pizzas);
        menu.addCategoria(lomos);
        menu.addCategoria(hamurguesas);
        menu.addCategoria(empanadas);
        //Creamos categorias de bebidas
        Categoria bebidas = new Categoria("Bebidas");
        Categoria sinAlcohol = new Categoria("Sin Alcohol");
        Categoria tragos = new Categoria("Tragos");
        Categoria cervezas = new Categoria("Cervezas");
        Categoria vinos = new Categoria("Vinos");

        //Asociamos las categorias de bebidas con las hijas
        bebidas.addCategoria(sinAlcohol);
        bebidas.addCategoria(tragos);
        bebidas.addCategoria(cervezas);
        bebidas.addCategoria(vinos);

        //Creamos categoria insumos
        Categoria insumos=new Categoria("Insumos");
        Categoria harinas=new Categoria("Harinas");
        Categoria carnes= new Categoria("Carnes");
        Categoria verduras= new Categoria("Verduras");
        Categoria frutas= new Categoria("Frutas");
        Categoria embutidos= new Categoria("Embutidos");
        Categoria quesos= new Categoria("Quesos");
        Categoria bebidasSinPreparar=new Categoria("Bebidas Sin Preparar");

        //Asociamos la categoria insumo con sus hijas
        insumos.addCategoria(harinas);
        insumos.addCategoria(carnes);
        insumos.addCategoria(verduras);
        insumos.addCategoria(frutas);
        insumos.addCategoria(embutidos);
        insumos.addCategoria(quesos);
        insumos.addCategoria(bebidasSinPreparar);

        //Asociamos las categorias con la sucursal
        sucursalGutierrez.addCategoria(menu);
        sucursalGutierrez.addCategoria(pizzas);
        sucursalGutierrez.addCategoria(lomos);
        sucursalGutierrez.addCategoria(hamurguesas);
        sucursalGutierrez.addCategoria(empanadas);
        sucursalGutierrez.addCategoria(bebidas);
        sucursalGutierrez.addCategoria(sinAlcohol);
        sucursalGutierrez.addCategoria(vinos);
        sucursalGutierrez.addCategoria(tragos);
        sucursalGutierrez.addCategoria(cervezas);
        sucursalGutierrez.addCategoria(insumos);
        sucursalGutierrez.addCategoria(carnes);
        sucursalGutierrez.addCategoria(harinas);
        sucursalGutierrez.addCategoria(verduras);
        sucursalGutierrez.addCategoria(frutas);
        sucursalGutierrez.addCategoria(bebidasSinPreparar);
        sucursalGutierrez.addCategoria(embutidos);
        sucursalGutierrez.addCategoria(quesos);

        //Creamos los insumos
        ArticuloInsumo harinaTrigo= new ArticuloInsumo("Harina de Trigo",1000d,700d,2000,30000,true);
        ArticuloInsumo muzzarella= new ArticuloInsumo("Muzzarella",3000d,2300d,15000,30000,true);
        ArticuloInsumo salsaTomate= new ArticuloInsumo("Salsa Tomate",300d,200d,10000,20000,true);

        //Asociamos insumos a sus categorias
        quesos.addArticulo(muzzarella);
        verduras.addArticulo(salsaTomate);
        harinas.addArticulo(harinaTrigo);

        //Creamos un manufacturado
        ArticuloManufacturado pizza= new ArticuloManufacturado("Pizza Muzzarella",8000d,"Pizza con salsa de tomate y queso muzzarela",15,"Se prepara la masa, se le agrega salsa de tomate y el queso y se manda 10 minutos al horno");

        //Creamos los detalles de manufacturado
        pizza.addDetalleArticuloManufacturado(250,harinaTrigo);
        pizza.addDetalleArticuloManufacturado(250,muzzarella);
        pizza.addDetalleArticuloManufacturado(150,salsaTomate);

        Imagen imagenConTacc= new Imagen("Alergeno con tacc","contacc.jpg");
        Alergeno conTacc= new Alergeno("Contiene_T_A_C_C",imagenConTacc);

        pizza.addAlergeno(conTacc);
        Imagen pizzaMuzzarela= new Imagen("Pizza_Muzzarela","https://www.google.com/url?sa=i&url=https%3A%2F%2Felgourmet.com%2Frecetas%2Fpizza-al-molde%2F&psig=AOvVaw3pScSF80MpzvdBJDXsJU42&ust=1752003980400000&source=images&cd=vfe&opi=89978449&ved=0CBQQjRxqFwoTCOiChMrBq44DFQAAAAAdAAAAABAE");
        pizza.addImagen(pizzaMuzzarela);

        pizzas.addArticulo(pizza);
        //Mostramos por pantalla
        System.out.println(elBuenSabor);



    }
}
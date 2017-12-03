package com.tecsup.jsfprime.service;

import com.tecsup.jsfprime.model.Categoria;
import com.tecsup.jsfprime.model.Producto;
import java.util.ArrayList;
import java.util.List;

public class GestionProducto {

    public List<Categoria> listar() {
        List<Categoria> categorias = new ArrayList();

        categorias.add(new Categoria(1l, "Libros", "Esta es la categoria de libros"));
        categorias.add(new Categoria(2l, "Electrónicos", "Esta es la categoria de electronicos"));
        categorias.add(new Categoria(3l, "Niños", "Esta es la categoria de niños"));

        return categorias;
    }

    public List<Producto> listarPorCategoria(Long id) {

        List<Producto> productos = new ArrayList();
        productos.add(new Producto(1l, "Viajes de Guilliver", "Intersante"));
        productos.add(new Producto(2l, "La isla del tesoro", "Aventuras"));
        productos.add(new Producto(3l, "Las aventuras de Tom Sawyer", "Divertido"));
        productos.add(new Producto(4l, "TV LG 3D SMART XYZ ", "WOW"));
        productos.add(new Producto(5l, "PlayStation 4", "Diversión a toda hora"));
        productos.add(new Producto(6l, "HomeTheater", "Mejor sonido."));
        productos.add(new Producto(7l, "Set Dinosaurios JW", "WOW"));
        productos.add(new Producto(8l, "Iron Man", "El personaje favorito"));
        productos.add(new Producto(9l, "Monster Girl", "Muñecas para niñas de hoy."));

        List<Producto> respuesta = new ArrayList();
        switch (id.intValue()) {
            case 1:
                respuesta = productos.subList(0, 3);
                break;
            case 2:
                respuesta = productos.subList(3, 6);
                break;
            case 3:
                respuesta = productos.subList(6, 9);
                break;
            case 0:
                respuesta = productos;
        }
        return respuesta;
    }

}

package microServices.demo.controller;

import microServices.demo.model.ProductoModel;
import microServices.demo.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import java.util.Optional;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;


@RestController
@RequestMapping(value = "/api/v1/")
@CrossOrigin("*")
public class ProductoController{

    @Autowired
    ProductoService productoService;

    @GetMapping(value = "/all")
    public ArrayList<ProductoModel> obtenerProductos(){
        return productoService.obtenerProductos();
    }

    @PostMapping(value = "/save")
    public ProductoModel guardarProducto(@RequestBody ProductoModel producto){
        return this.productoService.guardarProducto(producto);
    }

    @GetMapping( path = "/{id}")
    public Optional<ProductoModel> obtenerProducto(@PathVariable("id") Long id){
        return this.productoService.obtenerPorId(id);
    }

    @DeleteMapping( path = "/{id}")
    public String eliminarPorId(@PathVariable("id") Long id){
        boolean ok = this.productoService.eliminarProducto(id);

        if(ok){
            return "Usuario eliminado con id : "+id;
        }else{
            return "No se pudo eliminar el usuario con id : "+id;
        }

    }






}
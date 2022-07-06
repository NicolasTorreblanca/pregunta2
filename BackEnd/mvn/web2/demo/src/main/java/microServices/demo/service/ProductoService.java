package microServices.demo.service;

import java.util.ArrayList;
import java.util.Optional;
import microServices.demo.model.ProductoModel;
import microServices.demo.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductoService {

    @Autowired
    ProductoRepository productoRepository;

    public ArrayList<ProductoModel> obtenerProductos(){
        return(ArrayList<ProductoModel>) productoRepository.findAll();
    }

    public ProductoModel guardarProducto(ProductoModel producto){
        return productoRepository.save(producto);
    }

    public Optional<ProductoModel> obtenerPorId(Long id){
        return productoRepository.findById(id);
    }

    public boolean eliminarProducto(Long id){
        try{
            productoRepository.deleteById(id);
            return true;
        } catch (Exception error) {
            return false;
        }
    }
}
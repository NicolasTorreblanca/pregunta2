package microServices.demo.repository;


import microServices.demo.model.ProductoModel;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import javax.transaction.Transactional;

@Repository
public interface ProductoRepository extends CrudRepository<ProductoModel,Long> {
}
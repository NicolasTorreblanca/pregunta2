package microServices.demo.model;

import javax.persistence.*;
@Entity
@Table(name = "productos")
public class ProductoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true,nullable = false)
    private Long id;

    private String nombre;
    private Double precioclp ;

    public Long getId() {
        return id;
    }

    public void setID(Long id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(Double precioclp) {
        this.precioclp = precioclp;
    }

    public String getNombre() {
        return nombre;
    }

    public Double getPrecioCLP() {
        return precioclp;
    }

    public Double getPrecioUSD() {
        return precioclp/900;
    }

    public Double getPrecioEUR() {
        return precioclp/950;
    }

}


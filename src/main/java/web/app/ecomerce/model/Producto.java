package web.app.ecomerce.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data  //get  y  set
@AllArgsConstructor  //constructor con parametros
@NoArgsConstructor   //constructor sin parametros
@Entity    //la clase se convierte en una entidad
//@Table(name = "productos")  //la tabla llevara este nombre y no el de la clase

public class Producto {
    //@Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nombre;
    private String marca;
    private double precio;
    private String descripcion;
    private String imagenarchivonombre;
    private Date fechacreacion;
    private String estado;
}

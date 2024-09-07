
package web.app.ecomerce.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data  //get  y  set
@AllArgsConstructor  //constructor con parametros
@NoArgsConstructor   //constructor sin parametros
@Entity    //la clase se convierte en una entidad
//@Table(name = "DetalleOrden")  //la tabla llevara este nombre y no el de la clase

public class DetalleOrden {
    
    private Integer id;
    private Integer num_orden;
     private Integer cod_producto;
    private double cantidad;
    private String estado;
    
}

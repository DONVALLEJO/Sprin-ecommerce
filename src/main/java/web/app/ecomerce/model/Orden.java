/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package web.app.ecomerce.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author enman
 */
@Data  //get  y  set
@AllArgsConstructor  //constructor con parametros
@NoArgsConstructor   //constructor sin parametros
@Entity    //la clase se convierte en una entidad
@Table(name = "productos")  //la tabla llevara este nombre y no el de la clase

public class Orden {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    private String numero;
    private Date fechaCreacion;
    private Date fechaRecibido;
    private Double total;
}

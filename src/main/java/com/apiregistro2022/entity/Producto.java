
package com.apiregistro2022.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


//utilizamos Loombok
@Builder //constructor
@NoArgsConstructor //metodo de contructor sin parametros
@AllArgsConstructor //metodo de constructor con parametros
@Data //metodos get y set
//definiendo la persistencia de datos
@Entity(name="Producto")
//se define la tabla de la base de datos
@Table(name="t_producto")
//para qeu sea una clase de sprint tiene que serializar
public class Producto implements Serializable{
    //agregamos el id de la serializacion
    private static final long serialVerison=1L;
    //definir la clave primaria
    @Id
    //define la columna
    @Column(name="codpro")
    private long codigo;
    @Column(name="nompro")
    private String nombre;
    @Column(name="precpro")
    private double preciocompra;
    @Column(name="prevpro")
    private double precioventa;
    @Column(name="canpro")
    private int cantidad;
    @Column(name="estpro")
    private boolean estado;
    @ManyToOne
    @JoinColumn(name="codcat", nullable= false)
    private Categoria categoria;
               
}

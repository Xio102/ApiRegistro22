
package com.apiregistro2022.entity;

//definiendo la entidad en sprint

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Builder;


//definiendo la persistencia de datos
@Entity(name="Categoria")
//se define la tabla de la base de datos
@Table(name="t_categoria")

//para qeu sea una clase de sprint tiene que serializar
@Builder
public class Categoria implements Serializable{
    //agregamos el id de la serializacion
    private static final long serialVerison=1L;

   
    //definir la clave primaria
    @Id
    //define la columna
    @Column(name="codcat")
    private long codigo;
    @Column(name="nomcat")
    private String nombre;
    @Column(name="estcat")
    private boolean estado;

    public Categoria() {
    }

    public Categoria(long codigo, String nombre, boolean estado) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.estado = estado;
    }

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }


               
}

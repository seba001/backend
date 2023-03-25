package com.proyecto.arprog.entidad;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;


@Entity
public class Persona {
    
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;

@NotNull
@Size(min = 1, max = 40, message = "Debe ingresar un nombre")
private String nombre;

@NotNull
@Size(min = 1, max = 40, message = "Debe ingresar un apellido")
private String apellido;

@NotNull
private String descripcion;

private String imagen;


public Persona() {

}


public Persona(String nombre, String apellido, String descripcion, String imagen) {
    this.nombre = nombre;
    this.apellido = apellido;
    this.descripcion = descripcion;
    this.imagen = imagen;
}


public int getId() {
    return id;
}


public void setId(int id) {
    this.id = id;
}


public String getNombre() {
    return nombre;
}


public void setNombre(String nombre) {
    this.nombre = nombre;
}


public String getApellido() {
    return apellido;
}


public void setApellido(String apellido) {
    this.apellido = apellido;
}


public String getDescripcion() {
    return descripcion;
}


public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
}


public String getImagen() {
    return imagen;
}


public void setImagen(String imagen) {
    this.imagen = imagen;
}



}
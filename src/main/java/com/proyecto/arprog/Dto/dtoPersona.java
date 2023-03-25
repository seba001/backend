package com.proyecto.arprog.Dto;


import jakarta.validation.constraints.NotBlank;


public class dtoPersona {
    
@NotBlank
private String nombre;

@NotBlank
private String apellido;

@NotBlank
private String descripcion;

@NotBlank
private String imagen;



public dtoPersona() {

}


public dtoPersona(String nombre, String apellido, String descripcion, String imagen) {
    this.nombre = nombre;
    this.apellido = apellido;
    this.descripcion = descripcion;
    this.imagen = imagen;
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

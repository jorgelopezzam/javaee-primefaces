package com.tecsup.jsfprime.model;

public class Usuario {

    private Long id;

    private String nombre;

    private String apPaterno;
    private String apMaterno;
    private String correo;

    private Rol rol;

    public Usuario(Long id, String nombre, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.apPaterno = descripcion;
    }

    public Usuario(Long id, String nombre, String apPaterno, String apMaterno, String correo) {
        this.id = id;
        this.nombre = nombre;
        this.apPaterno = apPaterno;
        this.apMaterno = apMaterno;
        this.correo = correo;
    }

    public String getApMaterno() {
        return apMaterno;
    }

    public void setApMaterno(String apMaterno) {
        this.apMaterno = apMaterno;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Usuario() {
    }

    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApPaterno() {
        return apPaterno;
    }

    public void setApPaterno(String apPaterno) {
        this.apPaterno = apPaterno;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }
    
    
    

}

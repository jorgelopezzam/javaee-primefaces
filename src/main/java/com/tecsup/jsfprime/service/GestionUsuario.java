/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tecsup.jsfprime.service;

import com.tecsup.jsfprime.model.Rol;
import com.tecsup.jsfprime.model.Usuario;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author PCC
 */
public class GestionUsuario {
    
    public List<Rol> listar() {
        List<Rol> roles = new ArrayList();

        roles.add(new Rol(1l, "Administrador", "Este es el rol de Admin"));
        roles.add(new Rol(2l, "Supervisor", "Este es el rol de Superv"));
        roles.add(new Rol(3l, "Terapeuta", "Este es el rol de Tera"));
        roles.add(new Rol(4l, "Apoderado", "Este es el rol de Apode"));

        return roles;
    }

    public List<Usuario> listarPorRol(Long id) {

        List<Usuario> usuarios = new ArrayList();
        usuarios.add(new Usuario(1l, "Jorge", "Lopez", "Zamarripa", "correox@gmail.com"));
        usuarios.add(new Usuario(2l, "Fernando", "Lopez", "Macetas", "correoa@gmail.com"));
        usuarios.add(new Usuario(3l, "Sonia", "Macetas", "Porras", "correob@gmail.com"));
        usuarios.add(new Usuario(4l, "Camila", "Lopez", "Macetas", "correoc@gmail.com"));
        usuarios.add(new Usuario(5l, "Alondra", "Lopez", "Macetas", "correod@gmail.com"));
        usuarios.add(new Usuario(6l, "Jose", "Lopez", "Zamarripa", "correoe@gmail.com"));
        usuarios.add(new Usuario(7l, "Cesar", "Lopez", "Zamarripa", "correof@gmail.com"));
        usuarios.add(new Usuario(8l, "Marcela", "Lopez", "Zamarripa", "correog@gmail.com"));
        usuarios.add(new Usuario(9l, "Luis", "Lopez", "Estrada", "correoh@gmail.com"));

        List<Usuario> respuesta = new ArrayList();
        switch (id.intValue()) {
            case 1:
                respuesta = usuarios.subList(0, 3);
                break;
            case 2:
                respuesta = usuarios.subList(3, 6);
                break;
            case 3:
                respuesta = usuarios.subList(6, 8);
                break;
            case 4:
                respuesta = usuarios.subList(9, 9);
                break;
            case 0:
                respuesta = usuarios;
        }
        return respuesta;
    }
    
}

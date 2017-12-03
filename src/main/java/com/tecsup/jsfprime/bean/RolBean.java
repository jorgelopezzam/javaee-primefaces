package com.tecsup.jsfprime.bean;

import com.tecsup.jsfprime.model.Rol;
import com.tecsup.jsfprime.model.Usuario;
import com.tecsup.jsfprime.service.GestionUsuario;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import org.primefaces.component.datatable.DataTable;
import org.primefaces.event.CellEditEvent;

@ManagedBean
@RequestScoped
public class RolBean {

    private List<Rol> roles;
    private List<Usuario> usuarios;

    public RolBean() {
        GestionUsuario gestion = new GestionUsuario();
        this.roles = gestion.listar();

        System.out.println("TOTAL ROLES  " + this.roles.size());
    }

    public void cargarUsuarios(Long roles) {
        GestionUsuario gestion = new GestionUsuario();
        this.usuarios = gestion.listarPorRol(roles);

        System.out.println("TOTAL USUARIOS  " + this.usuarios.size());
    }

    public void onCellEdit(CellEditEvent event) {
        Object newValue = event.getNewValue();
        Object oldValue = event.getOldValue();
        DataTable o = (DataTable) event.getSource();
        Rol objeto = (Rol) o.getRowData();
        System.out.println(objeto.getId());
        if (newValue != null && !newValue.equals(oldValue)) {
            FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO,
                    "Actualizado", "Antes: " + oldValue + ", Después:"
                    + newValue
            );
            FacesContext.getCurrentInstance().addMessage(null,
                    msg);
        }
    }

    public List<Rol> getRoles() {
        return roles;
    }

    public void setRoles(List<Rol> roles) {
        this.roles = roles;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

}

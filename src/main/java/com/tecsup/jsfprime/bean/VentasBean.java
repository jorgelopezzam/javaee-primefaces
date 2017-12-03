/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tecsup.jsfprime.bean;

/**
 *
 * @author PCC
 */
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import org.primefaces.model.chart.PieChartModel;

@ManagedBean(name = "ventasBean")
@RequestScoped
public class VentasBean {

    private PieChartModel ventas;

    public VentasBean() {
        ventas = new PieChartModel();
        ventas.set("Adidas", 1200);
        ventas.set("Puma", 1520);
        ventas.set("Sketcher", 890);
        ventas.set("Umbro", 9230);
        
        ventas.setTitle("Chart de Ventas");
        ventas.setLegendPosition("w");
        ventas.setShowDataLabels(true);
    }

    public PieChartModel getVentas() {
        return ventas;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tecnm.oaxaca.dsos.ExamenU1DSOS.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author KEVIN CHAGOYA
 */
@Entity
@Table(name = "indice")
public class ICAModel {

    @Id
    @Column
    private String noControl;
    private char genero;
    private double medidaCintura;
    private double medidaAltura;

    public String getNoControl() {
        return noControl;
    }

    public void setNoControl(String noControl) {
        this.noControl = noControl;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public double getMedidaCintura() {
        return medidaCintura;
    }

    public void setMedidaCintura(double medidaCintura) {
        this.medidaCintura = medidaCintura;
    }

    public double getMedidaAltura() {
        return medidaAltura;
    }

    public void setMedidaAltura(double medidaAltura) {
        this.medidaAltura = medidaAltura;
    }

}

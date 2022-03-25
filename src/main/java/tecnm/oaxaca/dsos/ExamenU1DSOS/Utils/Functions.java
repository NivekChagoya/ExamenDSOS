/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tecnm.oaxaca.dsos.ExamenU1DSOS.Utils;

import java.text.DecimalFormat;
import org.springframework.stereotype.Component;

/**
 *
 * @author KEVIN CHAGOYA
 */
@Component
public class Functions {

    private double ica;
    private String nivel;
    
    DecimalFormat df = new DecimalFormat("###.##");

    public double getIca() {
        return ica;
    }

    public void setIca(double ica) {
        this.ica = ica;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public void calcularICA(double cintura, double altura, char genero) {
        ica = cintura / altura;
        df.format(ica);
        obtenerNivel(genero);
    }

    public void obtenerNivel(char genero) {
        switch (genero) {
            case 'H':
                if (ica < 0.34) {
                    nivel = "Delgadez Severa";
                }
                if (ica >= 0.35 && ica <= 0.42) {
                    nivel = "Delgadez Leve";
                }
                if (ica >= 0.43 && ica <= 0.52) {
                    nivel = "Peso Normal";
                }
                if (ica >= 0.53 && ica <= 0.57) {
                    nivel = "SobrePeso";
                }
                if (ica >= 0.58 && ica <= 0.62) {
                    nivel = "SobrePeso Elevado";
                }
                if (ica >= 0.63) {
                    nivel = "Odesidad morbida";
                }
                break;
            case 'M':
                if (ica <= 0.34) {
                    nivel = "Delgadez Severa";
                }
                if (ica >= 0.35 && ica <= 0.41) {
                    nivel = "Delgadez Leve";
                }
                if (ica >= 0.42 && ica <= 0.48) {
                    nivel = "Peso Normal";
                }
                if (ica >= 0.49 && ica <= 0.53) {
                    nivel = "SobrePeso";
                }
                if (ica >= 0.54 && ica <= 0.57) {
                    nivel = "SobrePeso Elevado";
                }
                if (ica >= 0.58) {
                    nivel = "Odesidad morbida";
                }
                break;
        }
    }
}

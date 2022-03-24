/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package tecnm.oaxaca.dsos.ExamenU1DSOS.Service;

import java.util.List;
import tecnm.oaxaca.dsos.ExamenU1DSOS.Models.ICAModel;

/**
 *
 * @author KEVIN CHAGOYA
 */
public interface ICAService {

    public void createAlumno(ICAModel ica);

    public List getAlumnos();

    public ICAModel getAlumno(String noControl);

    public void updateAlumno(ICAModel icaModel, String noControl);

    public void deleteAlumno(String noControl);

}

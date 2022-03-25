/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tecnm.oaxaca.dsos.ExamenU1DSOS.ImplementService;

import antlr.Utils;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tecnm.oaxaca.dsos.ExamenU1DSOS.Models.ICAModel;
import tecnm.oaxaca.dsos.ExamenU1DSOS.Repository.ICARepository;
import tecnm.oaxaca.dsos.ExamenU1DSOS.Service.ICAService;
import tecnm.oaxaca.dsos.ExamenU1DSOS.Utils.Functions;

/**
 *
 * @author KEVIN CHAGOYA
 */
@Service
public class ICAServiceImplement implements ICAService {

    @Autowired
    private ICARepository icaRepository;
   

    @Override
    public void createAlumno(ICAModel ica) {
        icaRepository.save(ica);
    }

    @Override
    public List getAlumnos() {
        return icaRepository.findAll();
    }

    @Override
    public ICAModel getAlumno(String noControl) {
        return icaRepository.findByNoControl(noControl);
    }

    @Override
    public void updateAlumno(ICAModel icaModel, String noControl) {
        icaModel.setNoControl(noControl);
        icaRepository.save(icaModel);
    }

    @Override
    public void deleteAlumno(String noControl) {
        icaRepository.deleteById(noControl);
    }

}

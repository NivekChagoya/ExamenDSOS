/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tecnm.oaxaca.dsos.ExamenU1DSOS.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tecnm.oaxaca.dsos.ExamenU1DSOS.Service.ICAService;
import tecnm.oaxaca.dsos.ExamenU1DSOS.Models.ICAModel;
import tecnm.oaxaca.dsos.ExamenU1DSOS.Utils.CustomResponse;
import tecnm.oaxaca.dsos.ExamenU1DSOS.Utils.Functions;

/**
 *
 * @author KEVIN CHAGOYA
 */
@RestController
@RequestMapping("/api/v1/indice")
public class ICAController {

    @Autowired
    private ICAService icaService;
    @Autowired
    private Functions calculo;

    //Crear un nuevo dato y validacion de que si ya existe retorne sus valores y en caso de un valor es null mandar mensaje
    @PostMapping("/")
    public CustomResponse createAlumno(@RequestBody ICAModel icaModel) {
        CustomResponse customResponse = new CustomResponse();
        ICAModel alumno = icaService.getAlumno(icaModel.getNoControl());
        if (alumno == null) {
            calculo.calcularICA(icaModel.getMedidaCintura(), icaModel.getMedidaAltura(), icaModel.getGenero());
            customResponse.setData(calculo);
            icaService.createAlumno(icaModel);
        } else {
            if (alumno.getMedidaCintura() == 0 || alumno.getMedidaAltura() == 0) {
                customResponse.setData("No se cuenta con la informacion necesaria para realizar el calculo");
            } else {
                calculo.calcularICA(alumno.getMedidaCintura(), alumno.getMedidaAltura(), alumno.getGenero());
                customResponse.setData(calculo);
            }
        }
        return customResponse;
    }

    @GetMapping("/")
    public CustomResponse getAlumnos() {
        CustomResponse customResponse = new CustomResponse();
        customResponse.setData(icaService.getAlumnos());
        return customResponse;
    }

    @GetMapping("/{noControl}")
    public CustomResponse getAlumno(@PathVariable String noControl) {
        CustomResponse customResponse = new CustomResponse();
        customResponse.setData(icaService.getAlumno(noControl));
        return customResponse;
    }

    @PutMapping("/{noControl}")
    public CustomResponse updateAlumno(@RequestBody ICAModel ica, @PathVariable String noControl) {
        CustomResponse customResponse = new CustomResponse();
        icaService.updateAlumno(ica, noControl);
        return customResponse;
    }

    @DeleteMapping("/{noControl}")
    public CustomResponse deleteAlumno(@PathVariable String noControl) {
        CustomResponse customResponse = new CustomResponse();
        icaService.deleteAlumno(noControl);
        return customResponse;
    }

}

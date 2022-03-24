/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package tecnm.oaxaca.dsos.ExamenU1DSOS.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tecnm.oaxaca.dsos.ExamenU1DSOS.Models.ICAModel;

/**
 *
 * @author KEVIN CHAGOYA
 */
@Repository
public interface ICARepository extends JpaRepository<ICAModel, String> {

    public ICAModel findByNoControl(String noControl);
}

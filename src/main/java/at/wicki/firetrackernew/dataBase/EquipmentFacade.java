/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package at.wicki.firetrackernew.dataBase;

import at.wicki.firetrackernew.entity.Equipment;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceUnit;

/**
 *
 * @author wicki
 */
@Stateless
public class EquipmentFacade extends AbstractFacade<Equipment> {
    
    @PersistenceContext(unitName = "FiretrackerPU")
        private EntityManager em;

    public EquipmentFacade() {
        super(Equipment.class);
    }
    
    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    
}

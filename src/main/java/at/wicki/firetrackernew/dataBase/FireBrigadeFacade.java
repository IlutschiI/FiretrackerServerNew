/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package at.wicki.firetrackernew.dataBase;

import at.wicki.firetrackernew.entity.FireBrigade;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceUnit;

/**
 *
 * @author wicki
 */
@Stateless
public class FireBrigadeFacade extends AbstractFacade<FireBrigade> {

    @PersistenceContext(unitName = "FiretrackerPU")
    EntityManager em;

    public FireBrigadeFacade() {
        super(FireBrigade.class);
    }

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
}

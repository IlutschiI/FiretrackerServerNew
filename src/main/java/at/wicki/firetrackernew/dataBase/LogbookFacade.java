/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package at.wicki.firetrackernew.dataBase;

import at.wicki.firetrackernew.entity.Logbook;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceUnit;

/**
 *
 * @author wicki
 */
@Stateless
public class LogbookFacade extends AbstractFacade<Logbook> {
        @PersistenceContext(unitName = "FiretrackerPU")
    private EntityManager em;

    public LogbookFacade() {
        super(Logbook.class);
    }

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
}

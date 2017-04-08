/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package at.wicki.firetrackernew.dataBase;

import at.wicki.firetrackernew.entity.GpsData;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceUnit;

/**
 *
 * @author wicki
 */
@Stateless
public class GpsDataFacade extends AbstractFacade<GpsData> {

    @PersistenceContext(unitName = "FiretrackerPU")
    private EntityManager em;

    public GpsDataFacade() {
        super(GpsData.class);
    }

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

}

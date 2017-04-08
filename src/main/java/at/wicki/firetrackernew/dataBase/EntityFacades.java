/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package at.wicki.firetrackernew.dataBase;

import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author wicki
 */
@Stateless
public class EntityFacades {
    
    @EJB
    private EquipmentFacade equipmentFacade;
    @EJB
    private FireBrigadeFacade fireBrigadeFacade;
    @EJB
    private FireTruckFacade fireTruckFacade;
    @EJB
    private GpsDataFacade gpsDataFacade;
    @EJB
    private LogbookFacade logbookFacade;
    @EJB
    private RouteFacade routeFacade;

    public EquipmentFacade getEquipmentFacade() {
        return equipmentFacade;
    }

    public FireBrigadeFacade getFireBrigadeFacade() {
        return fireBrigadeFacade;
    }

    public FireTruckFacade getFireTruckFacade() {
        return fireTruckFacade;
    }

    public GpsDataFacade getGpsDataFacade() {
        return gpsDataFacade;
    }

    public LogbookFacade getLogbookFacade() {
        return logbookFacade;
    }

    public RouteFacade getRouteFacade() {
        return routeFacade;
    }
    
    
    
}

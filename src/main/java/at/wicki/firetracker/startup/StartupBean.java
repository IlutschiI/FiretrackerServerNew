/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package at.wicki.firetracker.startup;

import at.wicki.firetrackernew.dataBase.EntityFacades;
import at.wicki.firetrackernew.dataBase.FireBrigadeFacade;
import at.wicki.firetrackernew.entity.FireBrigade;
import at.wicki.firetrackernew.entity.FireTruck;
import at.wicki.firetrackernew.entity.GpsData;
import at.wicki.firetrackernew.entity.Logbook;
import at.wicki.firetrackernew.entity.Route;
import java.util.LinkedList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Singleton;
import javax.ejb.Startup;

/**
 *
 * @author wicki
 */
@Singleton
@Startup
public class StartupBean {
    
    @EJB
    public EntityFacades entityFacades;
    @EJB
    FireBrigadeFacade fbf;
    
    @PostConstruct
    public void startup(){
    
        FireBrigade fireBrigade = new FireBrigade("FF Offenhausen", generateGpsData(0, 0));
        FireTruck fireTruck = new FireTruck(fireBrigade, "LFB-A2");
        Logbook logbook = new Logbook();
        Route route = new Route("Weinberg 1");
        
        List<GpsData> gpsDataList=new LinkedList<>();
        
        for (int i = 0; i < 10; i++) {
            gpsDataList.add(generateGpsData(i/1000, i/1000));
        }
        
        route.setGpsDataList(gpsDataList);
        logbook.getRoutes().add(route);
        fireTruck.setLogBook(logbook);
        fireBrigade.getListOfFiretrucks().add(fireTruck);
        
        
        //entityFacades.getFireBrigadeFacade().create(fireBrigade);
        fbf.create(fireBrigade);
        
    }
    
    
    
    private GpsData generateGpsData(float xModifier,float yModifier){
        
        GpsData gpsData= new GpsData(48.15453637f+xModifier, 13.83548453f+yModifier, 15, System.currentTimeMillis(), 381);
        return gpsData;
    }

    
    
}

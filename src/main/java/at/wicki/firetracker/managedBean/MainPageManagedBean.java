/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package at.wicki.firetracker.managedBean;

import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import org.primefaces.component.gmap.GMap;
import org.primefaces.model.map.DefaultMapModel;
import org.primefaces.model.map.MapModel;

/**
 *
 * @author wicki
 */
@Named(value = "mainPageManagedBean")
@Dependent
public class MainPageManagedBean {

    /**
     * Creates a new instance of MainPageManagedBean
     */
    
    MapModel gmapModel;
    
    public MainPageManagedBean() {
    }
    
    @PostConstruct
    public void init(){
        gmapModel=new DefaultMapModel();
    }

    public MapModel getGmapModel() {
        return gmapModel;
    }

    public void setGmapModel(MapModel gmapModel) {
        this.gmapModel = gmapModel;
    }
    
    
    
}

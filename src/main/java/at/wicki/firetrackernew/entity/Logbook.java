/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package at.wicki.firetrackernew.entity;

import java.util.LinkedList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author wicki
 */
@Entity
public class Logbook extends DBEntity{
    
    @OneToMany(cascade = CascadeType.PERSIST)
    private List<Route> routes;
    @OneToOne
    private FireTruck fireTruck;
    
        private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Logbook() {
        routes=new LinkedList<>();
    }

    public Logbook(FireTruck fireTruck) {
        this();
        this.fireTruck = fireTruck;
    }
    
    

    public List<Route> getRoutes() {
        return routes;
    }

    public void setRoutes(List<Route> routes) {
        this.routes = routes;
    }

    public FireTruck getFireTruck() {
        return fireTruck;
    }

    public void setFireTruck(FireTruck fireTruck) {
        this.fireTruck = fireTruck;
    }
    
    
    
    
}

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

/**
 *
 * @author wicki
 */
@Entity
public class FireBrigade extends DBEntity {

    @OneToMany(cascade = CascadeType.PERSIST)
    private List<FireTruck> listOfFiretrucks;
    
    private String name;
    private GpsData location;
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

    public FireBrigade() {
        listOfFiretrucks=new LinkedList<>();
    }

    public FireBrigade(String name, GpsData location) {
        this();
        this.name = name;
        this.location = location;
    }

    public List<FireTruck> getListOfFiretrucks() {
        return listOfFiretrucks;
    }

    public void setListOfFiretrucks(List<FireTruck> listOfFiretrucks) {
        this.listOfFiretrucks = listOfFiretrucks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GpsData getLocation() {
        return location;
    }

    public void setLocation(GpsData location) {
        this.location = location;
    }
    
    
    
}

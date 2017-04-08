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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author wicki
 */
@Entity
public class Route extends DBEntity{
    
    @OneToMany(cascade = CascadeType.PERSIST)
    private List<GpsData> gpsDataList;
    @ManyToOne
    private Logbook logBook;
    private String destinationLocationName;
    
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

    public Route() {
        gpsDataList=new LinkedList<>();
    }

    public Route(String destinationLocationName) {
        this();
        this.destinationLocationName = destinationLocationName;
        
    }

    public List<GpsData> getGpsDataList() {
        return gpsDataList;
    }

    public void setGpsDataList(List<GpsData> gpsDataList) {
        this.gpsDataList = gpsDataList;
    }

    public String getDestinationLocationName() {
        return destinationLocationName;
    }

    public void setDestinationLocationName(String destinationLocationName) {
        this.destinationLocationName = destinationLocationName;
    }
    
    
    
}

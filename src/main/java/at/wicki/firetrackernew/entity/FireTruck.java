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
import javax.persistence.OneToOne;

/**
 *
 * @author wicki
 */
@Entity
public class FireTruck extends DBEntity {
    
    @ManyToOne(cascade = CascadeType.PERSIST)
    private FireBrigade fireBrigare;
       
   // @OneToMany(cascade = CascadeType.PERSIST)
   // private List<Equipment> equipmentList;
    
    @OneToOne(cascade = CascadeType.PERSIST)
    private Logbook logBook;
    
    @OneToOne(cascade = CascadeType.PERSIST)
    private GpsData currentPosition;

    private String name;
    
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

    public FireTruck() {
        //equipmentList=new LinkedList<>();
        logBook=new Logbook();
    }

    public FireTruck(FireBrigade fireBrigare, String name) {
        this();
        this.fireBrigare = fireBrigare;
        this.name = name;
        currentPosition=fireBrigare.getLocation();
    }

    public FireBrigade getFireBrigare() {
        return fireBrigare;
    }

    public void setFireBrigare(FireBrigade fireBrigare) {
        this.fireBrigare = fireBrigare;
    }

    /*public List<Equipment> getEquipmentList() {
        return equipmentList;
    }

    public void setEquipmentList(List<Equipment> equipmentList) {
        this.equipmentList = equipmentList;
    }*/

    public Logbook getLogBook() {
        return logBook;
    }

    public void setLogBook(Logbook logBook) {
        this.logBook = logBook;
    }

    public GpsData getCurrentPosition() {
        return currentPosition;
    }

    public void setCurrentPosition(GpsData currentPosition) {
        this.currentPosition = currentPosition;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
}

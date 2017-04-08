/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package at.wicki.firetracker.managedBean;

import at.wicki.firetrackernew.dataBase.EntityFacades;
import at.wicki.firetrackernew.entity.FireBrigade;
import java.util.LinkedList;
import java.util.List;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.ApplicationScoped;
import javax.faces.model.SelectItem;
import org.primefaces.model.NestedSelectItem;

/**
 *
 * @author wicki
 */
@Named(value = "IndexManagedBean")
@ApplicationScoped
public class IndexManagedBean {

    /**
     * Creates a new instance of IndexManagedBean
     */
    @EJB
    EntityFacades entityFacade;

    public IndexManagedBean() {
    }

    public String getFireBrigadeName() {
        return entityFacade.getFireBrigadeFacade().findAll().get(0).getName();
    }

    public List<SelectItem> getFireBrigades() {
        List<SelectItem> items = new LinkedList<>();

        for (FireBrigade firebrigade : entityFacade.getFireBrigadeFacade().findAll()) {
            NestedSelectItem item = new NestedSelectItem();
            item.setDescription(firebrigade.getName());
            item.setLabel(firebrigade.getName());
            item.setValue(firebrigade);
            items.add(item);
        }

        return items;
    }
    
    public void onButtonClick(){
        
    }

}

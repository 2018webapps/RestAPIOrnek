/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import model.Sehir;

/**
 *
 * @author asimsinanyuksel
 */
public class ComboBoxYonetici {
    private ArrayList<Sehir> sehirler;
    
    private JComboBox sehirlerListe;
   
    public ComboBoxYonetici(JComboBox sehirlerListe){
    this.sehirlerListe=sehirlerListe;
   
    }
    
    public void icerikOlustur(){
                for(int i=0;i<sehirler.size();i++) {
                   Sehir sehir=sehirler.get(i);
                    sehirlerListe.addItem(sehir);
                }           
    }

    /**
     * @return the sehirler
     */
    public ArrayList<Sehir> getSehirler() {
        return sehirler;
    }

    /**
     * @param sehirler the sehirler to set
     */
    public void setSehirler(ArrayList<Sehir> sehirler) {
        this.sehirler = sehirler;
    }

 
   
    
}

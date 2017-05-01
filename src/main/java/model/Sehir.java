/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 *
 * @author asimsinanyuksel
 */
public class Sehir implements Serializable{
private String alternatifHadiseIstNo;
private String boylam;
private String enlem;
private String gunlukTahminIstNo;
private String il;
private String ilPlaka;
private String ilce;
private String merkezId;
private String oncelik;
private String saatlikTahminIstNo;
private String sondurumIstNo;
private String yukseklik;

    /**
     * @return the alternatifHadiseIstNo
     */
    public String getAlternatifHadiseIstNo() {
        return alternatifHadiseIstNo;
    }

    /**
     * @param alternatifHadiseIstNo the alternatifHadiseIstNo to set
     */
    public void setAlternatifHadiseIstNo(String alternatifHadiseIstNo) {
        this.alternatifHadiseIstNo = alternatifHadiseIstNo;
    }

    /**
     * @return the boylam
     */
    public String getBoylam() {
        return boylam;
    }

    /**
     * @param boylam the boylam to set
     */
    public void setBoylam(String boylam) {
        this.boylam = boylam;
    }

    /**
     * @return the enlem
     */
    public String getEnlem() {
        return enlem;
    }

    /**
     * @param enlem the enlem to set
     */
    public void setEnlem(String enlem) {
        this.enlem = enlem;
    }

    /**
     * @return the gunlukTahminIstNo
     */
    public String getGunlukTahminIstNo() {
        return gunlukTahminIstNo;
    }

    /**
     * @param gunlukTahminIstNo the gunlukTahminIstNo to set
     */
    public void setGunlukTahminIstNo(String gunlukTahminIstNo) {
        this.gunlukTahminIstNo = gunlukTahminIstNo;
    }

    /**
     * @return the il
     */
    public String getIl() {
        return il;
    }

    /**
     * @param il the il to set
     */
    public void setIl(String il) {
        this.il = il;
    }

    /**
     * @return the ilPlaka
     */
    public String getIlPlaka() {
        return ilPlaka;
    }

    /**
     * @param ilPlaka the ilPlaka to set
     */
    public void setIlPlaka(String ilPlaka) {
        this.ilPlaka = ilPlaka;
    }

    /**
     * @return the ilce
     */
    public String getIlce() {
        return ilce;
    }

    /**
     * @param ilce the ilce to set
     */
    public void setIlce(String ilce) {
        this.ilce = ilce;
    }

    /**
     * @return the merkezId
     */
    public String getMerkezId() {
        return merkezId;
    }

    /**
     * @param merkezId the merkezId to set
     */
    public void setMerkezId(String merkezId) {
        this.merkezId = merkezId;
    }

    /**
     * @return the oncelik
     */
    public String getOncelik() {
        return oncelik;
    }

    /**
     * @param oncelik the oncelik to set
     */
    public void setOncelik(String oncelik) {
        this.oncelik = oncelik;
    }

    /**
     * @return the saatlikTahminIstNo
     */
    public String getSaatlikTahminIstNo() {
        return saatlikTahminIstNo;
    }

    /**
     * @param saatlikTahminIstNo the saatlikTahminIstNo to set
     */
    public void setSaatlikTahminIstNo(String saatlikTahminIstNo) {
        this.saatlikTahminIstNo = saatlikTahminIstNo;
    }

    /**
     * @return the sondurumIstNo
     */
    public String getSondurumIstNo() {
        return sondurumIstNo;
    }

    /**
     * @param sondurumIstNo the sondurumIstNo to set
     */
    public void setSondurumIstNo(String sondurumIstNo) {
        this.sondurumIstNo = sondurumIstNo;
    }

    /**
     * @return the yukseklik
     */
    public String getYukseklik() {
        return yukseklik;
    }

    /**
     * @param yukseklik the yukseklik to set
     */
    public void setYukseklik(String yukseklik) {
        this.yukseklik = yukseklik;
    }

    @Override
    public String toString() {
        return il; //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.webscrappercake.entity;

/**
 *
 * @author Prabhat
 */
public class Cake {
    private String cakeTitle;
    private float cakePrice;

    public Cake() {
    }

    public Cake(String cakeTitle, float cakePrice) {
        this.cakeTitle = cakeTitle;
        this.cakePrice = cakePrice;
    }

    public String getCakeTitle() {
        return cakeTitle;
    }

    public void setCakeTitle(String cakeTitle) {
        this.cakeTitle = cakeTitle;
    }

    public float getCakePrice() {
        return cakePrice;
    }

    public void setCakePrice(float cakePrice) {
        this.cakePrice = cakePrice;
    }

    @Override
    public String toString() {
        return "Cake{" + "cakeTitle=" + cakeTitle + ", cakePrice=" + cakePrice + '}';
    }
    
    public String toCSV() { 
        return cakeTitle + "," + cakePrice + "\r\n";
    }
    
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.webscrappercake.Sellerfactory;

import com.leapfrog.webscrappercake.util.CakeData;
import java.util.Scanner;

/**
 *
 * @author Prabhat
 */
public class Arranger implements Scrapper{

    @Override
    public void scrapWebPage(Scanner scanner) {
        CakeData cakeData = new CakeData();
        cakeData.orderData();
    }
    
}

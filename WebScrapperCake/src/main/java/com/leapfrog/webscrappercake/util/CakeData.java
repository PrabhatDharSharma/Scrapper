/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.webscrappercake.util;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

/**
 *
 * @author Prabhat
 */
public class CakeData {

    public void orderData() {
        try {
            List<String> listCake = CSVHandler.readFile("D:\\cake.csv");
            StringTokenizer tokens;
            HashMap<String, Float> mapCake = new HashMap<String, Float>();
            for (String s : listCake) {
                tokens = new StringTokenizer(s, ",");
                mapCake.put(tokens.nextToken(), Float.parseFloat(tokens.nextToken()));
            }
            Map<String, Float> sortedMapCake = SortMapByValue.sortByValue(mapCake);
            displayMapCakeData(sortedMapCake);

        } catch (IOException ex) {
            ex.getMessage();
        }
    }

    public void displayMapCakeData(Map<String, Float> sortedMap) {

        
        System.out.println("The price of the cakes are in descending order.");
        System.out.print("===========================================================================");
        System.out.println("===========================================================================");
        System.out.println("    Cakes                                     ||                                  Prices(Descending)");
        System.out.print("===========================================================================");
        System.out.println("===========================================================================");
        for (Map.Entry<String, Float> entry : sortedMap.entrySet()) {

            System.out.println(entry.getKey() + "                                      ||                     " + entry.getValue() + "||");
            System.out.print("=======================================================================");
            System.out.println("===========================================================================");

        }
    }
}

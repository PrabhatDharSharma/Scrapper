/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.webscrappercake.Sellerfactory;

import java.util.HashMap;

/**
 *
 * @author Prabhat
 */
public class SellerFactory {
    private static HashMap<String,Scrapper> sellerList = initSellerList();
    
    public static HashMap<String,Scrapper> initSellerList(){
        sellerList = new HashMap<>();
        sellerList.put("1", new MeroShoppingScrapping());
        sellerList.put("2", new BhatBhateni());
        sellerList.put("3", new Arranger());
        sellerList.put("4", new ExitScrapper());
        return sellerList;
    }
    public static Scrapper get(String key){
      if(sellerList.containsKey(key)){
          return sellerList.get(key);
      }
      return null;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.webscrappercake;

import com.leapfrog.webscrappercake.Sellerfactory.Scrapper;
import com.leapfrog.webscrappercake.Sellerfactory.SellerFactory;
import java.util.Scanner;

/**
 *
 * @author Prabhat
 */
public class Program {
      public static void menu(){
          System.out.println("=================================");
          System.out.println("Welcome to Web Scrapper ---> Cake");
          System.out.println("=================================");
          System.out.println("1.https://www.meroshopping.com/cake");
          System.out.println("2.http://www.bhatbhatenionline.com/374-cakes");
          System.out.println("3.Get the ordered price data of the cakes of the vendors you selected.");
          System.out.println("4.Exit");
          System.out.println("Enter your choice fron where you want to import cake prices :[1-3]");
      }

    public static void main(String[] args) {
        while(true){
            menu();
            Scanner scanner = new Scanner(System.in);
            Scrapper scp = SellerFactory.get(scanner.next());
            scp.scrapWebPage(scanner);
        }
        
        
        
        
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.webscrappercake.util;

import java.util.Scanner;

/**
 *
 * @author Prabhat
 */
public class ExitApp {
    public static void exitApp(Scanner scanner){
    System.out.println("Do you really want to exit[Y/N]?");
        if(scanner.next().equalsIgnoreCase("y")){
            scanner.close();
            System.exit(0);
        }
    }
}

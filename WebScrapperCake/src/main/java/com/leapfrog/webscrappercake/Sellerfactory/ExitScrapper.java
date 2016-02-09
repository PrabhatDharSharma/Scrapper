/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.webscrappercake.Sellerfactory;

import com.leapfrog.webscrappercake.util.ExitApp;
import java.util.Scanner;

/**
 *
 * @author Prabhat
 */
public class ExitScrapper implements Scrapper{

    @Override
    public void scrapWebPage(Scanner scanner) {
        ExitApp.exitApp(scanner);
    }
    
}

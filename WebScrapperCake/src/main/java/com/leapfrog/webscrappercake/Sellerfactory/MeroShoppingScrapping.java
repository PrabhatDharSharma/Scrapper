/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.webscrappercake.Sellerfactory;

import com.leapfrog.webscrappercake.DAO.impl.CakeDAOImpl;
import com.leapfrog.webscrappercake.entity.Cake;
import com.leapfrog.webscrappercake.util.CSVHandler;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Prabhat
 */
public class MeroShoppingScrapping implements Scrapper {

    @Override
    public void scrapWebPage(Scanner scanner) {
        System.out.println("The scrapper has started...");
        System.out.println("Scrapping https://www.meroshopping.com/cake Please wait... ");
        StringBuilder builder = CSVHandler.getContent("https://www.meroshopping.com/cake");
        String regEx = "<div class=\"prname\">(.*?)</div>(.*?)<div class=\"price\">(.*?)</div>";
        Pattern pattern = Pattern.compile(regEx);
        Matcher matcher = pattern.matcher(builder.toString());
        CakeDAOImpl impl = new CakeDAOImpl();
        while (matcher.find()) {
            Cake cake = new Cake(matcher.group(1).trim(), Integer.parseInt(matcher.group(3).trim().substring(4)));
            impl.insert(cake);
        }
        System.out.println("Scrapping successful !");
        impl.export("CakePrice", "meroshoppingDotCom");
        System.out.println("Exported the data to D:\\meroshoppingDotCom.csv and D:\\cake.csv");
        //System.out.println(builder.toString());

    }

}

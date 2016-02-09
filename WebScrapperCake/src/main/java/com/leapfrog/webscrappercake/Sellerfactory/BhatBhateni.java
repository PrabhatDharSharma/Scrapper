/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.webscrappercake.Sellerfactory;

import com.leapfrog.webscrappercake.DAO.impl.CakeDAOImpl;
import com.leapfrog.webscrappercake.entity.Cake;
import com.leapfrog.webscrappercake.util.CSVHandler;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Prabhat
 */
public class BhatBhateni implements Scrapper {

    @Override
    public void scrapWebPage(Scanner scanner) {
        System.out.println("The scrapper has started...");
        System.out.println("Scrapping http://www.bhatbhatenionline.com/374-cakes Please wait... ");
        StringBuilder builder = CSVHandler.getContent("http://www.bhatbhatenionline.com/374-cakes");
        //System.out.println(builder.toString());
        String regEx = "<a class=\"product-name\"(.*?)>(.*?)</a>(.*?)<span itemprop=\"price\" class=\"price product-price\">(.*?)</span>";
        Pattern pattern = Pattern.compile(regEx);
        Matcher matcher = pattern.matcher(builder.toString());
        CakeDAOImpl impl = new CakeDAOImpl();
        while (matcher.find()) {
            Cake cake = new Cake(matcher.group(2).trim(), Integer.parseInt(matcher.group(4).trim().substring(4).replace(",", "")));
            //System.out.println(cake.toCSV());
            impl.insert(cake);
        }
        System.out.println("Scrapping successful !");
        impl.export("CakePrice", "bhatbhatenionlineDotCom");
        System.out.println("Exported the data to D:\bhatbhatenionlineDotCom.csv and and D:\\cake.csv");

    }
}

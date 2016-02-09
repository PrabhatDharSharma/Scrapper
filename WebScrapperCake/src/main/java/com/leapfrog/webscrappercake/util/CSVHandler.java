/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.webscrappercake.util;

import com.leapfrog.webscrappercake.entity.Cake;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Prabhat
 */
public class CSVHandler {
    
    
    // Read csv file and return the file contents as a list.
    public static List<String> readFile(String path) throws IOException {
        List<String> records = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(new File(path)));
        String line ="";
        while((line=reader.readLine())!=null){
            records.add(line);
        }
        reader.close();
        
        return records;
    }
    
    public static void writeRecordToFile(String fileName,List<Cake> cakeList,String seller) throws IOException{
        String path = "D:\\"+ fileName + seller +".csv";
        StringBuilder builder = new StringBuilder();
        for(Cake cake : cakeList){
            builder.append(cake.toCSV());
        }
        FileWriter writer = new FileWriter(new File(path),true);
        writer.write(builder.toString());
        writer.close();
        
    }
    
    public static StringBuilder getContent(String weburl){
          try{
            URL url = new URL(weburl);
            URLConnection conn = url.openConnection();
            conn.setReadTimeout( 8000 );
            
            BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String line = "";
            StringBuilder builder = new StringBuilder();
            
            while ((line = reader.readLine()) != null) {
                builder.append(line);
                
            }
            
            return builder;
            
          }catch(IOException e){
              e.getMessage();
              
          }
          return null;
          
          
    }
          
}

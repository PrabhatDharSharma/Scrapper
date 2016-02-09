/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.webscrappercake.DAO.impl;

import com.leapfrog.webscrappercake.DAO.CakeDAO;
import com.leapfrog.webscrappercake.entity.Cake;
import com.leapfrog.webscrappercake.util.CSVHandler;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Prabhat
 */
public class CakeDAOImpl implements CakeDAO{
    List<Cake> cakeList = new ArrayList<>();
    @Override
    public void insert(Cake t) {
        cakeList.add(t);
    }

    @Override
    public List<Cake> getAll() {
        return cakeList;
    }

    @Override
    public void export(String fileName,String seller) {
        try {
            CSVHandler.writeRecordToFile(fileName, cakeList,seller);
            CSVHandler.writeRecordToFile("cake", cakeList, "");
        } catch (IOException ex) {
            System.out.println("Failed to write the record !");
        }
    }
    
}

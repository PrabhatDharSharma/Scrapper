/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.webscrappercake.DAO;

import java.util.List;

/**
 *
 * @author Prabhat
 */
public interface GenericDAO<T> {
    void insert(T t);
    List<T> getAll();
    void export(String fileName,String seller);
    
    
}

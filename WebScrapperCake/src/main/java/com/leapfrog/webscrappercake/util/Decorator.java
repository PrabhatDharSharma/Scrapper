/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.webscrappercake.util;

/**
 *
 * @author Prabhat
 */
public class Decorator {
    public static String decorator(int i){
        StringBuilder builder = new StringBuilder();
        for(i=0;i<10;i++){
            builder.append(" ");
        }
       return builder.toString();
    }
    
}

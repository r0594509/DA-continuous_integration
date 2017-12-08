/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ucll.reviewservice.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;

/**
 *
 * @author Nathan
 */
public class ReviewRepository {
    
    private HashMap<Integer, ArrayList<String>> map;
    
    public ReviewRepository() {
        this.map = new HashMap<>();
        populateHashMap();
    }
    
    public void add(int postalCode, String info) {
        this.map.get(postalCode).add(info);
    }
    
    public Collection<String> getInfo(int postalCode) throws Exception {
        if (this.map.get(postalCode) == null)
            throw new Exception();
        return this.map.get(postalCode);
    }
    
    //1000, 8620, 2000, 3000, 4900
    private void populateHashMap() {
        this.map.put(1000, new ArrayList<>(Arrays.asList("++", "++")));
        this.map.put(8620, new ArrayList<>(Arrays.asList("++", "--")));
        this.map.put(2000, new ArrayList<>(Arrays.asList("++", "++")));
        this.map.put(3000, new ArrayList<>(Arrays.asList("--", "--")));
        this.map.put(4900, new ArrayList<>(Arrays.asList("++", "--")));
    }
}
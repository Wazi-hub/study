package com.collection;

import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String,Integer>  useValues = new HashMap<String, Integer>();
        useValues.put("hai",1);
        useValues.replace("hai",useValues.get("hai")+1);
        System.out.println(useValues);
    }
}

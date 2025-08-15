package com.common.collection.map.hashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String,String> phoneBook = new HashMap<>();
        phoneBook.put("Rahim", "01126888948");
        phoneBook.put("korim", "01226888948");
        phoneBook.put("Faruk", "01326888948");
        phoneBook.put("Talukdar", "01426888948");


        if(phoneBook.containsKey("korim")){
            System.out.println("Number : " + phoneBook.get("korim"));
        }
        if(phoneBook.containsValue("01426888948")){
            for(Map.Entry<String, String> s :  phoneBook.entrySet()){
                if(s.getValue().equals("01426888948")){
                    System.out.println("Name : " + s.getKey());
                }
            }
        }

        phoneBook.put("korim","01626888948");

        phoneBook.remove("Rahim");

        System.out.println(phoneBook);


    }
}

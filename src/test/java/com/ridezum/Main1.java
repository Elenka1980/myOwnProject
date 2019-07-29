package com.ridezum;

import java.util.ArrayList;

public class Main1 {
    public static void main(String[] args) {


        ArrayList<String>array = new ArrayList<String>();

        array.add("Hello");
        array.add("Java");
        array.add("Hi");
        array.add("Selenium");
        array.add("Test");
    /*
        for(int i = 0; i < array.size(); i++) {
            System.out.println(array.get(i));


     */

         for(String element: array) {
             System.out.println(element);
        }

    }
}

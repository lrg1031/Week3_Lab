package com.mycompany.week_3_lab;

public class week3_lab {
    
    public int getCharAmount(String s1){
        return s1.length();
    }
    
    public static void main(String[] args) {
     
        week3_lab nc = new week3_lab();
        String string = "Hello";
        int x = nc.getCharAmount(string);
        System.out.println(x);
        
    }    
    
}

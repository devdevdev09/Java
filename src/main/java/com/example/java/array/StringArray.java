package com.example.java.array;

public class StringArray {
    public static void main(String[] args) {
        StringArray st = new StringArray();
        st.strToStrArr();
    }   
    
    public void strToStrArr(){
        String str = "toArr";
        String[] strArr = str.split("");

        System.out.println("arr size : " + strArr.length);
        
        for(String s : strArr){
            System.out.print("[" + s + "] ");
        }
    }
}
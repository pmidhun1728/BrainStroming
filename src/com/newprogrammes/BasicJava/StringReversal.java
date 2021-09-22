package com.newprogrammes.BasicJava;


public class StringReversal {

    public static void main(String[] args) {
        String s = "Midhun";
        for (int i= s.length()-1; i>=0; i--){

            StringBuffer sb= new StringBuffer(s);
            System.out.println(sb.reverse());
        }

    }
}
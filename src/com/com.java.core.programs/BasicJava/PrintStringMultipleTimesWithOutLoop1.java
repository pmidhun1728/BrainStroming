package com.newprogrammes.BasicJava;

public class PrintStringMultipleTimesWithOutLoop1 {

 //  private static Object String;

    public static void main(String[] args) {


        
String st = "Midhun";
String i = "M";

i = i.replaceAll("M", "MMMMMMMMMM");
i = i.replaceAll("M", "MMMMMMMMMM");
i = i.replaceAll("M", "MMMMMMMMMM");

i= i.replaceAll("M", st + "\n");
        System.out.println(i);


    }
}

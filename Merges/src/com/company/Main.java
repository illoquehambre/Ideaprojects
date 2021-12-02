package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int a=24, suma=0;
        int [] array =new int[3];
       for (int i=0;i<array.length;i++){
           suma=a+suma;
           array[i]=suma;
           System.out.println(array[i]);
       }

    }
}

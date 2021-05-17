package com.company.recurssion;

public class recurssion {

    public static void main(String[]args){
        printOut("Hi", 10);

    }

    public static void printOut(String str, int n){
        //base case
        if(n == 0){
            System.out.println("Done Printing");
        }

        //recursive case
        else{
            System.out.println(str);
            //decrement n to reach base case (stops infinite loops)
            n--;
            printOut(str,n);
        }
    }

}

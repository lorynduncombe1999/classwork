package com.company.controlflow;

public class AboutIfElseAndMore {
    public static void main(String[] args){

        boolean b1 = true;
        if(b1){
            System.out.println("its true");
        }
        else{
            System.out.println("Its  false");
        }
        //ternary operators
        //var = (express)? true(cond1):false(cond2);
        String str = b1? "it's true": "its false";
        System.out.println(str);

        int numOne =10;
        int numTwo = 120;
        int numThree = 230;

        int result = (numOne>numTwo)? numOne: numTwo;
        System.out.println(result);

        int temp = (result>numThree)? result:numThree;
        System.out.println(temp);

    }
}

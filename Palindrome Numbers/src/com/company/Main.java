package com.company;


public class Main {

    public static void main(String[] args) {

    isPalindrome(257);



    }


    public static boolean isPalindrome (int number) {
        int lastDigit;
        int reverse = 0;
        int nextNumber = number;

        while (nextNumber > 0 || nextNumber < 0){
            lastDigit = nextNumber % 10; // this takes the 1 out from 1221
            // divides number by 10 so we can find the next number in the next iteration
            nextNumber /= 10;
            // The reverse variable takes the digit from LASTDIGIT, then multiplies it by 10
            //then adds it back on
            //example(number = 1221):  1221 take 1 away, store that 1 in a variable
            //then multiply it by 10
            //then the second will take the 2 off
            //then it will add it on the 10 so 12
            //then the next number will be 2
            //the 12 will be multiplied again by 10
            //so 120, then the 2 we got will be added
            //so it will be 122, this is then multiplied again
            //so then 1220, then add the final digit which is 1
            reverse = (reverse * 10) + lastDigit;
        }


        if (number == reverse) {
            System.out.println( number + " is the same as " + reverse);
            return true;

        } else {
            System.out.println(number + " is NOT the same as " + reverse);
            return false;

        }
    }



}

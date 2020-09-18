package com.company;

public class Main {

    public static void main(String[] args) {
	sumFirstAndLastDigit(8);
    }

    public static int sumFirstAndLastDigit(int number) {
        if (number == 0) {
            System.out.println("no number initiated");
            return 0;
        } else if (number <= 9 && number > 0) {
            System.out.println(number + number);
            return number + number;
        } else if (number < 0) {
            return -1;
        }

        //here we are assigning first digit with the number value so that
        //we can use this variable to divide by 10
        int firstDigit = number;
        //----------------------------------------------------------------------
        //What we are doing with last digit is that we are KEEPING the last digit
        //we are essentially removing it from the sum
        //this helps with wittling it down by using the modulo remainder the first number to its final
        //singular digit
        int lastDigit = number % 10;
        //----------------------------------------------------------------------
        //anything below 10 will not execute the loop rather a if then statement will
        //deal with the value above
        while (firstDigit >= 10) {
            //this will keep dividing until it hits a single value
            firstDigit /= 10; // divides the number by 10 so that we reach first number
        }

        //printing values
        System.out.println(firstDigit + lastDigit);
        //returning value
        return  firstDigit + lastDigit;
    }
}

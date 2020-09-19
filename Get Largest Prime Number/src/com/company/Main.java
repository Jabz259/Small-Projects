package com.company;

public class Main {

    public static void main(String[] args) {

        getLargestPrime(45);

    }

    public static int getLargestPrime (int number) {

        //validating input
        if (number <= 1) {
            System.out.println("Invalid");
            return -1;
        }
        //creating a variable to store prime numbers
        int largestPrimNum = 0;
        //for loop which will test every value with number
        //so that it is a factor of number
        for (int i =1; i <= number; i++) {
            //storing a boolean value
            boolean primeNum = true;
            //if there is a factor of number then
            //execute next loop
            if (number % i == 0) {
                //beginning from 2, we will test each
                //successful i value
                //this will use the modulo operator: i % j until there are no remainders
                //if there is no remainders
                //boolean value will be set to false
                for (int j = 2; j < i; j++) {
                    //reason why j must be smaller than i
                    //is because each i value will be testing using modulo remainder (j)
                    //up until it is at the i value
                    //example: 5--> 2 % 5 --> 3 % 5 --> 4 % 5 --> = stop
                    if (i % j == 0) {
                        //prime num will check if each index of j is a possible divisor
                        primeNum=false;
                    }
                }
                //if the number does not have a divisor apart from 1 and itself
                //and it is not false from the previous if statmenet
                //then store i into largestPrimeNum Variable
                //return value
                if(primeNum) {
                    largestPrimNum = i;
                    System.out.println(largestPrimNum);
                }
            }
        }
        return largestPrimNum;

    }

}

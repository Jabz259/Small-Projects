package com.company;

public class Main {

    public static void main(String[] args) {

        getLargestPrime(45);

    }


    //hey
    public static int getLargestPrime(int number) {

        //normal error handling
        if (number <= 1) {
            return -1;
            //if any numbers lower than 10 is a prime
        } else if (number < 10 && number % 2 != 0 || number == 2) {
            System.out.println(number);
            return number;
        }

        //verifying if the supplied number is just a prime
        //for larger integers
        for (int  i = 2; i <=100; i ++) {
            boolean primeNum = true;

            for (int j = 2; j <i; j++) {
                if (i%j == 0) {
                    primeNum = false;
                    break;
                }
            }
            if (primeNum && number == i) {
                System.out.println(number);
                return number;
            }
        }

        //count variable
        int count = 0;
        //creating first loop
        for (int i = 0; i < 100; i++) {
            //incrementing count
            count++;
            //checking the factors of number
            if (number % count == 0) {
                //if there are multiple factors then we
                //will check and see if there any prime numbers
                //which can make up the number again e.g 3 x 7 = 21
                 for (int j = 2; j < i; j ++) {
                     //if count x j not equal to number then it is not a prime number
                     if (count * j != number){
                         continue;
                     //otherwise it is fine to print and return
                     } else {

                         System.out.println(count);
                         return count;
                         }


                     }
                 }

            }

        return -1;
        }


    }




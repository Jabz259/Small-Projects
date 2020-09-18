package com.company;

public class Main {

    public static void main(String[] args) {

        canPack(6,2,17);

    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        int bigNum;
        int smallNum;
        int sumNum;

        bigNum = bigCount * 5;
        smallNum = 1 * smallCount;
        sumNum = bigNum + smallNum;


        if (sumNum == goal) {
            System.out.println(" 1 Full Package = " + (bigNum + smallNum) + " Kg " + " Big Package = " + bigCount + " Kg "
                    + " and Small Package = " + smallCount + " kg");
            return true;

        } else if (bigNum == goal && smallNum == 0) {
            System.out.println(" 2 Full Package = " + (bigNum + smallNum) + " Kg " + " Big Package = " + bigCount + " Kg "
                    + " and Small Package = " + smallCount + " kg");
            return true;

        } else if (smallNum >= goal && bigNum == 0) {
            System.out.println(" 3 Full Package = " + (bigNum + smallNum) + " Kg " + " Big Package = " + bigCount + " Kg "
                    + " and Small Package = " + smallCount + " kg");
            return true;

        } else if ((bigNum < goal) && ((bigNum + smallNum) > goal)) {
            System.out.println(" 4 Full Package = " + (bigNum + smallNum) + " Kg " + " Big Package = " + bigCount + " Kg "
                    + " and Small Package = " + smallCount + " kg");
            return true;

        } else if (bigNum % goal == 0 && bigNum > smallNum) {
            System.out.println(" 5 Full Package = " + (bigNum + smallNum) + " Kg " + " Big Package = " + bigCount + " Kg "
                    + " and Small Package = " + smallCount + " kg");
            return true;

        } else if (smallCount > bigCount) {
            //if smallCount is bigger than BigCount
            while (bigCount > 0) {
                //decrement big count
                bigCount--;
                //add 5 on top of smallCount
                smallCount += 5;
                //if small count turns out to be bigger than the goal
                //then stop
                if (smallCount > goal) {
                    System.out.println(" 5 Full Package = " + (bigNum + smallNum) + " Kg " + " Big Package = " + bigCount + " Kg "
                            + " and Small Package = " + smallCount + " kg");
                    return true;
                }
            }
        } else if (bigCount > smallCount) {
            //reset bigNum
            //so any previous values assigned to it is gone
            //reusing variables for less clutter
            bigNum =0;
            while (bigCount > 0) {
                //decrement bigCount
                bigCount --;
                //each number we recieve we will multiply it again
                bigNum = bigCount * 5;
                //add smallcount to each bigNum value until we reach the goal number
                //this means that we do not have to convert any of the bigCount into smaller ones
                //instead just count down til we reach the goal with no bigCount remainders
                if ((bigNum + smallCount) == goal) {
                    System.out.println(" 6 Full Package = " + (bigNum + smallNum) + " Kg " + " Big Package = " + bigCount + " Kg "
                            + " and Small Package = " + smallCount + " kg");
                    return true;
                }
            }

        } else {
            return false;
        }

        return false;
    }
}

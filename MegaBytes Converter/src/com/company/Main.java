package com.company;

public class Main {

    public static void main(String[] args) {

    printMegaBytesAndKiloBytes(-1);

    }

    public static void printMegaBytesAndKiloBytes (int kiloBytes) {

        //XX = Kilobytes
        //YY = megabytes
        //ZZ = remaining kilobytes
         if (kiloBytes >= 0) {
                int remainderByte = (kiloBytes % 1024);
                int megaByte = (kiloBytes - remainderByte) / 1000 ;
                System.out.println(kiloBytes + " KB = " + megaByte + " MB and " + remainderByte +" KB");
        } else {
               System.out.println("Invalid Value");
        }

    }

}

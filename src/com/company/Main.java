package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {

    public static long distance(String first, String second){

        return Math.abs(ipLength(second)-ipLength(first));
    }
    public static long ipLength(String a){
        long lengthOfIp = 0;
        for(String dist : a.split("[.]") ){
            lengthOfIp = 256 * lengthOfIp + Long.parseLong(dist);
        }
        return lengthOfIp;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Please provide first IPv4 adress:");
            String first = scanner.next();
            System.out.println("Please provide second adress:");
            String second = scanner.next();
            System.out.println(distance(first, second));
        } catch (InputMismatchException e){
            System.out.print("Wrong format");
        }

        scanner.close();
    }
}

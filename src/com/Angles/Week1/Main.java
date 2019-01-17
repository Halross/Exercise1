//Connor Angles | 1/17/19 | CSCI 1660
package com.Angles.Week1;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        System.out.println("What is your city?");
        String city = input.nextLine();
        System.out.println("What is your zipcode?");
        int zipCode = input.nextInt();
        System.out.println("What are the next 5 days' temperatures?");
        double temperatures[] = {0,0,0,0,0};
        for( int i = 0; i<=4; i++){
            int day = i+1;
            System.out.println("Day " + day + ":");
            temperatures[i] = input.nextDouble();
        }
        double averageTemp = (temperatures[0]+temperatures[1]+temperatures[2]+temperatures[3]+temperatures[4])/5;
        System.out.println(averageTemp);
    }
}

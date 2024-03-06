package com.jetbrain;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	int num1;
	Scanner OddOrEven= new Scanner(System.in);
	System.out.println("Please enter the number you wish to determine as odd or even");
	num1=OddOrEven.nextInt();
	if(num1 % 2 == 0)
	    System.out.println("The entered number is even.");
	else
	    System.out.println("The entered number is odd.");
    }
}

package com.game;
import java.util.*;
public class RockpaperSci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    System.out.println("=== Rock-Paper-Scissors ==="+"\n"+"1. Play Game"+"\n"+"2. View Score"+
	"\n"+"3. Exit");
	    System.out.println("enter the your choice :");
	    int choice = sc.nextInt();
	    switch(choice) {
	    case 1 :System.out.println("Play Game");
	            break;
	    case 2 :System.out.println("your score");
	            break;
	    case 3: System.out.println("Exit from Game");
	            break;
	    default : System.out.println("enter valid choice");        
	    }
	    
         
	}

}

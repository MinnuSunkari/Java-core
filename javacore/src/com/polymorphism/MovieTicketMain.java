package com.polymorphism;

public class MovieTicketMain {

	public static void main(String[] args) {
		MovieTicket m= new MovieTicket();
		int n= m.bookTicket(2);
		int k=m.bookTicket(2, true);
		double l=m.bookTicket(1,false,50);
		System.out.println(n);
		System.out.println(k);
		System.out.println(l);

	}

}

package com.polymorphism;

public class MovieTicket {
	
public int bookTicket(int tickets) {
	return 200*tickets;
}
public int bookTicket(int tickets, boolean isPremium) {
	if(isPremium) {
		return 350*tickets;
	}
	return 200*tickets;
}
public double bookTicket(int tickets,boolean isPremium,double discount) {
	if(isPremium) {
		int amt = 350*tickets;
		return amt-(350*tickets*(discount/100));
	}
	int a=200*tickets;
	return a-(200*tickets*(discount/100));
}

}

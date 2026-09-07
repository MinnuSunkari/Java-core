package com.encapsulation;

public class MovieTts {
  private String movie_name;
  private int num_tickets;
  private int ticket_price;
  public void setMovieName(String movie_name) {
	  this.movie_name=movie_name;
  }
  public void setNumTickets(int num_tickets) {
	  this.num_tickets=num_tickets;
  }
  public void setTicketPrice(int ticket_price) {
	  this.ticket_price=ticket_price;
  }
  public String  getMovieName() {
	  return movie_name;
  }
  public int getNumTickets() {
	  return num_tickets;
  }
  public int getTicketPrice() {
	  return ticket_price;
  }
  
}

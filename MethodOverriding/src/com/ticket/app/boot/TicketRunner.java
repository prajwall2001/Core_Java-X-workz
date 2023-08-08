package com.ticket.app.boot;

import com.ticket.app.DiscountedTicket;
import com.ticket.app.Ticket;

public class TicketRunner {
	public static void main(String[] args) {
        System.out.println("Invoking main in TicketRunner");
        Ticket discountedTicket = new DiscountedTicket();
        discountedTicket.applyDiscount();
}
}
package com.ticket.app;

public class DiscountedTicket extends Ticket {
	@Override

    public void applyDiscount() {
        System.out.println("Applying discount to the ticket.");
    }
}

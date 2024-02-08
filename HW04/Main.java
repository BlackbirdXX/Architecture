package HW04;

public class Main {
    public static void main(String[] args) {
        TicketProvider newtickets = new TicketProvider();
        Customer user1 = new Customer(1);
        Ticket selectedTicket = user1.searchTicket(newtickets.getTickets());
        user1.buy(selectedTicket, newtickets);
    }   
}

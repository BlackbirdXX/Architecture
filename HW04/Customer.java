package HW04;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    int id;
    List<Ticket> purchasedTickets = new ArrayList<>();
    CashProvider cashProvider;

    public Customer(int id){
        this.id = id;
        this.cashProvider = new CashProvider(12345);
    }

   public void buy(Ticket ticket, TicketProvider tickets){
        for (int i = 0; i < tickets.getTickets().size(); i++) {
            if (ticket.rootNumber == tickets.getTickets().get(i).rootNumber) {
                tickets.updateTicketStatus(i);
            }
        }
        if(cashProvider.buyTicket(50)){
            purchasedTickets.add(ticket);
            System.out.println("Билет куплен");
        }
        else{
            System.out.println("Не достаточно средств");
        }
   }

   public void repeal(Ticket ticket){
        if(cashProvider.repealTicket()){
            System.out.println("Билет сдан");
        }
        else{
            System.out.println("Билет уже не вернуть");
        }
   }

   public Ticket searchTicket(List<Ticket> tickets){
        return tickets.get(3);
   }
}

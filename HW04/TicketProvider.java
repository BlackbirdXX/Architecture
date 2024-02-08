package HW04;

import java.util.ArrayList;
import java.util.List;

public class TicketProvider {

    List<Ticket> tickets = new ArrayList<>();


    public TicketProvider(){
        for (int i = 0; i < 10; i++) {
            this.tickets.add(new Ticket(i, i)); 
        }
    }
    public List<Ticket> getTickets(){
        return this.tickets;
    }

    public void updateTicketStatus(int rootNumber){
        tickets.get(rootNumber).isValid = false;
    }
}

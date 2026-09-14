public class use_case5 {
    public static void main(String[] args) {
        TicketCounter counter = new TicketCounter();
 
        Thread t1 = new Thread(counter, "Counter-1");
        Thread t2 = new Thread(counter, "Counter-2");
        t2.setPriority(10);
        t1.setName("Counter1");
        t2.setName("Counter2");
        t1.start();
        t2.start();
 
        // TODO: set t1 priority to Thread.MAX_PRIORITY
        // TODO: start both threads
    }
}


class TicketCounter implements Runnable{
    int availabletickets = 3;
    synchronized void bookedTicket(){
        if(availabletickets>0){
            availabletickets = availabletickets-1;
            System.out.println("Ticket booked by" + Thread.currentThread().getName());
            System.out.println("left tickets are" + availabletickets);
        }
        else{
            System.out.println("Tickets are sold out");
        }
    }

public void run(){
    while (availabletickets > 0) {
        bookedTicket();
    }
}
}

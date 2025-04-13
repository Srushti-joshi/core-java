package external;


    public class ConcertTicket extends Ticket {
        public void VIPAccess() {
            System.out.println("ConcertTicket: Provides VIP access to special areas.");
        }

        @Override
        public void validate() {
            System.out.println("ConcertTicket: Validates entry for a concert event.");
        }
    }

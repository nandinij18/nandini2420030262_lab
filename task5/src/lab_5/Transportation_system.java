package lab_5;
class Transport {
    public void ticketPrice() {
        System.out.println("Ticket price for transport varies.");
    }
}
class Bus extends Transport {
    @Override
    public void ticketPrice() {
        System.out.println("Bus ticket price: ₹100");
    }
}
class Train extends Transport {
    @Override
    public void ticketPrice() {
        System.out.println("Train ticket price: ₹150");
    }
}
public class Transportation_system {
    public static void main(String[] args) {
        Transport myBus = new Bus();
        Transport myTrain = new Train();
        myBus.ticketPrice();
        myTrain.ticketPrice();
    }
}

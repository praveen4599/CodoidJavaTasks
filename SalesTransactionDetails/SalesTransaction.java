package SalesTransactionDetails;

import TransportDetails.Transport;

public class SalesTransaction {

    private Transport transport;
    private int quantity;

    public SalesTransaction(Transport transport, int quantity) {
        this.transport = transport;
        this.quantity = quantity;
    }

    public double getTotalPrice() {
        return transport.getPrice() * quantity;
    }

    public void displayTransactionDetails() {
        System.out.println("Transport Type: " + transport.getTransportType());
        System.out.println();
        System.out.println("Price per unit: Rs " + transport.getPrice());
        System.out.println();
        System.out.println("Quantity: " + quantity);
        System.out.println();
        System.out.println("Total Price: Rs " + getTotalPrice());
        System.out.println("**********************************************************************************************");
        System.out.println();
    }
}

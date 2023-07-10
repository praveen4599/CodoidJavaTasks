
package SalesTransactionDetails;

import TransportDetails.Transport;

public class Order {
    private int orderId;
    private Transport transport;
    private int quantity;

    public Order(int orderId, Transport transport, int quantity) {
        this.orderId = orderId;
        this.transport = transport;
        this.quantity = quantity;
    }

    public double getOrderTotal() {
        return transport.getPrice() * quantity;
    }

    public void displayOrderDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println();
        System.out.println("Transport Type: " + transport.getTransportType());
        System.out.println();
        System.out.println("Price per unit: Rs " + transport.getPrice());
        System.out.println();
        System.out.println("Quantity: " + quantity);
        System.out.println();
        System.out.println("Order Total: Rs " + getOrderTotal());
        System.out.println();
    }
}

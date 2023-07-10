package TransportDetails;

import SalesTransactionDetails.SalesTransaction;
import SalesTransactionDetails.Order;

public class Main {
    public static void main(String[] args) {
        Transport transport = new Transport("Car", 5000.0);
        SalesTransaction transaction = new SalesTransaction(transport, 3);

        transaction.displayTransactionDetails();
        
        Order order = new Order(1, transport, 5);
        order.displayOrderDetails();
    }
}

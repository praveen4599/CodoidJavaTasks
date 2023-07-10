package TransportDetails;

public class Transport {
    private String transportType;
    private double price;

    public Transport(String transportType, double price) {
        this.transportType = transportType;
        this.price = price;
    }

    public String getTransportType() {
        return transportType;
    }

    public double getPrice() {
        return price;
    }
}

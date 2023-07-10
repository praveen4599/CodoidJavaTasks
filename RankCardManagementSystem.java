
class RankCard {

    // use protected inorder to use these fields in its inherited classes

    protected String name;
    protected int points;

    public RankCard(String name, int points) {
        this.name = name;
        this.points = points;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Points: " + points);
    }
}

class GoldCard extends RankCard {
    private double discountRate;

    public GoldCard(String name, int points, double discountRate) {
        super(name, points); // call base class constructor using super keyword
        this.discountRate = discountRate;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Discount Rate: " + discountRate);
    }
}

class SilverCard extends RankCard {
    private String benefits;

    public SilverCard(String name, int points, String benefits) {
        super(name, points);
        this.benefits = benefits;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Benefits: " + benefits);
    }
}

class BronzeCard extends RankCard {
    private int bonusPoints;

    public BronzeCard(String name, int points, int bonusPoints) {
        super(name, points);
        this.bonusPoints = bonusPoints;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Bonus Points: " + bonusPoints);
    }
}

public class RankCardManagementSystem {
    public static void main(String[] args) {

        RankCard rankCard1 = new GoldCard("John Doe", 1000, 0.1);
        RankCard rankCard2 = new SilverCard("Jane Smith", 500, "Free shipping");
        RankCard rankCard3 = new BronzeCard("Alice Johnson", 200, 50);

        rankCard1.displayInfo();
        System.out.println();

        rankCard2.displayInfo();
        System.out.println();

        rankCard3.displayInfo();
        System.out.println();
    }
}

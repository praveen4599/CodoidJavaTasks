interface Vehicle {
    void start();
    
    default void stop() { // default method
        System.out.println("Vehicle stopped."); 
        // If dont give the default keyword for the stop function it will considered as it as default
    }
}

class Car implements Vehicle {
    
    String nameOfOwner = "Praveen Raj N"; // Defeault variable - type String
    @Override
    public void start() {
        System.out.println("Car started.");
    }
}

public class CarFunctionality {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();
        car.stop();
        System.out.println("Name of the owner: " + car.nameOfOwner);
        System.out.println();

        int day = 5;
        String dayName;

        // When none of the cases match the value being evaluated, the code inside the default block is executed. 
        switch (day) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            default:
                dayName = "Other day";
                break;
        }

        System.out.println("Today is " + dayName);

            }
}


    /* 1. The default access modifier is accessible within the package only.
       2. the default method or variable can't be allowed to use private access modifier.
     */
    
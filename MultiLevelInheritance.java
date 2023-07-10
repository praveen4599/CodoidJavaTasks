class UniqEmployee{

    public void analytical(){
        System.out.println("I had analytical skill");
    }

    public void problem_solving(){
        System.out.println("Good in Problem Solving");
    }
}

class Dev extends UniqEmployee{

    private int salary = 20000;

    public void frontend(){
        System.out.println("Front end Developer");
    }

    public void backend(){
        System.out.println("Back end Developer");
    }

    public void getSalary(){
        System.out.println("Salary of a Developer is: " + salary);
    }

}

class Tester extends UniqueEmployee{

    private int salary = 15000;

    public void manualTesting(){
        System.out.println("Manual Tester");
    }

    public void automationTesting(){
        System.out.println("Automation Tester");
    }

    public void getSalary(){
        System.out.println("Salary of a Tester is: " + salary);
    }

}

public class MultiLevelInheritance {
    
    public static void main(String[] args){

        Dev d = new Dev();
        d.analytical();
        d.problem_solving();
        d.frontend();
        d.backend();
        d.getSalary();

        Tester t = new Tester();
        t.analytical();
        t.problem_solving();
        t.manualTesting();
        t.automationTesting();
        t.getSalary();

        // Tester t1 = new UniqueEmployee(); // error message deliverd
        // t1.automationTesting();

        /* 
        Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
        Type mismatch: cannot convert from UniqueEmployee to Tester

        at MultiLevelInheritance.main(MultiLevelInheritance.java:66)
        */
    }
}


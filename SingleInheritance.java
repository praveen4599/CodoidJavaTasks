class UniqueEmployee{

    public void analytical(){
        System.out.println("I had analytical skill");
    }

    public void problem_solving(){
        System.out.println("Good in Problem Solving");
    }
}

class Developer extends UniqueEmployee{

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


public class SingleInheritance {
    
    public static void main(String[] args){

        Developer d = new Developer();
        d.analytical();
        d.problem_solving();
        d.frontend();
        d.backend();
        d.getSalary();
    }
}

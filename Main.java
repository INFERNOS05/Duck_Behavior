// Main.java
// Sehajdeep Singh Sikka
// 23070126119
// AIML B2

// The Main class is responsible for testing and displaying the behavior of different types of ducks.
public class Main {

    // The main method where the program starts execution.
    public static void main(String[] args) {
        // Creating instances of different types of ducks.
        Duck mallard = new MallardDuck(); // MallardDuck with flying, swimming, and quacking behaviors.
        Duck redhead = new RedheadDuck(); // RedheadDuck with flying, swimming, and quacking behaviors.
        Duck rubber = new RubberDuck(); // RubberDuck with no flying, floating, and squeaking behaviors.
        Duck decoy = new DecoyDuck(); // DecoyDuck with no flying, swimming (drowning), and no quacking behaviors.
        
        // Displaying the behavior of each duck by calling the displayDuckBehavior method.
        displayDuckBehavior(mallard);
        displayDuckBehavior(redhead);
        displayDuckBehavior(rubber);
        displayDuckBehavior(decoy);
    }

    // The displayDuckBehavior method is responsible for displaying the behavior of each duck.
    // It accepts a Duck object, performs the duck's actions, and displays its behavior.
    private static void displayDuckBehavior(Duck duck) {
        // Printing the name of the duck and its behavior.
        System.out.println("\n" + duck.getClass().getSimpleName() + " behavior:");
        
        // Performing and displaying the behavior for flying, swimming, and quacking.
        duck.performFly(); // Executes the duck's flying behavior.
        duck.performSwim(); // Executes the duck's swimming behavior.
        duck.performQuack(); // Executes the duck's quacking behavior.
        
        // Displaying the unique description of the duck.
        duck.display(); // Executes the duck's display method (specific to each type of duck).
    }
}


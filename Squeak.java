// Squeak.java

// This is the Squeak class. It implements the QuackBehavior interface.
// It represents a specific quacking behavior where the entity makes a squeaking sound.
public class Squeak implements QuackBehavior {
    
    // The quack() method provides the implementation of the quack behavior.
    // In this case, the entity squeaks, so it outputs a "Squeak!" sound.
    @Override
    public void quack() {
        // Printing a message that represents the squeaking sound
        System.out.println("Squeak! Squeak!");
    }
}


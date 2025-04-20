// Quack.java

// This class implements the QuackBehavior interface.
// It represents a specific quacking behavior where the entity can quack normally.
public class Quack implements QuackBehavior {
    
    // The quack() method provides the implementation of the quack behavior.
    // In this case, the entity quacks normally, so it outputs a "Quack!" sound.
    @Override
    public void quack() {
        // Printing a message that represents a normal quacking sound
        System.out.println("Quack! Quack!");
    }
}


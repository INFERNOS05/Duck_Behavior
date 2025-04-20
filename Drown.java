// Drown.java

// This class implements the SwimBehavior interface.
// It represents a specific swimming behavior where the entity "drowns" instead of swimming.
public class Drown implements SwimBehavior {
    
    // The swim() method provides the implementation of the swim behavior.
    // In this case, it simulates the behavior of drowning.
    @Override
    public void swim() {
        // Printing a message that represents the drowning action
        System.out.println("Oh! I'm drowning!");
    }
}


// Swim.java

// This class implements the SwimBehavior interface, defining a specific behavior for swimming.
// The Swim class represents the action of swimming, fulfilling the contract specified by SwimBehavior interface.
public class Swim implements SwimBehavior {
    
    // The swim() method provides the implementation of the swim behavior.
    // This method outputs a message indicating the entity can swim.
    @Override
    public void swim() {
        // Printing a message that represents the swimming action
        System.out.println("I can swim.");
    }
}


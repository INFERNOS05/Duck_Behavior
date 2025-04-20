// FloatSwim.java

// This class implements the SwimBehavior interface.
// It defines a specific swimming behavior where the entity can only float, but cannot swim.
public class FloatSwim implements SwimBehavior {
    
    // The swim() method provides the implementation of the swim behavior.
    // In this case, it simulates floating on water rather than actual swimming.
    @Override
    public void swim() {
        // Printing a message that represents the floating action
        System.out.println("I can only float :(");
    }
}


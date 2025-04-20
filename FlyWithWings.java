// FlyWithWings.java

// This class implements the FlyBehavior interface.
// It represents a specific flying behavior where the entity can fly using wings.
public class FlyWithWings implements FlyBehavior {
    
    // The fly() method provides the implementation of the fly behavior.
    // In this case, the entity can fly using wings, so it outputs a message indicating this.
    @Override
    public void fly() {
        // Printing a message that represents the flying action with wings
        System.out.println("I believe I can fly.");
    }
}


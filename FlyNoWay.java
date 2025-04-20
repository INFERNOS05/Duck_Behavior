// FlyNoWay.java

// This class implements the FlyBehavior interface.
// It represents a specific flying behavior where the entity cannot fly.
public class FlyNoWay implements FlyBehavior {
    
    // The fly() method provides the implementation of the fly behavior.
    // In this case, the entity cannot fly, so it outputs a message indicating this.
    @Override
    public void fly() {
        // Printing a message that represents the inability to fly
        System.out.println("I cannot fly :( ");
    }
}


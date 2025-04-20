// DecoyDuck.java

// The DecoyDuck class extends the Duck class, representing a specific type of Duck.
// This class configures the behaviors for the DecoyDuck, which doesn't fly, doesn't swim properly, and is mute.
public class DecoyDuck extends Duck {
    
    // Constructor for the DecoyDuck class.
    // It initializes the specific behaviors for this type of Duck.
    public DecoyDuck() {
        // The DecoyDuck cannot fly, so we set the fly behavior to FlyNoWay.
        flyBehavior = new FlyNoWay();
        
        // The DecoyDuck cannot swim, it "drowns" instead, so we set the swim behavior to Drown.
        swimBehavior = new Drown();
        
        // The DecoyDuck doesn't quack, so we set the quack behavior to MuteQuack.
        quackBehavior = new MuteQuack();
    }

    // The display() method provides a specific description for the DecoyDuck.
    // This is a unique implementation for DecoyDuck, as it overrides the display method from Duck class.
    public void display() {
        // Printing a message specific to DecoyDuck
        System.out.println("I am a Decoy Duck.");
    }
}


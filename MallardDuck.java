// MallardDuck.java

// The MallardDuck class extends the Duck class, representing a specific type of Duck.
// This class configures the behaviors for the MallardDuck, including flying with wings, swimming, and quacking.
public class MallardDuck extends Duck {
    
    // Constructor for the MallardDuck class.
    // It initializes the specific behaviors for this type of Duck.
    public MallardDuck() {
        // The MallardDuck can fly using wings, so we set the fly behavior to FlyWithWings.
        flyBehavior = new FlyWithWings();
        
        // The MallardDuck can swim, so we set the swim behavior to Swim.
        swimBehavior = new Swim();
        
        // The MallardDuck quacks, so we set the quack behavior to Quack.
        quackBehavior = new Quack();
    }

    // The display() method provides a specific description for the MallardDuck.
    // This is a unique implementation for MallardDuck, overriding the display method from the Duck class.
    public void display() {
        // Printing a message specific to MallardDuck
        System.out.println("I am a Mallard Duck.");
    }
}


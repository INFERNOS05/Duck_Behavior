// RubberDuck.java

// This is the RubberDuck class. It extends the Duck class and represents a specific type of duck.
// The RubberDuck has specific behaviors for not flying, floating in water, and squeaking.
public class RubberDuck extends Duck {
    
    // Constructor for the RubberDuck class.
    // It initializes the specific behaviors for this type of Duck.
    public RubberDuck() {
        // The RubberDuck cannot fly, so we set the fly behavior to FlyNoWay.
        flyBehavior = new FlyNoWay();
        
        // The RubberDuck floats on water, so we set the swim behavior to FloatSwim.
        swimBehavior = new FloatSwim();
        
        // The RubberDuck squeaks, so we set the quack behavior to Squeak.
        quackBehavior = new Squeak();
    }

    // The display() method provides a specific description for the RubberDuck.
    // This is a unique implementation for RubberDuck, overriding the display method from the Duck class.
    public void display() {
        // Printing a message specific to RubberDuck
        System.out.println("I am a Rubber Duck.");
    }
}


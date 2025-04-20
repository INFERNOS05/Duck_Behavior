// RedheadDuck.java

// This is the RedheadDuck class. It extends the Duck class and represents a specific type of duck.
// The RedheadDuck has specific behaviors for flying with wings, swimming, and quacking.
public class RedheadDuck extends Duck {
    
    // Constructor for the RedheadDuck class.
    // It initializes the specific behaviors for this type of Duck.
    public RedheadDuck() {
        // The RedheadDuck can fly using wings, so we set the fly behavior to FlyWithWings.
        flyBehavior = new FlyWithWings();
        
        // The RedheadDuck can swim, so we set the swim behavior to Swim.
        swimBehavior = new Swim();
        
        // The RedheadDuck quacks, so we set the quack behavior to Quack.
        quackBehavior = new Quack();
    }

    // The display() method provides a specific description for the RedheadDuck.
    // This is a unique implementation for RedheadDuck, overriding the display method from the Duck class.
    public void display() {
        // Printing a message specific to RedheadDuck
        System.out.println("I am a Redhead Duck.");
    }
}


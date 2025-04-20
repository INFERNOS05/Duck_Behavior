// Duck.java

// This is the abstract Duck class, serving as the superclass for all types of ducks.
// It defines the common behaviors (fly, swim, quack) and an abstract display method for subclasses to implement.
public abstract class Duck {
    
    // Behavior objects that define the flying, swimming, and quacking behavior of the duck.
    // These can be modified by the subclass to specify different behaviors for different types of ducks.
    FlyBehavior flyBehavior;
    SwimBehavior swimBehavior;
    QuackBehavior quackBehavior;

    // Method to perform the fly action.
    // Delegates the actual flying behavior to the flyBehavior object, which implements the fly action.
    public void performFly() {
        // Calling the fly method from the FlyBehavior interface
        flyBehavior.fly();
    }

    // Method to perform the swim action.
    // Delegates the actual swimming behavior to the swimBehavior object, which implements the swim action.
    public void performSwim() {
        // Calling the swim method from the SwimBehavior interface
        swimBehavior.swim();
    }

    // Method to perform the quack action.
    // Delegates the actual quacking behavior to the quackBehavior object, which implements the quack action.
    public void performQuack() {
        // Calling the quack method from the QuackBehavior interface
        quackBehavior.quack();
    }

    // Abstract method for displaying a description of the duck.
    // This method must be implemented by subclasses to provide a specific description.
    public abstract void display();
}


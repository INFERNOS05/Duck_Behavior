// MuteQuack.java

// This class implements the QuackBehavior interface.
// It represents a specific quacking behavior where the entity cannot quack and is mute.
public class MuteQuack implements QuackBehavior {
    
    // The quack() method provides the implementation of the quack behavior.
    // In this case, the entity is mute, so it outputs a message indicating this.
    @Override
    public void quack() {
        // Printing a message that represents the inability to quack
        System.out.println("I'm Mute");
    }
}


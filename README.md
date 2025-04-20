# Duck_Behavior
# Duck Simulation Project

## Overview

This project simulates different types of ducks, each with its own behavior for flying, swimming, and quacking. The project demonstrates the use of the **Strategy Pattern**, where behaviors such as flying, swimming, and quacking are defined as interfaces and can be implemented differently for different types of ducks.

The project includes multiple classes representing different duck types (e.g., MallardDuck, RedheadDuck, RubberDuck, DecoyDuck) and behaviors such as flying, swimming, and quacking.

## Features

- **Strategy Pattern**: Behaviors for flying, swimming, and quacking are defined as interfaces and implemented by concrete classes. This allows dynamic behavior changes.
- **Different Duck Types**: There are different duck types with unique combinations of behaviors:
  - **MallardDuck**: A duck that can fly, swim, and quack.
  - **RedheadDuck**: A duck that can fly, swim, and quack.
  - **RubberDuck**: A duck that cannot fly, can only float, and squeaks.
  - **DecoyDuck**: A duck that cannot fly, swims poorly (drowns), and is mute.

## Classes and Interfaces

### Duck Class
The `Duck` class is an abstract class that serves as a base for all types of ducks. It contains references to the behaviors (flying, swimming, and quacking) and abstract methods that allow different duck types to display their behavior.

### Behavior Interfaces

- **FlyBehavior**: An interface defining the `fly()` method, which can be implemented by various classes such as `FlyWithWings` or `FlyNoWay`.
- **SwimBehavior**: An interface defining the `swim()` method, with implementations such as `Swim` (normal swimming), `FloatSwim` (floating), and `Drown` (drowning).
- **QuackBehavior**: An interface defining the `quack()` method, with implementations like `Quack` (normal quacking), `MuteQuack` (no quacking), and `Squeak` (squeaky sound).

### Duck Subclasses

- **MallardDuck**: A duck that can fly, swim, and quack. It extends the `Duck` class.
- **RedheadDuck**: A duck that can fly, swim, and quack. It extends the `Duck` class.
- **RubberDuck**: A duck that cannot fly, only floats, and squeaks. It extends the `Duck` class.
- **DecoyDuck**: A duck that cannot fly, drowns when swimming, and is mute. It extends the `Duck` class.

### Behavior Implementations

- **FlyWithWings**: A behavior where the duck can fly using its wings.
- **FlyNoWay**: A behavior where the duck cannot fly.
- **Swim**: A behavior where the duck can swim normally.
- **FloatSwim**: A behavior where the duck can only float in water.
- **Drown**: A behavior where the duck drowns when attempting to swim.
- **Quack**: A behavior where the duck quacks normally.
- **MuteQuack**: A behavior where the duck is mute and does not quack.
- **Squeak**: A behavior where the duck makes a squeaking sound instead of quacking.

### Main Class

The `Main` class demonstrates the behavior of different ducks by creating instances of each duck type and displaying their actions (flying, swimming, and quacking). It uses the `displayDuckBehavior()` method to print the behavior of each duck.

## How to Run

# 1. Clone the repository:
   ```bash
   git clone https://github.com/yourusername/duck-simulation.git
 ```

# 2. Navigate to the project directory:
 ```cd duck-simulation
 ```

# 3. Compile the Java files:
 ```javac *.java
 ```

# 4. Run the program:
 ```java Main
 ```
## Example Output

MallardDuck behavior:
I believe I can fly.
I can swim.
Quack! Quack!
I am a Mallard Duck.

RedheadDuck behavior:
I believe I can fly.
I can swim.
Quack! Quack!
I am a Redhead Duck.

RubberDuck behavior:
I cannot fly :( 
I can only float :(
Squeak! Squeak!
I am a Rubber Duck.

DecoyDuck behavior:
I cannot fly :( 
Oh! I'm drowning!
Im Mute
I am a Decoy Duck.

## Project Structure
├── Duck.java           # Abstract Duck class
├── DuckBehavior.java   # Behavior interface for flying, swimming, and quacking
├── FlyBehavior.java    # Interface for fly behaviors
├── SwimBehavior.java   # Interface for swim behaviors
├── QuackBehavior.java  # Interface for quack behaviors
├── MallardDuck.java    # MallardDuck class
├── RedheadDuck.java    # RedheadDuck class
├── RubberDuck.java     # RubberDuck class
├── DecoyDuck.java      # DecoyDuck class
├── FlyWithWings.java   # FlyWithWings behavior
├── FlyNoWay.java       # FlyNoWay behavior
├── Swim.java           # Swim behavior
├── FloatSwim.java      # FloatSwim behavior
├── Drown.java          # Drown behavior
├── Quack.java          # Quack behavior
├── MuteQuack.java      # MuteQuack behavior
├── Squeak.java         # Squeak behavior
├── Main.java           # Main class to demonstrate duck behaviors

## Contributing

1. Fork the repository.
2. Create your branch (git checkout -b feature-name).
3. Commit your changes (git commit -am 'Add new feature').
4. Push to the branch (git push origin feature-name).
5. Create a new Pull Request.

## License

This project is licensed under the MIT License - see the LICENSE file for details.

This `README.md` file includes sections like:

- **Overview**: A brief introduction to the project.
- **Features**: Describes key features of the project, including the Strategy Pattern.
- **Classes and Interfaces**: Explains the main classes and behavior interfaces used in the project.
- **How to Run**: Instructions on how to set up and run the project.
- **Example Output**: Provides sample output of the program.
- **Project Structure**: Lists the files and their purpose.
- **Contributing**: Guidelines for contributing to the project.
- **License**: Information about the license (MIT).


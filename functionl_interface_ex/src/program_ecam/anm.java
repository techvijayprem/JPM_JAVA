abstract class Animals {
    abstract void cats();
    abstract void dogs();
}

// Class Cats that extends Animals and implements the cats method
class Cats extends Animals {
    @Override
    void cats() {
        System.out.println("Cats meow");
    }

    // Since dogs method is abstract in Animals, it must be implemented or declared abstract
    @Override
    void dogs() {
     }
}

// Class Dogs that extends Animals and implements the dogs method
class Dogs extends Animals {
    @Override
    void cats() {
        // This class does not handle cats, so we'll leave it empty or can throw an exception
    }

    @Override
    void dogs() {
        System.out.println("Dogs bark");
    }
}

// Main class to test the implementation
public class anm {
    public static void main(String[] args) {
        // Create an object of Cats class and call its method
        Cats cat = new Cats();
        cat.cats();

         Dogs dog = new Dogs();
        dog.dogs();
    }
}

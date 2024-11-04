package animales;

/**
 * Represents a dog (Perro) with an additional attribute to indicate if it is a
 * purebred.
 * Extends the `Animal` class to inherit common attributes like age.
 */
public class Perro extends Animal {
    private boolean puraRaza; // Indicates if the dog is a purebred

    /**
     * Constructs a Perro instance with a specified age and purebred status.
     *
     * @param edad     The age of the dog, inherited from the Animal class.
     * @param puraRaza A boolean indicating if the dog is a purebred.
     */
    public Perro(int edad, boolean puraRaza) {
        setEdad(edad); // Set the age using the setter method from the Animal class
        this.puraRaza = puraRaza;
    }

    /**
     * Checks if the dog is a purebred.
     *
     * @return true if the dog is a purebred, false otherwise.
     */
    public boolean esPuraRaza() {
        return puraRaza;
    }
}

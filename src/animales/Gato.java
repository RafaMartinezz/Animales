package animales;

/**
 * Represents a cat (Gato) with an additional attribute to indicate if it is of
 * European breed.
 * Extends the `Animal` class to inherit common attributes like age.
 */
public class Gato extends Animal {
    private boolean razaEuropea; // Indicates if the cat is of European breed

    /**
     * Constructs a Gato instance with a specified age and breed type.
     *
     * @param edad        The age of the cat, inherited from the Animal class.
     * @param razaEuropea A boolean indicating if the cat is of European breed.
     */
    public Gato(int edad, boolean razaEuropea) {
        setEdad(edad); // Set the age using the setter method from the Animal class
        this.razaEuropea = razaEuropea;
    }

    /**
     * Checks if the cat is of European breed.
     *
     * @return true if the cat is of European breed, false otherwise.
     */
    public boolean esRazaEuropea() {
        return razaEuropea;
    }
}

import animales.*;

/**
 * Main class that demonstrates the use of `Perro` and `Gato` classes.
 * Creates instances of these animal classes, sets attributes like age and breed
 * type,
 * and prints details about each animal.
 */
public class Main {
    public static void main(String[] args) {
        // Create a dog (Perro) instance with age and breed information
        Perro canKan = new Perro(16, true); // true indicates purebred

        // Create a cat (Gato) instance with age and breed information
        Gato cati = new Gato(13, false); // false indicates not of European breed

        // Print details about the dog
        System.out.println("Edad canKan: " + canKan.getEdad() + " Es pura raza canKan: " + canKan.esPuraRaza());

        // Print details about the cat
        System.out.println("Edad cati: " + cati.getEdad() + " cati es raza europea: " + cati.esRazaEuropea());
    }
}

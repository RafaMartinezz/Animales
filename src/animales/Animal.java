package animales;

/**
 * Represents a general animal with a specific age.
 * Provides a method to set the age, with a maximum limit of 15 years.
 * This class serves as a base class for other specific types of animals.
 */
public class Animal {
    private int edad; // Age of the animal

    /**
     * Retrieves the age of the animal.
     *
     * @return The age of the animal as an integer.
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Sets the age of the animal, with a maximum limit of 15 years.
     * If the provided age exceeds 15, it is capped at 15.
     *
     * @param edad The age to set for the animal.
     */
    public void setEdad(int edad) {
        if (edad > 15) {
            this.edad = 15; // Cap the age at 15 years
        } else {
            this.edad = edad;
        }
    }
}

package src;

public class Musician {
    private String name;
    private String instrument;
    private boolean available;

    // Static variable to count total musicians
    private static int totalMusicians = 0;

    // Constructor
    public Musician(String name, String instrument) {
        this.name = name;
        this.instrument = instrument;
        this.available = true; // Musicians are available by default
        totalMusicians++; // Increment the static counter whenever a new musician is created
    }

    // Record function
    public void record() {
        if (this.available) {
            System.out.println(this.name + " is recording with " + this.instrument);
            this.available = false; // Once recording, the musician is no longer available
        } else {
            System.out.println(this.name + " is currently unavailable.");
        }
    }

    // Function to make the musician available again after a session
    public void finishSession() {
        this.available = true;
        System.out.println(this.name + " has finished their recording session.");
    }

    // Static method to get total number of musicians created
    public static int getTotalMusicians() {
        return totalMusicians;
    }
}
class TrafficLight {
    // Attributes for color and duration
    private String color;
    private int duration; // duration in seconds

    // Constructor to initialize color and duration
    public TrafficLight(String color, int duration) {
        this.color = color;
        this.duration = duration;
    }

    // Method to change the color of the traffic light
    public void changeColor(String newColor) {
        this.color = newColor;
    }

    // Method to get the current color of the traffic light
    public String getColor() {
        return this.color;
    }

    // Method to get the duration of the light
    public int getDuration() {
        return this.duration;
    }

    // Method to check if the light is red
    public boolean isRed() {
        return this.color.equalsIgnoreCase("red"); 
        //  This method from the String class compares two strings while ignoring differences in case (e.g., "RED" is considered equal to "red"
    }

    // Method to check if the light is green
    public boolean isGreen() {
        return this.color.equalsIgnoreCase("green");
    }
}

public class TrafficLightTest {
    public static void main(String[] args) {
        // Create a new TrafficLight object with color red and duration 60 seconds
        TrafficLight light = new TrafficLight("Red", 60);

        // Display initial color and duration
        System.out.println("Current color: " + light.getColor());
        System.out.println("Duration: " + light.getDuration() + " seconds");

        // Change the color to green
        light.changeColor("Green");

        // Display the new color
        System.out.println("New color: " + light.getColor());

        // Check if the light is red or green
        System.out.println("Is it red? " + light.isRed());
        System.out.println("Is it green? " + light.isGreen());
    }
}

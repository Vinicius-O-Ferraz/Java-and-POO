// This class represents a player in a game in a racing game.
class Player {

    // These attributes store the player's kart, wheel, and planner selections.
    String kart = "";
    String wheel = "";
    String planner = "";

    // This method simulates the player accelerating the kart.
    // It prints a message to the console indicating which wheels are being used.
    void accelerate() {
        System.out.println("accelerate " + wheel);
    }
}

// This class is used to test the Player class.
// It creates a Player object, sets its attributes, and calls its accelerate method.
class Scratch {
    public static void main(String[] args) {
        Player Jr = new Player(); // Create a new Player object
        Jr.kart = "Fast";       // Set the player's kart to "Fast"
        Jr.wheel = "Cross";      // Set the player's wheel to "Cross"
        Jr.planner = "Parachute"; // Set the player's planner to "Parachute"

        System.out.println(Jr.kart);  // Print the player's kart selection
        System.out.println(Jr.wheel); // Print the player's wheel selection
        System.out.println(Jr.planner); // Print the player's planner selection

        Jr.accelerate(); // Call the player's accelerate method
    }
}

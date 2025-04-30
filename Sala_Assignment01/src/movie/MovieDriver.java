package movie;

/**
 * @author: Sravya Geethika Sala
 * SID: 574309 
 * Driver class to test the Movie class.
 */

public class MovieDriver {
    public static void main(String[] args) { 
        // Creating Movie objects with title and director name
        Movie movie1 = new Movie("Animal", "Sandeep Reddy Vanga");
        Movie movie2 = new Movie("RRR", "Rajamouli");

        // Setting the duration (in minutes) for each movie
        movie1.setDuration(201);
        movie2.setDuration(187);

        // Displaying movie details
        System.out.println("Movie 1:");
        movie1.displayMovie(); // Calling display method to print movie details

        System.out.println("Movie 2:");
        movie2.displayMovie(); // Calling display method to print movie details
    }
}
